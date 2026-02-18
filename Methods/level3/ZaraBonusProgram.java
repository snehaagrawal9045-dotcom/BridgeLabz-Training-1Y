package com.gla.Methods.level3;

public class ZaraBonusProgram {
    // b. Method to generate salary and years of service
    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];
        // Column 0 → Salary
        // Column 1 → Years of Service

        for (int i = 0; i < employees; i++) {

            // Generate 5-digit salary (10000 - 99999)
            data[i][0] = (int)(Math.random() * 90000) + 10000;

            // Generate years of service (1 - 10)
            data[i][1] = (int)(Math.random() * 10) + 1;
        }

        return data;
    }

    // c. Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] oldData) {

        int n = oldData.length;
        double[][] newData = new double[n][3];
        // Column 0 → Old Salary
        // Column 1 → Bonus
        // Column 2 → New Salary

        for (int i = 0; i < n; i++) {

            double salary = oldData[i][0];
            double years = oldData[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;  // 5%
            } else {
                bonus = salary * 0.02;  // 2%
            }

            double newSalary = salary + bonus;

            newData[i][0] = salary;
            newData[i][1] = bonus;
            newData[i][2] = newSalary;
        }

        return newData;
    }

    // d. Method to calculate totals and display in tabular format
    public static void displayReport(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("-------------------------------------------------------------");
        System.out.println("Emp  Old Salary  Years  Bonus     New Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {

            totalOldSalary += newData[i][0];
            totalBonus += newData[i][1];
            totalNewSalary += newData[i][2];

            System.out.printf("%3d  %10.2f  %5.0f  %8.2f  %12.2f\n",
                    (i + 1),
                    newData[i][0],
                    oldData[i][1],
                    newData[i][1],
                    newData[i][2]);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total Old Salary : %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus      : %.2f\n", totalBonus);
        System.out.printf("Total New Salary : %.2f\n", totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        // Generate Data
        double[][] employeeData = generateEmployeeData(employees);

        // Calculate Bonus
        double[][] updatedData = calculateBonus(employeeData);

        // Display Report
        displayReport(employeeData, updatedData);
    }
}
