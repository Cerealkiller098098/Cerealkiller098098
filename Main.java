class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] array1= {1,2,3,4};
    int[][] test1 ={{1,2,3},{4,5,6},{7,8,9}};
    reverse2d(test1);
    
    for (int i=0; i < test1.length;i++){ 
      for (int j = 0; j<test1[i].length;j++){
              System.out.println(test1[i][j]); 
      }
    }
    
  }
  public static void reverseArray(int[] arr){
    int count =arr.length-1;
    for(int i=0;i<arr.length/2;i++){
          int temp = arr[i];
          arr[i] = arr[count-i];
          arr[count-i] = temp;
            
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
  public static int[][] findspaces(String[][] sentences){
    int[][] newone = {};
    for(int i = 0; i<sentences.length;i++){
      int count = 0;
      for(int j = 0;j < sentences[i].length;j++){
        int[] adding_array = {};
        if(sentences[i][j].equals(" ")){
          //add counter to array;
          
        }
      }
      //add the adding array to newone
    }
    return newone;
  }
  public static int[][] findwords(String[][] sentences){
    int[][] newone = {};
    for(int i = 0; i<sentences.length;i++){
      int count = 0;
      for(int j = 0;j < sentences[i].length;j++){
        int[] adding_array = {};
        if(!sentences[i][j].equals(" ")){
          for(int index = j; index < sentences[i].length;index++){
            
          }
          
        }
      }
      //add the adding array to newone
    }
    return newone;
  }
  public static int[][] breakdown(String[][] sentences){
    int[][] newone = {};
    for(int i = 0; i<sentences.length;i++){
      int count = 0;
      int point = 0;
      for(int j = 0;j < sentences[i].length;j++){
        int[] adding_array = {};
        if(sentences[i][j].equals(" ")){
          // add setences[i].subString(point,count)
          //point = count
          
        }
        count +=1;
      }
      //add the adding array to newone
    }
    return newone;
  }
}