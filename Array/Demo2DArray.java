public class Demo2DArray{
    public static void main(String[] args) {
        
        // Initialize 2D array with values
        int[][] num = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        
        System.out.println("Using traditional for loop:");
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
         
        System.out.println("\nUsing enhanced for loop:");
        for(int[] row : num){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
