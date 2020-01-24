// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    private String name;
    private double test1;
    private double test2;
    //declare instance data

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        name = studentName;
        test1 = 0;
        test2 = 0;
        //add body of constructor
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the student's score for test 1");
        test1 = input.nextDouble();
        System.out.println("Please enter the student's score for test 2");
        test2 = input.nextDouble();
        //add body of inputGrades
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    public double getAverage() {
    //add header for getAverage
        double ave = (test1 + test2) / 2;
            return ave;
        //add body of getAverage
    }


    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //add header for printName
    public String printName(){
        //add body of printName
        return name;
    }
////////////////////////////////////////////这个地方有问题 printname没有link
    public String toString(){
        return "Name: "+ name + " \n" + "Test1: " + test1 + "\n"+"Test2: "+ test2;
    }
    // toString method:  Output in the following format
    // Name: Joe  Test1: 85  Test2: 91
}
