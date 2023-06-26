package lv.acodemy.classroom;

import static lv.acodemy.classroom.Sizes.*;

public class ObjectPractice {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        String catName = barsik.getName();

        // name = null;
        System.out.println(catName);
        System.out.println(barsik);


        // name = Barsikfzftw
        barsik.setName("Barsikzftw");
        System.out.println(barsik);

        // age = 5;
        barsik.setAge(5);
        System.out.println(barsik);
        System.out.println("My cat is: " + barsik.getAge() + " years old.");

        // Create getter and setter for weight, color, size;
        // Set data using setters;

        barsik.setWeight(17.60);
        barsik.setColor("gray");
        barsik.setSize(XL);
        System.out.println(barsik);


        Animal ballzik = new Animal(13, "Ballzik");
        // My name is Ballzik. I am 13 years old.
        System.out.printf("My name is %s. I am %d old.\n", ballzik.getName(), ballzik.getAge());
        System.out.println("My name is " + ballzik.getName() + ". I am " + ballzik.getAge() + " years old.");

        // Create All argument constructor;

        Animal zhorik = new Animal(5,6.54, "pure-yellow", XXL, "Zhorik Vartanoff", true);
        System.out.println(zhorik);

        zhorik.speak();
        zhorik.feed("bulka");


        zhorik.speak();
        zhorik.getEnergy();

        zhorik.speak();
        zhorik.speak();
        zhorik.speak();
        zhorik.speak();
        zhorik.getEnergy();

        zhorik.onetwo();

    }
}
