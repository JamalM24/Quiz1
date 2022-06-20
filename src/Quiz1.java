import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num= 1;
        int n = sc.nextInt();
        int[] arr= new int[n];
        while(n<1 || n>20) {
            {
                System.out.print("Please enter a number between 1 and 20");
                n= sc.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){
        arr[i]= (int) Math.pow(2,i);
        System.out.print(arr[i]+" " );
        }
    }


}




