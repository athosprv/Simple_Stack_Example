import java.io.*;
import java.util.*;

public class Solution
{
    public static void run(BufferedReader in, PrintWriter out)
        throws IOException
    {
        Stack st = new Stack();
        int input = Integer.parseInt(in.readLine());

        while(in!=null)
        {            
            if(input==0)
            {
                out.close();
                return;
            }

            for(int i=0; i<input; i++)
                st.add(in.readLine());
            while(!st.empty())
                out.println(st.pop());                

            out.println();
            out.flush();

            input = Integer.parseInt(in.readLine());
        }
   }

}
