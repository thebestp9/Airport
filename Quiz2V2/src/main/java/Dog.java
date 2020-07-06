public class Dog extends Animal{
    String dogname;
    
    public Dog(String ndog){
       dogname = ndog;
    }
    
    @Override
    public void introduceYourself() {
        System.out.println("Woof. I am a dog. My name is " + dogname);
    }
}


