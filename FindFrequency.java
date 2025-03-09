import java.util.*;

public class FindFrequency{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    //input 
    System.out.print("Enter the array (Space-seperated numbers): ");
    String input = sc.nextLine();  //Read the full line

    //conver the input string into an integer array\
    String[] inputArr = input.split(" ");
    int[] arr = new int[inputArr.length];

    for (int i = 0; i < inputArr.length; i++) {
        arr[i] = Integer.parseInt(inputArr[i]);  //Convert to int
    }

    //HashMap to store frequency 
    Map<Integer, Integer> freqMap = new HashMap<>(); 

    for (int num : arr) {
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }
    
    //print frequencies

    System.out.println("Element frequencies: ");
    for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
    }

}