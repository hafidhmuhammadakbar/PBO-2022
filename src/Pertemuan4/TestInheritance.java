package Pertemuan4;

public class TestInheritance {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();

        System.out.println(a.x);
        System.out.println(b.x);

        a.printX();
        b.printX();
    }
}
