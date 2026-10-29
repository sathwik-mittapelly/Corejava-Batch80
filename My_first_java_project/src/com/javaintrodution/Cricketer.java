/*
Java:-
1. Create a Class Name Cricketer Take 
 >instance variables:-cname,jerseyno,highestScore
 > static variables :-boardName,countryName 

Create 4 objects and using the object reference add 4 cricketers data and print the data

*/

package com.javaintrodution; //Lab


class Cricketer {

    // Instance variables
    String cname;
    int jerseyno;
    int highestScore;

    // Static variables
    static String boardName;
    static String countryName;

    public static void main(String[] args) {

        // Assigning values to static variables
        boardName = "BCCI";
        countryName = "India";

        // Creating 4 objects
        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer();
        Cricketer c3 = new Cricketer();
        Cricketer c4 = new Cricketer();

        // Assigning data using object references
        c1.cname = "Virat Kohli";
        c1.jerseyno = 18;
        c1.highestScore = 183;

        c2.cname = "Rohit Sharma";
        c2.jerseyno = 45;
        c2.highestScore = 264;

        c3.cname = "MS Dhoni";
        c3.jerseyno = 7;
        c3.highestScore = 183;

        c4.cname = "Sachin Tendulkar";
        c4.jerseyno = 10;
        c4.highestScore = 200;

        // Printing cricketers' data
        System.out.println("Board Name : " + boardName);
        System.out.println("Country Name : " + countryName);

        System.out.println("\nCricketer 1");
        System.out.println("Name : " + c1.cname);
        System.out.println("Jersey Number : " + c1.jerseyno);
        System.out.println("Highest Score : " + c1.highestScore);

        System.out.println("\nCricketer 2");
        System.out.println("Name : " + c2.cname);
        System.out.println("Jersey Number : " + c2.jerseyno);
        System.out.println("Highest Score : " + c2.highestScore);

        System.out.println("\nCricketer 3");
        System.out.println("Name : " + c3.cname);
        System.out.println("Jersey Number : " + c3.jerseyno);
        System.out.println("Highest Score : " + c3.highestScore);

        System.out.println("\nCricketer 4");
        System.out.println("Name : " + c4.cname);
        System.out.println("Jersey Number : " + c4.jerseyno);
        System.out.println("Highest Score : " + c4.highestScore);
    }
}

