/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Bharatvanshi{
    public abstract void fight();
    public abstract void obey();
}
class Pandavs extends Bharatvanshi{
    private String name;
    public Pandavs(String name){
        this.name=name;
    }
    @Override
    public void fight(){
        System.out.println(name+" is a skilled fighter");
    }
    @Override
    public void obey(){
        System.out.println(name+" is obedient");
    }
    public void kind(){
        System.out.println(name+" is kind");
    }
}
class Kauravs extends Bharatvanshi{
    private String name;
    public Kauravs(String name){
        this.name=name;
    }
    @Override
    public void fight(){
        System.out.println(name+" is a fighter");
    }
    @Override
    public void obey(){
        System.out.println(name+" is disobedient");
    }
    public void cruelty(){
        System.out.println(name+" is cruel");
    }
}
class Vikarn extends Kauravs{
    public Vikarn(){
        super("Vikarn");
    }
    @Override
    public void obey(){
        System.out.println("Vikarn is obedient");
    }
    @Override
    public void cruelty(){
        System.out.println("Vikarn is cruel but less than the other Kauravs");
    }
    public void kind(){
        System.out.println("Vikarn is kind");
    }
}
public class Main{
    public static void main(String[] args){
        Pandavs arjun=new Pandavs("Arjun");
        Pandavs bheem=new Pandavs("Bheem");
        
        Kauravs duryodhan=new Kauravs("Duryodhan");
        Vikarn vikarn=new Vikarn();
        arjun.fight();
        arjun.obey();
        arjun.kind();
        
        bheem.fight();
        bheem.obey();
        bheem.kind();
        
        duryodhan.fight();
        duryodhan.cruelty();
        duryodhan.obey();
        
        vikarn.fight();
        vikarn.obey();
        vikarn.cruelty();
        vikarn.kind();
    }
}