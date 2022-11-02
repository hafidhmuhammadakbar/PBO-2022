package Pertemuan6;

public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }
    public void setName(String inputName){
        this.name = inputName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int inputAge){
        this.age = inputAge;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char inputGender){
        this.gender = inputGender;
    }

    // void printPerson(){
    //     System.out.println(" Nama: " + this.name);
    //     System.out.println(" Umur: " + this.age);
    //     System.out.println(" Gender: " + this.gender);
    // }
}
