public class Cat extends Animal {
    String name;
    
    public Cat (String name){
        this.name = name;
    }
    
    @Override
    public void introduceYourself() {
        System.out.println("Meow. I am a cat. My name is " + name);
        System.out.println("and I am " + age + " years old.");
    }
}

