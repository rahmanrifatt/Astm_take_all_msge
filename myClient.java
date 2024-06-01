import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class myClient {
    public static final Object lock = new Object();
    
    public static void main(String[] args) throws InterruptedException {
        Socket s;
        DataInputStream dis;
        DataOutputStream dos;
    
        ArrayList<String> message = new ArrayList<>();
        message.add(msgeData.cmsge1);
        message.add(msgeData.cmsge2);
        message.add(msgeData.cmsge3);
        message.add(msgeData.cmsge4);
        message.add(msgeData.cmsge5);
        message.add(msgeData.cmsge6);
        message.add(msgeData.cmsge7);
        message.add(msgeData.cmsge8);

        System.out.println(message);

      



       // byte[] byteArrray = cmsge1.getBytes();
        System.out.println("Client has Started.......");
        try {
             s=new Socket("localhost",44444);
             System.out.println("clint connected..");
            dis=new DataInputStream(s.getInputStream());
            dos=new DataOutputStream(s.getOutputStream());

            for (String string : message) {
                byte[] byteArrray = string.getBytes();
                dos.write(byteArrray); 
                
                System.out.println("from server: "+(char)dis.readByte());
            }





            //dos.write(byteArrray);
           // dos.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            System.out.println("this is wn known HostException from client"+" kkkkk "+e);
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("this is wn known IOException from client"+" kkkkk "+e);
            e.printStackTrace();
        }
       
       



        }
    
}













//msge data

 // String cmsge1=""+Astm.ENQ;
        // String cmsge2=""+Astm.STX+"1H"+Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+"ABX"+
        //                 Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+
        //                 Astm.pipe+"P"+Astm.pipe+"E1394-97"+Astm.pipe+"20031118154840"+
        //                 /*Astm.CR+Astm.ETX+*/"59"+Astm.CR+Astm.LF;
        // String cmsge3=""+Astm.STX+"2P"+Astm.pipe+"1"+Astm.pipe+Astm.pipe+"PID12345"+Astm.pipe+
        //                 Astm.pipe+"LASTNAME^FIRSTNAME"+Astm.pipe+Astm.pipe+"19641223"+Astm.pipe+
        //                 "M"+Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+"Prescriptor"+
        //                 Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+
        //                 Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+"Location"+Astm.CR+
        //                 Astm.ETX+"D6"+Astm.CR+Astm.LF;
        // String cmsge4=""+Astm.STX+"3C"+Astm.pipe+"1"+Astm.pipe+"I"+Astm.pipe+"Patient Comment"+
        //                 Astm.pipe+Astm.CR+Astm.ETX+"B8"+Astm.CR+Astm.LF;

        // String cmsge5=""+Astm.STX+"4O"+ Astm.pipe+"1"+Astm.pipe+"2312015"+Astm.pipe+Astm.pipe+
        //                 "^^^13\\^^^29"+Astm.pipe+"R"+Astm.pipe+"20031117"+Astm.pipe+Astm.pipe+
        //                 Astm.pipe+Astm.pipe+"N"+Astm.pipe+Astm.pipe+Astm.pipe+Astm.pipe+"1"+
        //                 Astm.CR+Astm.ETX+"25"+Astm.LF;        
        // String cmsge6=""+Astm.STX+"5C"+Astm.pipe+"1"+Astm.pipe+"I"+Astm.pipe+"Order Comment"+
        //                  Astm.pipe+Astm.CR+Astm.ETX+"E1"+Astm.CR+Astm.LF;    
                         
        // String cmsge7=""+Astm.STX+"6L"+Astm.pipe+"1"+Astm.pipe+"N"+Astm.CR+Astm.ETX+"09"+Astm.CR+Astm.LF;
        // String cmsge8=""+Astm.EOT;







