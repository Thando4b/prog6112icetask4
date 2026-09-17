/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homemakeoverreport;

/**
 *
 * @author Thando
 */
public class HomeMakeoverReport {

    public static void main(String[] args) {
        // 1. Single-dimentional array for months
        String[] months = {"JAN", "FEB", "APR", "MAY", "JUN"};
        // 2. Two-dimentional array for jobs [month][type]
        // Type: 0 = Bathrooms, 1 = Kitchen, 2 = Garden
        int[][] jobs = {
            {8, 2, 5}, //JANUARY
            {7, 4, 2}, //FEBRUARY
            {2, 5, 2}, //MARCH
            {7, 2, 3}, //APRIL
            {7, 7, 9}, // MAY
            {7, 8, 5}, //JUNE
        };
        // 3. Print Report
        System.out.println("-----------------------------------"); 
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("-----------------------------------");
        System.out.printf("%-10s %-15s %-15s %-10s\\n", "", "Bathrooms", "Kitchens", "Garden");
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-10s %-15s %-10d\n", months[i], jobs[i][0], jobs[i][1] + jobs[i][2]);   
        }
        System.out.println("----------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("----------------------------------");
        for (int i = 0; i < months.length; i++) {
            int total = jobs[i][0] + jobs[i][1] + jobs[i][2];
            if (total >= 15) {
                System.out.printf("-%10s %-10d ***\n", months[i], total);
            } else {
                System.out.println("%-10s %-10d\n months[i], total");
            }
        }
        System.out.println("--------------------------------------");
    }
}
