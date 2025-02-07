/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface testable{
    default void display(){
        System.out.println("Display function of testable");
    }
}
class Test implements testable{
    public void print(){
        System.out.println("Print function of Test class");
    }
}
abstract class AbsTest implements testable{
    public abstract void print();
}
class sub extends AbsTest{
    @Override
    public void print(){
        System.out.println("Print function of AbsTest's concrete class to avoid errors");
    }
}
class Main{
    public static void main(String[] args){
        testable test=new Test();
        test.display();
        
        Test t=(Test)test;
        t.print();
        
        //testable tt=new AbsTest();// this will give error we have to create a concrete class to avoid it
        testable tt=new sub();
        sub r=(sub)tt;
        r.print();
    }
}