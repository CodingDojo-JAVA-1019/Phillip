import java.util.ArrayList;

public class FirstJavaProgram{
    public static void main(String[] args){
        String hometown;
        hometown = "Austin, TX";
        String name;
        name = "Phillip";
        Integer age;
        age = 36;
        System.out.println("My name is "+ name);
        System.out.println("I am "+ age +" years old.");
        System.out.println("My hometown is "+ hometown+ ".");

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(10);
        array.add(age);
        array.add(15);
    }
}