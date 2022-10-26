/*
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.
*/
import java.io.*;
import java.util.*;

class CommonOf3Arrays
{
    public static void main(String args[])
    {
        int A[] = {1, 5, 10, 20, 40, 80};
        int B[] = {6, 7, 20, 80, 100};
        int C[] = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> a1 = new ArrayList();
        ArrayList<Integer> b1 = new ArrayList();  
        ArrayList<Integer> c1 = new ArrayList();
        ArrayList<Integer> commonelement = new ArrayList();  


        int alen = A.length;
        int blen = B.length;
        int clen = C.length; 

        int maxlength;
        int whicharray=0;

        if(alen >blen && alen>clen)
        {
            maxlength = alen;
            whicharray = 1;
        }
        if(blen >alen && blen>clen)
        {
            maxlength = blen;
            whicharray =2;
        }
        if(clen >blen && clen>alen)
        {
            maxlength = clen;
            whicharray =3;
        }

        for (int i=0;i<alen ;i++ ) 
        {
            a1.add(A[i]);
        }

        for (int i=0;i<blen ;i++ ) 
        {
            b1.add(B[i]);
        }

        for (int i=0;i<clen ;i++ ) 
        {
            c1.add(C[i]);
        }

        Collections.sort(a1);
        Collections.sort(b1);
        Collections.sort(c1);

        if(whicharray == 1)
        {
            for (int i=0;i<A.length ;i++ ) 
            {
                int temp = A[i] ;
                if(b1.contains(temp) &&  c1.contains(temp) )
                {
                    commonelement.add(temp);
                }               
            }            
        }

        if(whicharray == 2)
        {
            for (int i=0;i<B.length ;i++ ) 
            {
                int temp = B[i] ;
                if(a1.contains(temp) &&  c1.contains(temp) )
                {
                    commonelement.add(temp);
                }               
            }            
        }


        if(whicharray == 3)
        {
            for (int i=0;i<C.length ;i++ ) 
            {
                int temp = C[i] ;
                if(a1.contains(temp) &&  b1.contains(temp) )
                {
                    commonelement.add(temp);
                }               
            }            
        }

        System.out.println(commonelement);


    }
}