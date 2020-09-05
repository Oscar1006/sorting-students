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
            if (m < agesRows[i].length()){
                String[] separated = agesRows[i].split("// s");
                m = separated.length; 
            }
        }
        //Create the matrix
        double[][] matrix = new double[n][m];
        //Fill the matrix
        for(int i = 0; i < n; i++){
            String[] numbers = agesRows[i].split("// s");
            for(int j = 0; j < numbers.length; j++){
                matrix[i][j] = Double.parseDouble(numbers[j]);
            }
        }
        

    }
}
