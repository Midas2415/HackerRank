import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    
    public static String timeConversion(String s) {
        
    boolean PM = false;
    if( s.contains("PM") ){
    PM = true;
    }
    
    String onlyTime = s.substring(0,8);
    
    if(PM){
        if(onlyTime.substring(0,2).equals("12") ) {
            return onlyTime;
        }
    
        Integer conversion = Integer.parseInt(onlyTime.substring(0,2) );
        conversion += 12;
        
        if(conversion == 24){
            conversion = 00;
        }
        return conversion + onlyTime.substring(2,8);
    }

    if(onlyTime.substring(0,2).equals("12") ) {
        return "00" + onlyTime.substring(2,8);
    } 
    return onlyTime;
   }

}

public class Solution {
    
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
