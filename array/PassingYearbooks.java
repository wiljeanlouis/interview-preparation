package array;

import java.util.*;

public class PassingYearbooks {

    static int[] findSignatureCounts(int[] arr) {
        // Write your code here
        int[] output = new int[arr.length];

        Set<Integer> visited = new HashSet<>();
        int currentStudent = 1;
        int numberOfStudent = arr.length;

        while (currentStudent <= numberOfStudent) {
            if (!visited.contains(currentStudent)) {

                int nextStudent = currentStudent;
                Set<Integer> studentInSameCycle = new HashSet<>();

                do {
                    visited.add(nextStudent);
                    studentInSameCycle.add(nextStudent);
                    nextStudent = arr[nextStudent - 1];
                } while (nextStudent != currentStudent);

                for(int student : studentInSameCycle) {
                    output[student - 1] = studentInSameCycle.size();
                }
            }
            currentStudent++;
        }

        return output;

    }

    public static void main(String[] args) {
        int[] result = findSignatureCounts(new int[] { 3, 2, 1 });
        print(result);

    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}
