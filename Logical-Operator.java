import java.util.Scanner;

class logicaloperator {
    public static void main (String[] args) {
    Scanner myObj = new Scanner (System.in);
    
    System.out.println("What is your name?");
    String name = myObj.nextLine(); 
    System.out.println("Hello " + name);
    System.out.println("What is your grade?");
    float grade = myObj.nextFloat();
    
    if(grade <= 0 || grade > 100) {
        System.out.println("Invalid Score.");
    } else if (grade >= 90) {
        System.out.println("A");
    } else if (grade >= 80) {
        System.out.println("B");
    } else if (grade >= 70) {
        System.out.println("C");
    } else if (grade >= 60) {
        System.out.println("D");
    } else {
        System.out.println("F");
    }
    myObj.close();
    }
}
