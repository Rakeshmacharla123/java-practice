import java.util.Scanner;
class Reverse{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the string");
String str = sc.nextLine();

String rev="";

for(int i=str.length()-1;i>=0;i--)
{
char ch=str.charAt(i);
rev=rev+str.charAt(i);
}
System.out.println("the reversed string is : "+rev);
}
}