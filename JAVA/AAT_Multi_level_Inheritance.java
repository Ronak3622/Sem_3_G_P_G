class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
}
public class AAT_Multi_level_Inheritance {
    public static void main(String [] args){
        BabyDog d = new BabyDog();
        d.bark();
        d.weep();
        d.eat();
    }
}
