// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 15, Task 1
// Question: Print all subsets of {1, 2, 3} using recursion. At each
// index, first skip the value, then include it. At the end, print
// the subset in braces, for example {1, 3}, and print {} for the
// empty subset.

import java.util.ArrayList;

public class main {
    static void subsets(int[] a, int i, ArrayList<Integer> current) {
        if (i == a.length) {
            System.out.print("{");
            for (int k = 0; k < current.size(); k++) {
                if (k > 0) {
                    System.out.print(", ");
                }
                System.out.print(current.get(k));
            }
            System.out.println("}");
            return;
        }

        // choice 1: skip a[i]
        subsets(a, i + 1, current);

        // choice 2: include a[i]
        current.add(a[i]);
        subsets(a, i + 1, current);

        // undo the choice
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        subsets(a, 0, new ArrayList<Integer>());
    }
}