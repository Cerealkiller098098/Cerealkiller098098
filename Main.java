class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(reverseColumns")
  }
  public static void reverseArray(int[] arr){
    int count =0;
        for(int i=arr.length-1;i>=0;i--){
           arr[count] = arr[i];
           count += 1;
            
        }
  }
  public static void reverse2d(int[][] mat){
    int count =0;
      for (int j = mat.length-1;j>=0;j--){
        count = 0;
        for(int i=  mat[j].length-1;i>=0;i--){
           mat[j][count] = mat[j][i];
           count += 1;
        }
      }
  }
  public static int[][] reverseColumns(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int temp=0;

        int[][] result= new int[rows][cols];

        for (int row=rows-1; row >=0; row--){
            for (int col=0;col<cols;col++){
                result[row][col]=matrix[temp][col];
            }
            temp++;
        }
        return result;
    }
}