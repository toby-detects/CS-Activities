interface Speakable {
    void speak();
}

class Dog implements Speakable {
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Speakable {
    public void speak() {
        System.out.println("Meow!");
    }
}

public class DuckTyping {
    static void makeItSpeak(Speakable obj) {
        obj.speak();
    }

    public static void main(String[] args) {
        makeItSpeak(new Dog());
        makeItSpeak(new Cat());
    }
}

public class poly_2 {
    public static void main(String[] args) {
        DuckTyping.makeItSpeak(new Dog());
        DuckTyping.makeItSpeak(new Cat());
        // DuckTyping.makeItSpeak(123);  // ❌ This will cause an error because 123 is not Speakable
    }
}
