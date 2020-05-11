//Inheritance Concept
class Similar{
    int pas = 1000;
    String boeing = "Boeing 737";
    String cBag = "KG";
}
    
    class AirAsia extends Similar{
        String price = "Cheap";
        double bag = 5.0;
    }
    
    class Malindo extends Similar{
        String price = "Cheap";
        double bag = 4.0;
    }
    
    class Malaysia extends Similar{
        String price = "Average";
        double bag = 7.0;
    }
    
    class Emirates extends Similar{
        String price = "Expensive";
        double bag = 10.0;
    }