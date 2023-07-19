import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static String largestNum(int[] nums)
    {
        String[] str = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort( str, (s1, s2) -> (s2+s1).compareTo(s1+s2) );
        if(str[0].charAt(0)=='0'){
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        for(String s:str){
            ans.append(s);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        int n=scanner.nextInt();
        System.out.println("Enter values");
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();

        }
        System.out.println(largestNum(A));
    }
}