package Pertemuan6;

import java.util.Scanner;

public class ArrayOfPerson {
    public static void main(String[] args) {
        Person[] person = new Person[2];

        String InName;
        int InAge;
        char iNgender;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < person.length; i++){

            System.out.print("Enter name: ");
            InName = scan.nextLine();
            System.out.print("Enter age: ");
            InAge = scan.nextInt();
            System.out.print("Enter gender: ");
            //inpStr = scan.next();
            iNgender = scan.next().charAt(0);
            scan.nextLine();

            person[i] = new Person();
            person[i].setName(InName);
            person[i].setAge(InAge);
            person[i].setGender(iNgender);
        }

        for(int i = 0; i < person.length; i++){
            System.out.println("Nama\t: "+person[i].getName());
            System.out.println("Umur\t: "+person[i].getAge());
            System.out.println("Gender\t: "+person[i].getGender());
        }
        scan.close();
    }

    // static void printArrayObject(Person[] persons){
    //     // basic forloop
    //     for (int i = 0; i < persons.length; i++){
    //         System.out.println("Object Person ke-" + persons[i] + " :");
    //         persons[i].printPerson();
    //     }
    // }
}
