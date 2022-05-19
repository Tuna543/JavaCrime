
package crimemanagement;

import com.email.durgesh.Email;
import java.util.Random;

public class EmailSender {
    
    static String emu(String mail){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        String str=String.valueOf(rand_int1);
        System.out.println(rand_int1);
        try{
            Email email = new Email("type your email address here","type your email_id password here");
            email.setFrom("type your email address here", "Crime Management System");
            email.setSubject("Password change request for Crime Management");
            email.setContent(str, "text/html");
            email.addRecipient(mail);
            email.send();
        }catch(Exception e){
            e.printStackTrace();
        }
        return str;
    }
    public static void main(String[] args){
        String a = emu("");
        System.out.println(a);
    }
}
