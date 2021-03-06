import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
    
    public static void fizzBuzz(int n) {
        for(int i = 1; i <= n; i++ ){
            if(i % 15 == 0){
                System.out.print("FizzBuzz"+ "\n");
            }
            else if(i % 5 == 0){
                System.out.print("Buzz"+ "\n");
            }
            else if(i % 3 == 0){
                System.out.print("Fizz" + "\n");
            }
            else{
                System.out.print(i + "\n");
            }
            
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}