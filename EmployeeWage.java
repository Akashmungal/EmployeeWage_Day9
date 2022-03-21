package com.bridgelabz;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static void employeeMonthlyWage(String company ,int wagePerHour,int workingDays,int workingHours){

        int empHours = 0;
        int totalWorkingDays = 0;
        int totalEmpHours = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        while (totalEmpHours <= workingHours && totalWorkingDays < workingDays){
            totalWorkingDays++;
            switch(empCheck){
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }
            totalEmpHours += empHours;
        }
        System.out.println("total employee working hour - " +totalEmpHours);
        System.out.println("total employee working days - " +totalWorkingDays);

        int totalEmpWage = totalEmpHours * wagePerHour;
        System.out.println("Total employee wage for company : "+company+" is - "+totalEmpWage);
    }

    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Problem");

        employeeMonthlyWage("Reliance",15,25,150);
        employeeMonthlyWage("DMart",20,20,100);

    }
}
