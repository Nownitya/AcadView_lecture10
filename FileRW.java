
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class FileRW 
{
    public static void main(String args[]) 
    {
        FileReader fr = null;
        FileWriter fw = null;
        try 
        {
            fr = new FileReader("D:\\Acadview\\Java\\10 lecture\\abc.txt");
            fw = new FileWriter("D:\\Acadview\\Java\\10 lecture\\xyz.txt");
            int c = fr.read();
            while(c!=-1) 
            {
                fw.write(c);
                c = fr.read();
            }
        } 
        catch(IOException e) 
        {
        
        } finally 
        {
            close(fr);
            close(fw);
        }
    }
    public static void close(Closeable stream) 
    {
        try 
        {
            if (stream != null) 
            {
                stream.close();
            }
        } catch(IOException e) 
        {
        
        }
    }
}

