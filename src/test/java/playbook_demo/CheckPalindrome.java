package playbook_demo;

import java.util.Arrays;
import java.util.Objects;

public class CheckPalindrome {
    public static void main(String[] args) {
     //   System.out.println(checkPalindrome("madam"));
      //  System.out.println(pairProduct(new int[]{3, 6, -2, -5, 7, 3}));

      //  System.out.println(solution(new int[]{6, 2, 3, 8}));
        System.out.println(almostIncreasingSequence(new int[]{10, 1, 2, 3, 4, 5}));
    }

    public static boolean checkPalindrome(String str){
//          String a = "";
//        for (int i = str.length()-1; i >= 0; i--){
//            a = a + str.charAt(i);
//        }
//        return str.equalsIgnoreCase(a);

        var builder = new StringBuffer(str).reverse();
        return str.equalsIgnoreCase(String.valueOf(builder));

    }

    public static int pairProduct(int[] inputArray){

        // soln 1
        int product = inputArray[0] * inputArray[1];

        for (int i = 1; i < inputArray.length-1; i++){
            int temp = inputArray[i] * inputArray[i+1];
            if (temp > product){
                product = temp;
            }
        }
        return product;

        // soln 2

    }

    public static int areaOfPolygon(int n){
        /*
        n = 1; 1 (n-1) square + n
        n = 2; 5
        n = 3; 13
         */

        return (int) (Math.pow(n-1,2) + Math.pow(n,2));
    }

    public  static int solution(int[] statues) {
       int count = 0;
       Arrays.sort(statues);
       for (int i = 1; i < statues.length; i++){
           count += statues[i] -statues[i-1] -1;
       }
       return count;
    }

    public static boolean almostIncreasingSequence(int[] sequence){
        int size = sequence.length;
        int counter = 0;

        if (size == 2) return  true;
        for (int i = 0; i < size-1; i++){
            if (sequence[i+1] <= sequence[i]){
                counter++;
                boolean skipNeighbor = i +2 < size && sequence[i+2] <= sequence[i];
                boolean skipBack = i-1 >= 0 &&  sequence[i+1] <= sequence[i-1];
                if (skipNeighbor && skipBack || counter >=2) return  false;
            }
        }
        return true;
    }
}
