public class solution {
	public static void print2DArray(int[][] input,int row,int n) {
        // Write your code here
        if (row==input.length-1){
            for (int i=0;i<input[0].length;i++){
                System.out.print(input[row][i]+" ");
            }
        }
        else if (input.length>n+row){
            for (int i=0;i<input[0].length;i++){
                System.out.print(input[row][i]+" ");
            }
            System.out.println();
            print2DArray(input,row,++n);
        }
        else if (input.length==n+row) {
            print2DArray(input,++row,0);
        }
    }
    public static void print2DArray(int[][] input) {
        // Write your code here
        print2DArray(input,0,0);
	}
}