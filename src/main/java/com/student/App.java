package com.student;

public class App {
    public String calculateStatus(double attended, double total) {
        if (total <= 0) return "Invalid Input";
        
        double percentage = (attended / total) * 100;
        
        // Requirement: Eligibility for exam (>=75%)
        if (percentage >= 75) {
            return "Attendance: " + percentage + "%. Status: Eligible for Exam";
        } else {
            return "Attendance: " + percentage + "%. Status: WARNING - Low Attendance";
        }
    }

    public static void main(String[] args) {
        App analyzer = new App();
        // Example test run
        System.out.println(analyzer.calculateStatus(80, 100));
    }
}