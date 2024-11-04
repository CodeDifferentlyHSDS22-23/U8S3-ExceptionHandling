package partA.ex01;

import java.sql.SQLOutput;

public class Exception {

    public static String badUse(int[] vals) {
        String response = "";
        int total = 0;

        for (int i = 0; i < vals.length; i++) {
            int index = vals[i];
            total += vals[index];
        }
        response += (total);
        return response;
    }

    public static void main(String args[]) {
        int[] nums = {3, 2, 6, 1};
        String output = badUse(nums);
        System.out.println(output);
    }



}
