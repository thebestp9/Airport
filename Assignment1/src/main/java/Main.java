//start of main method
public class Main{
    public static void main (String[] args) throws InterruptedException{ //InterruptedException is for the Thread.sleep to function
    
        UserInfo u = new UserInfo();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("_____________Welcome to the KLIA International Airport._____________");
            //Thread.sleep(2000);
            
                u.setName("");     //Encapsulation in the UserInfo class
                u.setMail("");     //Encapsulation in the UserInfo class
                u.setPWord("");    //Encapsulation in the UserInfo class
        
        //Inheritance Concept   
        AirAsia sim = new AirAsia();                          
        Malindo sim2 = new Malindo();
        Malaysia sim3 = new Malaysia();
        Emirates sim4 = new Emirates();
        
        //System.out.printf("\nAir Asia take a maximum of %d passengers\nand using %s \n" , sim2.pas , sim2.boeing);
        //System.out.printf("\nEmirates take a maximum of %d passengers\nand using %s \n" , sim3.pas , sim3.boeing);
            
            //using format specifiers to make it easier to edit
            System.out.printf("\nThe similarities of all the Airlines are they take a maximum of %d passenger\nand using the same type of Aircraft, which is the %s \n" , sim.pas , sim.boeing);
                //Thread.sleep(4000);
            System.out.printf("\nAir Asia price is %s and it carry a maximum of %.2f%s of luggage per passenger \n" , sim.price , sim.bag , sim.cBag);
                //Thread.sleep(4000);
            System.out.printf("\nMalindo Air price is %s and it carry a maximum of %.2f%s of luggage per passenger \n" , sim2.price , sim2.bag , sim2.cBag);
                //Thread.sleep(4000);
            System.out.printf("\nMalaysia Airlines price is %s and it carry a maximum of %.2f%s of luggage per passenger \n" , sim3.price , sim3.bag , sim3.cBag);
                //Thread.sleep(4000);
            System.out.printf("\nEmirates price is %s and it carry a maximum of %.2f%s of luggage per passenger \n" , sim4.price , sim4.bag , sim4.cBag);
                //Thread.sleep(5000);
        
        
        PlaneInfo p = new PlaneInfo();//creating variable p of PlaneInfo object from the PlaneInfo class
            System.out.println("\nThese are the currently available airlines for today\n ");
            //Thread.sleep(2000);
                
            System.out.println("Please choose one of the following by entering the designated number for each Airlines: ");
            System.out.println(" 1 : Air Asia\t 2 : Malindo Air\t 3 : Malaysia Airlines\t 4 : Emirates");
                p.numAns("" , ""); //calling the method in the PlaneInfo Class
                
            System.out.println("\nPlease Standby for your data....");
            //Thread.sleep(3000);
                
        
        System.out.println("\n_____________PASSENGER'S DATA_____________");
        System.out.println("Name \t\t\t: " + u.getName());        //calling the method to get the previous data that we have entered
        System.out.println("Email \t\t\t: " + u.getMail());         //calling the method to get the previous data that we have entered
        System.out.println("Type of Airlines\t: " + p.getPlane());    //calling the method to get the previous data that we have choosen
        System.out.println("Runway \t\t\t: " + p.getRunway());      //calling the method to get the previous data that is formatted with the ans variable in the PlaneInfo class
        System.out.println("Type of Class \t\t: " + p.proClass);      //getting the proClass data from the PlaneInfo class
        System.out.println("__________________________________________");
        
        System.out.println("\n_____________HAVE A SAVE FLIGHT!!_____________");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}