package javaweek7homework;
/*14. Person
Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
Write the following methods (instance methods):

 */

public class Program14_Person {
    private String firstName;
    private String lastName;
    int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Program14_Person program14Person = new Program14_Person();
        program14Person.setFirstName("");
        program14Person.setLastName("");
        program14Person.setAge(10);
        System.out.println("fullName=" + program14Person.getFullName());
        System.out.println("teen=" + program14Person.isTeen());
        program14Person.setFirstName("John");
        program14Person.setAge(18);
        System.out.println("fullName=" + program14Person.getFullName());
        System.out.println("teen= " + program14Person.isTeen());
        program14Person.setLastName("Smith");
        System.out.println("fullname=" + program14Person.getFullName());
    }
}
