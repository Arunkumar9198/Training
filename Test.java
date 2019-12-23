import java.lang.*;
import java.util.*;
class Test{
public static void main(String args[])
{
int v=0;
int c=0;
int s=0;
String a;
String b=new String();
Scanner in=new Scanner(System.in);
a=in.nextLine();
int j=0;
for(int i=a.length()-1;i>=0;i--)
{
b=b+a.charAt(i);
j++;
if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
v++;
else if(a.charAt(i)==' ')
s++;
else 
c++;
}
System.out.println(b);
System.out.println("The given string contains"+ v +"vowels and"+ c +"consonants");
}
}
