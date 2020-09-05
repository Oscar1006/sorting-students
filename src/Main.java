import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = 0;
        int m = 0;
        String ages = "";
        n = Integer.parseInt(s.nextLine());
        //Read all values
        for(int i = 0; i < n; i++){
            ages += s.nextLine() + "-";
        }
        //Split the rows
        String[] agesRows = ages.split("-");
        //Get the measure of the longer row
        for(int i = 0; i < n; i++){
            String[] separated = agesRows[i].split(" ");
            if (m < separated.length){
                m = separated.length; 
            }
        }
        //Create the matrix
        double[][] matrix = new double[n][m];
        //Fill the matrix
        for(int i = 0; i < n; i++){
            String[] numbers = agesRows[i].split(" ");
            for(int j = 0; j < numbers.length; j++){
                matrix[i][j] = Double.parseDouble(numbers[j]);
            }
        }
        //Temporal Variable
        double t = 0;

        double[] averages = new double[n];
        ArrayList<Integer> exchanges = new ArrayList<Integer>(); 
        int count = 0;
        double average = 0;
        //Sort Matrix
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m-1; j++){
			
                for(int y = 0; y < m-j-1; y++){
                    if (matrix[i][y] > matrix[i][y+1]){
                        t = matrix[i][y];
                        matrix[i][y] = matrix[i][y+1];
                        matrix[i][y+1] = t;
                        count++; 
                    }
                }
                exchanges.add(count);
                count = 0;
            }
            for (int x = 0; x < exchanges.size(); x++) {
                average += exchanges.get(x);
            }
            average /= exchanges.size();
            averages[i] = average;
            exchanges.clear();
            average = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(averages[i] + "-");
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        s.close();
    }
}