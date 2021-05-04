package com.hackerrank;
import java.util.*;

public class end_of_file {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        String line;
        while(scan.hasNext())
        {
            line = scan.nextLine();
            System.out.println(counter + " " + line);
            counter++;
        }
    }
}
