import java.sql.Array;
import java.util.*;

import static java.lang.System.in;

public class Random {

    public boolean ascendingValue(String values){
        int startingNumber;
        int length = values.length();

        for(int i = 0; i < length / 2; i++){
            StringBuilder newValue = new StringBuilder(values.substring(0, i + 1));
            int number = Integer.parseInt(newValue.toString());
            while (newValue.length()< values.length()){
                number++;
                newValue.append(number);
            }
            if (newValue.toString().equals(values)) return true;



        }

        return false;
    }

    public void squarePatch(int n){

        for(int i = 0; i<n; i++){
            System.out.print("[");

            for(int j = 0; j<n; j++){

                System.out.print(" " + n + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        boolean result = random.ascendingValue("1234");
        System.out.println(result);
        random.squarePatch(3);
    }
}
