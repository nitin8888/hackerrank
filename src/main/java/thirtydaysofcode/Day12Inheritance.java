package thirtydaysofcode;


import java.util.Arrays;
import java.util.Scanner;


enum Grade {
    O(90, 100),
    E(80, 90),
    A(70, 80),
    P(55, 70),
    D(40, 55),
    T(0, 40);

    private final int fromScore;
    private final int toScore;

    Grade(int fromScore, int toScore) {
        this.fromScore = fromScore;
        this.toScore = toScore;
    }

    public int getFromScore() {
        return fromScore;
    }

    public int getToScore() {
        return toScore;
    }
}

class Person {
    private final String firstName;
    private final String lastName;
    private final Integer id;


    Person(String firstName, String lastName, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    void printPerson() {

//        Name: Memelli, Heraldo
//        ID: 8135627
        System.out.println(String.format("Name: %s, %s\nID: %d", lastName, firstName, id));
    }
}

class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, Integer id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public char calculate() {
        // Cal average
        double avg = Arrays.stream(testScores).average().orElse(0);
        return getGrade(avg);
    }

    private char getGrade(double avg) {
        return Arrays.stream(Grade.values()).filter(g -> g.getFromScore() <= avg && avg <= g.getToScore())
                .findAny().map(g -> g.name().charAt(0)).orElse(' ');
    }


    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
}

class Day12Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
