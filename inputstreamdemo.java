import java.io.FileInputStream;
import java.io.InputStream;
//import java.net.SocketPermission;
public class inputstreamdemo {
    
    public static void main(String[] args)
    {
        byte[] array = new byte[100];
        try{
            InputStream input = new FileInputStream("device_specs.txt");
            System.out.println("available byte in the file :"+input.available());
            input.read(array); 
            System.out.println("data read from the file : ");
            String data= new String(array);
            System.out.println(data);
            input.close();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}
