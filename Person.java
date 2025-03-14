public class Person {
    private String name;
    private int age;

    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //The getter of name
    public String getName() {
        return name;
    }
    //The setter of name
    public void setName(String name) {
        this.name = name;
    }

    //The getter of age
    public int getAge() {
        return age;
    }
    //The setter of age
    public void setAge(int age) {
        this.age = age;
    }

    //Display method
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

//    public void adult(){
//        if (age >= 18) {
//            System.out.println("a message accordingly");
//        } else {
//            System.out.println("no need to print a message accordingly");
//        }
//    }
}
