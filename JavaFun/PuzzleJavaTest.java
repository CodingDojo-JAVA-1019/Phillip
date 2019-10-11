import java.util.*;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava c = new PuzzleJava();

        // c.sumGreater10();

        ArrayList<String> arr1= new ArrayList<String>();
        arr1.add("Nancy");
        arr1.add("Jinichi");
        arr1.add("Fujibayashi");
        arr1.add("Momochi");
        arr1.add("Ishikawa");

        // c.nameShuffle(arr1);

        ArrayList<Character> alphArray= new ArrayList<Character>();
        alphArray.add('a');
        alphArray.add('b');
        alphArray.add('c');
        alphArray.add('d');
        alphArray.add('e');
        alphArray.add('f');
        alphArray.add('g');
        alphArray.add('h');
        alphArray.add('i');
        alphArray.add('j');
        alphArray.add('k');
        alphArray.add('l');
        alphArray.add('m');
        alphArray.add('n');
        alphArray.add('o');
        alphArray.add('p');
        alphArray.add('q');
        alphArray.add('r');
        alphArray.add('s');
        alphArray.add('t');
        alphArray.add('u');
        alphArray.add('v');
        alphArray.add('w');
        alphArray.add('x');
        alphArray.add('y');
        alphArray.add('z');

        // c.alphaShuffle(alphArray);
        // c.sortRandom55();
        System.out.println(c.randString());
    }
}