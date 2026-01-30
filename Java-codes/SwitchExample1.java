import java.util.Scanner;
public class SwitchExample1{
    public static void main(String []args){
    Scanner ab = new Scanner(System.in);
    int a;
    System.out.print("Enter a Number :");
    a = ab.nextInt();
    switch(a){    
    case 1 : System.out.print("HELLO WORLD !!");
        break;
    case 2 : System.out.print("HEllO JAVA ");
        break;
    default : System.out.print("Heeeeyyyyyyyy");
        break;
    }
   
    ab.close();
   
    }

}