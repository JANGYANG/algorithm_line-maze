/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package line.maze;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // int n =	5;
        // int[] arr1 = {9, 20, 28, 18, 11};
        // int[] arr2 = {30, 1, 21, 17, 28};

        int n =	6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};


        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(n, arr1, arr2)));
        Arrays.asList(s.solution(n, arr1, arr2)).stream().forEach(System.out::println);
    }
}
