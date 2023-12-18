import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ex2 {
    public static final int MAX = 5;
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");
        List<Integer> nums = readInput();
        sorting(nums);
        printList(nums);
    }

    public static List<Integer> readInput(){
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
            
        System.out.println("Enter 5 valid integers in the range [0, 10]");
            
        while(nums.size() < MAX) {
            String s = inp.nextLine();
            if(isValid(s)){
                int num = Integer.parseInt(s);
                if(isInRange(num)){
                    nums.add(num);
                }else{
                    System.out.println("Invalid range! Try again!");
                    continue;
                }
            }else{
                System.out.println("Invalid! Try again!");
                continue;
            }
        }
        inp.close();
        return nums;
    }

    public static boolean isValid(String s){
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {      
            return false;
        }
        return true;
    }

    public static boolean isInRange(int num){
        if(num<0 || num > 10) {
            return false;
        }
        return true;
    }

    public static void sorting(List<Integer> nums){
        Collections.sort(nums);
    }

    public static void printList(List<Integer> nums){
        for(int num : nums)
                System.out.print(num+" ");
    }
}