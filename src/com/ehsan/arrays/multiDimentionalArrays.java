package com.ehsan.arrays;

public class multiDimentionalArrays {
    public static void main(String[] args) {
        int[][] grid = {
            {2,3,50000},
            {3,4,5},
            {2,4}
        };
        grid[1][2] = 6;
        System.out.println(grid[1][2]);
        System.out.println(grid[0][2]);

        String[][] siteAdmins = new String[2][3];

        siteAdmins[0][0] = "ehsan";

        System.out.println(siteAdmins[0][0]);




    }
}
