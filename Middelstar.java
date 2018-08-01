package janani;
import java.util.Scanner;
public class Middelstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
int l,c;
System.out.println("enter the string");
Scanner ja=new Scanner(System.in);
str=ja.nextLine();
l=str.length();
c=l/2;
String s1=str.substring(0,c)+"*"+str.substring(c+1);
String s2=str.substring(0,c-1)+"**"+str.substring(c+1);
if(l%2!=0){
	System.out.println(s1);
}
else{
	System.out.println(s2);
}
	}

}
