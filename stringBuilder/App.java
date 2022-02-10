package be.intecbrussel.stringBuilder;

public class App {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello World");

        int offset = sb.indexOf("World");
        sb.insert(offset, "Big ");

        System.out.println(sb);

        StringBuilder sentence = new StringBuilder();

        sentence.append("This ")
                .append("is ")
                .append("method ")
                .append("chaining!");
        System.out.println(sentence);

        StringBuilder copy = sentence;

        for (int i = 0;  i< sentence.length(); i++) {
            char upperCaseChar = Character.toUpperCase((sentence.charAt(i)));
            copy.setCharAt(i, upperCaseChar);
        }
        System.out.println("All uppercase: " + sentence);

        String toLowerCase = sentence.toString().toLowerCase();
        sentence = new StringBuilder(toLowerCase);

        System.out.println("Some methods from the String Class are not available " + ", but we can convert to a String object to use them: "+ sentence);

        sentence.reverse();
        System.out.println("Reversed internal value: " + sentence);

        final int CHAR_COUNT = sentence.length();

        for (int i =0; i < CHAR_COUNT; i++){
            copy.deleteCharAt(0);

        }
        System.out.println(copy);
        String firstName = "Aviva";
        String lastName = "Shuman";

        String fullName = firstName + lastName;
        System.out.println("String concatenation: " + fullName);

        fullName = null;
        fullName = new StringBuilder().append(firstName).append(lastName).toString();
        System.out.println("Same result using StringBuilder: " + fullName);
    }
}
