// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 15, Task 3
// Question: Print all arrangements of the letters x and y, one per
// line, using a used[] array: pick a letter that is not used, mark
// it used, fill the next position, then unmark it.

public class main {
    static void arrange(char[] letters, boolean[] used, char[] result, int pos) {
        if (pos == letters.length) {
            System.out.println(new String(result));
            return;
        }

        for (int i = 0; i < letters.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[pos] = letters[i];
                arrange(letters, used, result, pos + 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        char[] letters = {'x', 'y'};
        boolean[] used = new boolean[letters.length];
        char[] result = new char[letters.length];
        arrange(letters, used, result, 0);
    }
}