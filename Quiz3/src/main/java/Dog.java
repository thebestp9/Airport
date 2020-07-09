public class Dog extends Animal {
    String name;
    
    public Dog (String name){
        this.name = name;
    }
    
    @Override
    public void introduceYourself() {
        System.out.println("Woof. I am a dog. My name is " + name);
        System.out.println("and I am " + age + " years old.");
    }
}


