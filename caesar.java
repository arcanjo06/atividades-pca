import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class caesar {
    public static String caesarCipher(String s, int k) {
    k=k%26;
    StringBuffer sb = new StringBuffer();
    for(int i=0; i<s.length(); i++)
    {
        if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122)
        {
            int asc;
            if((int)s.charAt(i)+k>122)
            {
               asc = (int)s.charAt(i)+k-26;
               sb.append((char)asc);
            }
            else
            {
                asc = (int)s.charAt(i)+k;
                sb.append((char)asc);
            }
        }
        else if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
        {
            int asc;
            if((int)s.charAt(i)+k>90)
            {
               asc = (int)s.charAt(i)+k-26;
               sb.append((char)asc);
            }
            else
            {
                asc = (int)s.charAt(i)+k;
                sb.append((char)asc);
            }
        }
        else
        {
            sb.append(s.charAt(i));
        }
        
    }
    
    return sb.toString();

    }
}
