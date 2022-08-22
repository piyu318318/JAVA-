//Given a string str of length N which consists of only 0, 1 or 2s, count the number 
//of substring which have equal number of 0s, 1s and 2s.

import java.util.*;
class Equal0And1And2
{
    public static void main(String[] args) 
    {
        String str = "0102010";
        StringBuffer st1 = new StringBuffer(str); 

        ArrayList <Character> l1 = new ArrayList<Character> (); 
        ArrayList <Character> l2 = new ArrayList<Character> (); 
        l2.add('0');
        l2.add('1');
        l2.add('2');
        
        ArrayList <Character> temp = new ArrayList<Character> ();///        
///     System.out.println(l1);
    
        int count=0;
        int j=0;
        int flag=0;
        for (int i=0;i<st1.length();i++) 
        {
            if(i == st1.length()-2)
            {
                break;
            }

            
            while(count < 3)
            {
                temp.add(str.charAt(j));
                count++;
                j++;
            }

            if(count == 3 )
            {
                Collections.sort(temp);
  //              System.out.println(temp);
  //              System.out.println(l2);

                if(l2.equals(temp) == true)
                {
                    System.out.println((i+1)+" "+j);
                    flag=1;
                    break;
                }
                
            }
            
            if(flag==0)
            {
                temp.clear();
                j=i+1;
                count=0;
            }

            
                

        }

    }
}
