public class Gorilla extends Mammal{
    public Gorilla(String name){
        this.name=name;
    }
    public void throwSomething(){
        this.energyLevel-=5;
        System.out.println("The gorilla threw something!");
    }
    public void eatBananas(){
        this.energyLevel+=10;
        System.out.println("The gorilla ate something!");
    }
    public void climb(){
        this.energyLevel-=10;
        System.out.println("The gorilla climbed something!");
    }
}