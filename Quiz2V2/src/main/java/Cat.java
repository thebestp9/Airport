public class Cat extends Animal{
    String catname;
    
    public Cat(String ncat){
       catname = ncat;
    }
    
    @Override
    public void introduceYourself() {
        System.out.println("Meow. I am a cat. My name is " + catname);
    }
}

