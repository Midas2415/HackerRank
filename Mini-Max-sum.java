import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    
    public static void miniMaxSum(List<Integer> arr) {
    long sumMin = 0;
    long sumMax = 0;
    
    //funcion Collections.sort para organizar los elementos del arreglo
    Collections.sort(arr);

    /*creamos el for para selecionar los elementos a sumar el -1 es debido a que tomamos 
    solo 4 elementos minimos.*/
    
    for(int i = 0; i< arr.size()-1;i++){
        sumMin +=arr.get(i);
    }
    
    /*creamos el for para selecionar los elementos a sumar solo son 4 elementos              maximos.*/
    
     for(int i = 1; i < 5; i++){
        sumMax +=arr.get(i);
    }
    // Imprimimos en una sola linea nuestro resultado.
    System.out.print(sumMin+" "+sumMax);
  }
}
//
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
