package Pertemuan4;

public class TestInheritance {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        ClassA a = new ClassA();

        System.out.println(a.x);
        System.out.println(b.x);

        a.printX();
        b.printX();
    }
}
 