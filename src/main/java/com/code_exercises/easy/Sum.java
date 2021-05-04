package com.code_exercises.easy;
public class Sum {

    int sum(Integer i, Integer j)
    {
        return i+j;
    }
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        Sum s = new Sum();
        int res = s.sum(i, j);
        System.out.println(res);
    }
}
