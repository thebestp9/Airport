//Encapsulation Concept
import java.util.Scanner;
class UserInfo{
    
    Scanner in = new Scanner (System.in);
    private String uName;
    private String eMail;
    private String pWord;
    
    public void setName (String newName){
        uName = newName;
        System.out.print("Enter your name\t\t: ");
        uName = in.nextLine(); 
    }
    
    String getName(){
        return uName;
    }
    
    public void setMail (String newMail){
        eMail = newMail;
        System.out.print("Enter your email\t\t: ");
        eMail = in.nextLine(); 
    }
    
    String getMail(){
        return eMail;
    }
    
     public void setPWord (String newPWord){
        pWord = newPWord;
        System.out.print("Enter your password\t: ");
        pWord = in.nextLine(); 
    }
    
    String getPWord(){
        return pWord;
    }
}
