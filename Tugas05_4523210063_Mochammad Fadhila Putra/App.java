public class App {
    public static void main(String[] args) {
        // Spider
        Spider mySpider = new Spider();
        mySpider.eat();

        // Dog
        Dog myDog = new Dog("Max");
        myDog.setName("Buddy");
        System.out.println("Nama anjing: " + myDog.getName());
        myDog.play();
        myDog.eat();
        myDog.walk();

        // Cat
        Cat myCat = new Cat("Whiskers");
        System.out.println("Nama kucing: " + myCat.getName());
        myCat.play();
        myCat.eat();
        myCat.walk();
    }
}
