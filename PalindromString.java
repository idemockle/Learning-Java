import java.io.*;  
  
public class PalindromString  
{  
	public static void main(String a[]) throws Exception  
	{  
           String strn;  
           int flag=0;  
           System.out.println("Enter the string:");  
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
           strn=br.readLine();  
           System.out.println("Result string is:");  
           //write your logic here  
           
           int charsLength = strn.length();
           
           for (int f = 0, b = charsLength - 1; f < charsLength; f++, b--) {
               if (strn.charAt(f) != strn.charAt(b)) {
                   //flag = 1;
                   System.out.println(f + " " + b);
               }
           }
  
           //end  
           if(flag==1)  
               System.out.print("palindrome");  
           else   
               System.out.print("not a palindrome");  
  
        }  
}  
