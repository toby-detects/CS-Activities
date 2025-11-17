class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;

            if (age < 18) {
                System.out.println("This person is a MINOR.");
            } else {
                System.out.println("This person is of LEGAL AGE.");
            }

        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class encap_2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);  // Change this value to test
        System.out.println("Age: " + person.getAge());
    }
}
