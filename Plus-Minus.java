import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static void plusMinus(List<Integer> arr) {
        // Definimos las variables contadoras de positivos,negativos,zeros.
        float  p_count = 0;
        float  n_count = 0;
        float  z_count = 0;

        /* Recorremos los elementos del vector e identificamos cual es positivo,negativo y como descarte zeros
        y vamos aumentando cada contador segun su condicion. */
        for(int i = 0 ;i < arr.size() ; i++){
            if( arr.get(i) > 0){
                p_count++;
            }
            else if(arr.get(i) < 0){
                n_count++;
            }
            else{
                z_count++;
            }
        }

        // Imprimimos el rango con su porcentaje decimal.
        System.out.println( String.format("%.6f" , (p_count/ arr.size() ) ) ) ;
        System.out.println( String.format("%.6f" , (n_count/ arr.size() ) ) ) ;
        System.out.println( String.format("%.6f" , (z_count/ arr.size() ) ) ) ;
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
