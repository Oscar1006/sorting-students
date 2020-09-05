import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = 0;
        int m = 0;
        String ages = "";
        n = Integer.parseInt(s.nextLine());

        for(int i = 0; i < n; i++){
            ages += s.nextLine() + "-";
        }
        String[] agesRows = ages.split("-");
        for(int i = 0; i < n; i++){
            if (m < agesRows[i].length()){
                String[] separated = 
            }
        }
    }
}
