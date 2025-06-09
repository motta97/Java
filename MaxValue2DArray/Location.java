public class Location {
    public int row,col;
    public double maxValue;
    public double[][] arr ;
    Location(int row,int col,double maxValue){
        this.col=col;
        this.row=row;
arr = new double[row][col];
this.maxValue= maxValue;
    }


    public void setter(int rowIndex,int colIndex,double val){
        this.arr[rowIndex][colIndex]=val;
    }



}
