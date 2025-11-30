
// Write a Java program where the "Cat" class includes a method to set a cat's breed
class Cat1 {
    String breed;

    void catBreed(String breed){
        this.breed = breed;
    }

    void display(){
        System.out.println("Breed : " + breed);
    }

    public static void main(String[] rounak){
        Cat1 c1 = new Cat1();
        Cat1 c2 = new Cat1();
        Cat1 c3 = new Cat1();

        c1.catBreed("jpersian");
        c2.catBreed("bengal");
        c3.catBreed("ragdoll");

        c1.display();
        c2.display();
        c3.display();
    }
    
}
