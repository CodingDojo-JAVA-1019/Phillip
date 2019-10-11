import java.util.*;
import java.lang.Math;

public class PuzzleJava{

    public ArrayList<Integer> sumGreater10(){
        int sum=0;
        int[] arr={3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> newArr= new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if( arr[i] > 10){
                newArr.add(arr[i]);
            }
        }
        System.out.println("The sum is: "+sum);
        for( int i=0; i<newArr.size(); i++){
            System.out.println(newArr.get(i));
        }
        return newArr;
    }

    public ArrayList<String> nameShuffle(ArrayList<String> arr1){
        ArrayList<String> newArr1 = new ArrayList<String>();
        Collections.shuffle(arr1);
        for(String name:arr1){
            System.out.println(name);
            if(name.length() > 5){
                newArr1.add(name);
            }
        }
        return newArr1;
    }

    public ArrayList<Character>  alphaShuffle(ArrayList<Character> arr){
        ArrayList<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        Collections.shuffle(arr);
        Character first = arr.get(0);
        Character last = arr.get(25);
        System.out.println(arr.get(25));
        System.out.println(arr.get(0));
        if (vowels.contains(first) ){
            System.out.println("The first letter is a vowel: "+first);
        }
        else{
            System.out.println("The first letter is not a vowel: "+first);
        }
        return arr;
    }
    public ArrayList<Integer> random55(){
        Random r = new Random();
        ArrayList<Integer> randArr = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            randArr.add(r.nextInt((100-55)+1)+55);
            System.out.println(randArr.get(i));
        }
        return randArr;
    }

    public ArrayList<Integer> sortRandom55(){
        Random r = new Random();
        ArrayList<Integer> randArr = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            randArr.add(r.nextInt((100-55)+1)+55);
        }
        Collections.sort(randArr);
        for( int i=0; i<randArr.size(); i++){
            System.out.println(randArr.get(i));
        }
        return randArr;
    }
    public String randString(){
        String AlphaChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder newString = new StringBuilder(5);
        for(int i=0; i<5; i++){
            int index = (int) (AlphaChar.length()*Math.random());
            newString.append(AlphaChar.charAt(index));
        }
        return newString.toString();
    }
}