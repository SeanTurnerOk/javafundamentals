public class Bat extends Mammal{
    public Bat(String name){
        this.name=name;
        this.energyLevel=300;
    }
    public void fly(){
        System.out.println("Scree!!");
        this.energyLevel-=50;
    }
    public void eatHuman(){
        this.energyLevel+=25;
    }
    public void attackTown(){
        System.out.println("Our town is on fire!");
        this.energyLevel-=100;
    }
}