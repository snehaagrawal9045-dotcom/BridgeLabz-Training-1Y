import java.util.StringTokenizer;
class Demo6{
public static void main(String[] args){

String str = "Java is easy ";

StringTokenizer st = new StringTokenizer(str);

while(st.hasMoreTokens()) {
System.out.println(st.nextToken());
}
}
}
 