public class StringManipulatorTest{
    public static void main(String[] args) {
        
    
    StringManipulator manipulator = new StringManipulator();

    String str = manipulator.trimAndConcat("   Hello    ", "   World   ");
    System.out.println(str);

    Integer a = manipulator.getIndexOrNull("codingd", 'd');
    System.out.println(a);

    String word = "Hello";
    String subString = "llo";
    String notSubString= "world";
    Integer a1 = manipulator.getIndexOrNull(word, subString);
    Integer b = manipulator.getIndexOrNull(word, notSubString);
    System.out.println(a1);
    System.out.println(b);
    
    String word1= manipulator.concatSubString("Hello", 1, 2, "world");
    System.out.println(word1);

}
}