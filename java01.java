import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStream;
import java.io.InputStreamReader;
// import java.io
import java.util.StringTokenizer;

class java01
{
    public static void main (String[] args) throws IOException
    {
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        String str = br.readLine();
        // long a = Long.parseLong(str);
        // System.out.println(a+2);

        StringTokenizer st = new StringTokenizer(str," ");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}