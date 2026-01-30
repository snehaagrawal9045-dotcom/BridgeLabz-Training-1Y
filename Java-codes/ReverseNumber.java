import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = scanner .nextInt();
        int originalNum = num;
        int reverseNum =0;
        int remainder;
        while(num != 0){
            remainder = num %10;
            reverseNum = reverseNum*10 + remainder;
            num /= 10;

        }
        if(originalNum == reverseNum){
        System.out.println(originalNum + "reverseNum.");

        }
        else{
        System.out.println(originalNum + " not reverseNum.");
        }
        scanner.close();
    }
}