// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");
        //create student2, "Mike"

        student1.inputGrades();
        //input grades for Mary

        System.out.println(student1);
        //print Mary

        System.out.println("Average: " + student1.getAverage());
        System.out.println();
        //use getAverage to calculate & print average for Mary

        student2.inputGrades();
        //input grades for Mike

        System.out.println(student2);
        //print Mike

        System.out.println("Average: " + student2.getAverage());
        //use getAverage to calculate & print average for Mike

    }
}

