package be.intecbrussel.formatter;

import java.util.Formatter;

public class App {
    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        String text = "I'm %d years old!";
        formatter.format(text, 54);

        System.out.println(formatter);

        text = "I'm %d years old and I'm %.2f m tall.";
        formatter.format(text, 54, 1.52);

        System.out.println(formatter);


        formatter.close();

        //also possible
        System.out.printf("I'm %d years old and I'm %.2f m tall.", 54, 1.52);


    }
}
