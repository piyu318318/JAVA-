
import java.io.*;
class Adsul {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        if(n%3 == 0)
        {
            
            System.out.print("fizz");
        }
        if(n%5 == 0)
        {
            System.out.print("buzz");
        }   
        
    }
    
    
    
}