package main.java.com.example.javamavenjunithelloworld;

public class Utility {
    public static void main(String[] args) {
        int year = 2024;
        abhinav();
        System.out.println("Is " + year + " a leap year? " + isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void abhinav() {
        System.out.println("I am Abhinav");
    }
}
