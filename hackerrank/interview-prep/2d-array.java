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
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        int rowLimit = 4;
        int colLimit = 4;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < rowLimit; i++) {
            for (int j = 0; j < colLimit; j++) {

                // row 1 -> [i][j], [i][j+1], [i][j+2]
                // row 2 -> [i+1][j+1]
                // row 3 -> [i+2][j], [i+2][j+1], [i+2][j+2]
                int hourglassSum = (
                    // row 1
                    arr.get(i).get(j) + arr.get(i).get(j+1) +
                    arr.get(i).get(j+2) +
                    // row 2
                    arr.get(i+1).get(j+1) +
                    // row 3
                    arr.get(i+2).get(j) + arr.get(i+2).get(j+1) +
                    arr.get(i+2).get(j+2)
                );

                if (hourglassSum > max) {
                    max = hourglassSum;
                }
            }
        }

        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
