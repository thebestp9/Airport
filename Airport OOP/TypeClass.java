//Polymorphism Concept
import java.util.Scanner;
public class TypeClass{
    
    public void TwoClass(){
        System.out.println("\nThere are two types of class that the Airline offers which are " );
        System.out.println("1. Economy Class\t\t 2. Business Class " );
    }
}
    
class AirMalClass extends TypeClass{
    public void TwoClass(){
        System.out.println("\nAir Asia and Malindo only have Economy Class only ");
    }
}

class MalayEmiClass extends TypeClass{
    public void TwoClass(){
        System.out.println("\nMalaysia Airlines and Emirates covers both of it, Economy Class and Business Class ");
    }
}