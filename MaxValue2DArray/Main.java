import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        double val;
        Location location = new Location(row,col,0) ;
        System.out.println("Enter the Array: ");
        for(int i = 0 ;i<row;i++){
            for(int j= 0;j<col;j++){
                val = scanner.nextDouble();
                location.setter(i,j,val);

            }
            System.out.println();
        }
        Location maxLocation = locateLargest(location);
        System.out.println("the largest element is "+maxLocation.maxValue+" and it's at "+maxLocation.row+", "+maxLocation.col);




    }
    public static Location locateLargest(Location location){
        double max = location.arr[0][0];
        int rowM=1,colM=1;
        for(int i = 0 ;i<location.row;i++){
            for(int j= 0;j<location.col;j++){
               if(location.arr[i][j]>=max){
                   max = location.arr[i][j];
                   rowM=i;
                   colM=j;
               }

            }

        }
        return  new Location(rowM,colM,max);
    }



}


