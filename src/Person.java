public class Person {
    String firstName;
    String lastName;
    int age;
    String job;
    int weight;
    int height;

public Person(String firstName, String lastName, int age ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
}
public Person(String job, int weight, int height ) {
    this("", "", 0);
    this.job = job;
    this.weight = weight;
    this.height = height;
}
public String getFirstName() {
    return firstName;
}
public String getLastName() {
    return lastName;
}
public int getAge() {
    return age;
}
public boolean isTeen() {
    if (age >= 13 && age <= 19) {
            return true;
    } else {
            return false;
    }
}

public static void main(String[] args) {

Person person = new Person("John", "Doe", 20);

System.out.println("Firstname: " + person.getFirstName());

System.out.println("LastName: " + person.getLastName());

System.out.println("Age: " + person.getAge());
    }
}
