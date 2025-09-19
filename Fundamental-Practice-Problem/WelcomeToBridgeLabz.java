import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.compose import ColumnTransformer
from sklearn.preprocessing import OneHotEncoder
from sklearn.ensemble import RandomForestRegressor
from sklearn.pipeline import Pipeline
from sklearn.metrics import mean_absolute_error, r2_score
import pickle

CSV_PATH = "popular_ecomm_marketplace-Ecommerce__20231001_20231031_sample (1).csv"  # keep the name as in your folder

// # --- Load
df = pd.read_csv(CSV_PATH)

// # --- Keep only columns we need (these exist in your file)
use_cols = ["List Price", "Sale Price", "Discount Percentage", "Brand"]
df = df[use_cols].copy()

// # --- Convert to numeric where needed
for col in ["List Price", "Sale Price", "Discount Percentage"]:
    df[col] = pd.to_numeric(df[col], errors="coerce")

// # --- Fix Sale Price values that look 1000x too large (e.g., 295295 instead of 295)
mask = df["Sale Price"].notna() & df["List Price"].notna()
too_big = mask & (df["Sale Price"] > 10 * df["List Price"])
df.loc[too_big, "Sale Price"] = df.loc[too_big, "Sale Price"] / 1000.0

// # --- Drop bad rows
df = df.dropna(subset=["List Price", "Discount Percentage", "Sale Price", "Brand"])
df = df[(df["List Price"] > 0) & (df["Sale Price"] > 0)]

if len(df) < 20:
    print(f"Warning: only {len(df)} usable rows after cleaning. "
          "Model will still train, but add more data if possible.")

// # --- X / y
X = df[["List Price", "Discount Percentage", "Brand"]]
y = df["Sale Price"]

// # --- Preprocess: OneHotEncode Brand, passthrough numeric features
preprocess = ColumnTransformer(
    transformers=[
        ("brand", OneHotEncoder(handle_unknown="ignore", min_frequency=0.02), ["Brand"]),
        ("num", "passthrough", ["List Price", "Discount Percentage"]),
    ]
)

// # --- Model
model = Pipeline(steps=[
    ("prep", preprocess),
    ("rf", RandomForestRegressor(n_estimators=200, random_state=42))
])

// # --- Train / evaluate
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)
model.fit(X_train, y_train)
preds = model.predict(X_test)
mae = mean_absolute_error(y_test, preds)
r2 = r2_score(y_test, preds)

print(f"Rows used: {len(df)}")
print(f"MAE: {mae:.2f}")
print(f"R^2: {r2:.3f}")

// # --- Save model
with open("model.pkl", "wb") as f:
    pickle.dump(model, f)
print("Saved model -> price_model.pkl")
