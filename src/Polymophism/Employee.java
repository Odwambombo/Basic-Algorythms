package Polymophism;

public class Employee extends Person{
    public String surname;
    public String getD(){
        return super.getD()+ surname;
    }
}
