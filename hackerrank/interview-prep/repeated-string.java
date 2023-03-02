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

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        if (s.equals("a")) {
            return n;
        }

        long counterA = countCharOccurence(s, 'a');

        long repeatedManyTimesFloor = (long) Math.floor((n / s.length()));
        long repeatedManyTimesCeil = (long) (n + s.length() - 1) / s.length();
        long modulo = n - ((long) s.length() * repeatedManyTimesFloor);

        System.out.println(repeatedManyTimesCeil);
        System.out.println(modulo);

        long counterB = countCharOccurence(
            s.substring(0,  (int) modulo), 'a');

        return counterA * repeatedManyTimesFloor + counterB;
    }

    public static long countCharOccurence(String s, char c) {
        long counter = 0;
        int ptrIndex = 0;

        while (ptrIndex != -1) {
            ptrIndex = s.indexOf(c, ptrIndex);

            if (ptrIndex != -1) {
                counter ++; ptrIndex++;
            }
        }

        return counter;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
