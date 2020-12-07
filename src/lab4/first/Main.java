package lab4.first;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/lab4/first/input.txt");
        System.out.println(phoneBook);
        System.out.println("Abbey: " + phoneBook.getByName("Abbey"));
        System.out.println("Abdul: " + phoneBook.getByName("Abdul"));
    }
}
