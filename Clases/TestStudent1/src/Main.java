//Clase #1 07-11-2024

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(456, "Vanessa");

        Student s2 = new Student(333, "Lorena", "Nacional");





        System.out.println("identification: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Universidad: " + s1.university);

        System.out.println("--------------------------");

        System.out.println("identification: " + s2.id);
        System.out.println("Name: " + s2.name);
        System.out.println("Universidad: " + s2.university);
    }
}