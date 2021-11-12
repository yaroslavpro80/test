import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double[] result = {0,0,0};
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                result[0]+=1;
            }else if (arr[i]<0){
                result[1]+=1;
            } else {
                result[2]+=1;
            }
        }
        for (int i=0;i<result.length;i++){
            result[i]/=arr.length;
        }
        print(result);
    }

    static void print(double[] arr) {
        String output;
        for (int i=0;i<arr.length;i++){
            output = String.format("%.6f", arr[i]);
            System.out.println(output);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
        int arr1[] = Arrays.copyOf(arr,arr.length);
        //Arrays.asList(arr1);
        ArrayList<Integer> list = new ArrayList<>(); //collect(Collectors.);
        list.addAll(Arrays.stream(arr1).boxed().collect(Collectors.toList()));
        list.sort((a,b)->a-b);
        list.forEach(a->System.out.println(a));

        i++
    }
}
