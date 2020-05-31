import java.util.Scanner;
public class PlaneInfo{
    
    Scanner in = new Scanner (System.in);
    String [] p = {"Air Asia" , "Malindo Air" , "Malaysia Airlines" , "Emirates" , "Economy Class" , "Business Class"};
    private String plane = "";
    private String runway = "";
    String proClass = "";
    
    public void numAns(String newPlane, String newRunway){
    plane = newPlane;
    runway = newRunway;
    int ans;
    
    do
    {
        ans = in.nextInt();
        switch (ans)
        {
            case 1 : System.out.print("You have picked " + p[0]);
                     plane = p[0];
                     runway = "West Runway";
                     proClass = p[4];
                break;
            case 2 : System.out.print("You have picked " + p[1]);
                     plane = p[1];
                     runway = "East Runway";
                     proClass = p[4];
                break;
            case 3 : System.out.print("You have picked " + p[2]);
                     plane = p[2];
                     runway = "North Runway";
                     proClass = (p[4] + " and " + p[5]);
                break;
             case 4 : System.out.print("You have picked " + p[3]);
                     plane = p[3];
                     runway = "South Runway";
                     proClass = (p[4] + " and " + p[5]);
                break;
             default : System.out.print("Invalid Number!!\n");
                break;
        }
    }
    while (ans > 4 || ans <=0);
    }
    
    public String getPlane(){
        return plane;
    }
    
    public String getRunway(){
        return runway;
    }
}
