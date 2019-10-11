import java.util.*;

public class Basic13{

    public ArrayList<Integer> print255(){
        ArrayList<Integer> newArr = new ArrayList<Integer>;
        for(int i=1; i<=255; i++ ){
            System.out.println(i);
            newArr.add(i);
        }
        return newArr;
        
    }

    public int printOdd255(){
        int temp = 0;
        for(int i=1; i<=255; i+=2 ){
            System.out.println(i);
        }
        return temp;
    }

    public Integer printSum255(){
        
        int sum = 0;
        for(int i=1; i<=255; i++ ){
            sum += i;
            System.out.println("New Number: "+i+ " Sum: "+sum);
        }
        return sum;
    }

    public Integer[] iterateArray(Integer[] arr){
        
        for (int i=0; i<arr.length; i++ ){
            System.out.println(arr[i]);
        }
        return arr;
    }

    public int[] findMax(int[] arr){
        int max = arr[0];
        for (int i=0; i<arr.length; i++ ){
            if( max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        return arr;
    }

    public int[] getAverage(int[] arr){
        int sum = arr[0];
        for (int i=0; i<arr.length; i++ ){
            sum+= arr[i];
            }
        double Avg = sum / arr.length;
        System.out.println(Avg);
        return arr;
    }

    public ArrayList<Integer> arrayOdd255(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i=1; i<=255; i+=2 ){
            myArray.add(i);
        }
        return myArray;
    }

    public int greaterThanY(int[] arr, int val){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > val){
                count+=1;
            }
        }
        return count;
    }

    public int[] squareValues(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]*arr[i];
            System.out.println(arr[i]);
        }
        return arr;
    }

    public int[] removeNegatives(int[] arr){
        for( int i=0; i<arr.length; i++){
            if( arr[i] < 0 ){
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
        return arr;
    }

    public String [] maxMinAvg(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i]< min){
                min=arr[i];
            }
            sum+=arr[i];
        }
        double avg = sum / arr.length;
        String [] nwArray = {"The min val is: "+min, "The max val is: "+max, "The average is: "+avg };
        System.out.println(nwArray[0]);
        System.out.println(nwArray[1]);
        System.out.println(nwArray[2]);
        return nwArray;
    }

    protected int[] shiftValues(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            arr[i]=arr[i+1];
            System.out.println(arr[i]);
        }
        return arr;
    }

}