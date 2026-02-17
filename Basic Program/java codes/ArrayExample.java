import java.util.Scanner;
class ArrayExample{
public static void main(){
Scanner sc = new Scanner(System.in);
int marks[] = {10,20,30,40,50};
System.out.println("Using for each loop");
for(int i : marks){
    System.out.println("" +i);
}
System.out.println("marks");
for (int i=0 ; i<marks.length;i++){
System.out.println(marks[i]);


}

}
}

