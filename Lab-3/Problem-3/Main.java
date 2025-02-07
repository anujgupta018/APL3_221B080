abstract class Duck{
    public void swim(){
        System.out.println("I can Swim");
    }   
    public abstract void fly();
    public abstract void quack();
}
class RubberDuck extends Duck{
    @Override
    public void fly(){
        System.out.println("I can't fly");
    }
    @Override
    public void quack(){
        System.out.println("I squeak");
    }
}
class WoodenDuck extends Duck{
    @Override
    public void fly(){
        System.out.println("I can't fly");
    }
    @Override
    public void quack(){
        System.out.println("I am mute");
    }
}
class RedHeadDucks extends Duck{
    @Override
    public void fly(){
        System.out.println("I fly");
    }
    @Override
    public void quack(){
        System.out.println("I quack");
    }
}
class LakeDucks extends Duck{
    @Override
    public void fly(){
        System.out.println("I can fly");
    }
    @Override
    public void quack(){
        System.out.println("I quack");
    }
}
class Main{
    public static void main(String[] args){
        Duck rubberDuck=new RubberDuck();
        System.out.println("For RubberDuck");
        rubberDuck.swim();
        rubberDuck.fly();
        rubberDuck.quack();
        
        Duck woodenDuck=new WoodenDuck();
        System.out.println("For WoodenDuck");
        woodenDuck.swim();
        woodenDuck.fly();
        woodenDuck.quack();
        
        Duck redHeadDucks=new RedHeadDucks();
        System.out.println("For Red-HeadDucks");
        redHeadDucks.swim();
        redHeadDucks.fly();
        redHeadDucks.quack();
        
        Duck lakeDucks=new LakeDucks();
        System.out.println("For LakeDucks");
        lakeDucks.swim();
        lakeDucks.fly();
        lakeDucks.quack();
    }
}