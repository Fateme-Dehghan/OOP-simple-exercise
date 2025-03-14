public class Mian {
    public static void main(String[] args) {
        Person person1 = new Person("ABCDEFGH"+ "IJKLMNOPQRSTUVWXYZ",(12345+6789)/2);
        person1.display();
//        person1.adult();

        person1.setName("ABCDEFGH");
        person1.setAge(12345);
        person1.display();
//        person1.adult();
    }
}
