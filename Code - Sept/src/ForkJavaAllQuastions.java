/*8. The Pattern Matcher - Java 
Easy Accuracy: 25.66% Submissions: 5370 Points: 2
You are given a string s of x and y. You need to verify whether the string follows the pattern xnyn. That is the string is valid only if equal number of ys follow equal number of xs.
As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.

Example 1:

Input:
xxyy

Output:
1
Example 2:

Input:
xyx

Output:
0
Your Task:

Since this is a function problem, you don't need to take any input. Just complete the function follPatt(string s) that outputs 1 if string is valid, else it outputs 0.

Constraints:
1 <= |s| <=100

Topic Tags
 Java-Strings
Related Courses
 Full Stack Development Fork Java Placement 100 JAVA Backend Development - Live

If you are facing any issue on this page. Please let us know.

For Input:
xxyy

your output is: 
1
*/

class ForkJavaAllQuastions{
    
    static void follPatt(String s)
    {
        
        int x_count=0;
        int y_count=0;
        boolean flag=false;
        
        
       for(int i=0;i<s.length();i++)
       {
           
           if(s.charAt(i)=='x')
           {
               x_count++;//Incrementing count of x
           }
           else
           {
               while(i<s.length()&&s.charAt(i)=='y')
               {
                   y_count++;//Incrementing count of continous y after x
                   i++;
               }
               i--;
               
               if(x_count==y_count)//if count of x and count of y are eqaul then 
               {                   //then making them zero
                   x_count=y_count=0;
               }
               else//making flag=true and breaking out of the loop
               {
                   flag=true;
                   break;
               }
           }
         
       }
       
      //printing 1 if flag is true
      //and count of x and y are equal
      if(flag==false&&x_count==y_count)
      System.out.print("1");
      else//else printing 0
      System.out.print("0");;
       
      System.out.println();
    }
}
