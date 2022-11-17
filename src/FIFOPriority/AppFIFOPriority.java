package FIFOPriority;

public class AppFIFOPriority {
    public static void main(String[] args) {
        FIFOPriority kolejka = new FIFOPriority();
        kolejka.push("11",1);
        kolejka.push("22",2);
        kolejka.push("33",3);
        kolejka.push("999",99);
        System.out.println(kolejka.popFirst());

        FIFOPriority kolejka1 = new FIFOPriority();
        kolejka1.push("11",1);
        kolejka1.push("22",2);
        kolejka1.push("33",3);
        kolejka1.push("999",99);
        System.out.println(kolejka1.popHighThree());

        FIFOPriority kolejka2 = new FIFOPriority();
        kolejka2.push("11",1);
        kolejka2.push("22",2);
        System.out.println(kolejka2.popHighThree());

        FIFOPriority kolejka3 = new FIFOPriority();
        kolejka3.push("11",1);
        kolejka3.push("22",2);
        kolejka3.push("33",3);
        kolejka3.push("999",99);
        System.out.println(kolejka3.popHighest());
    }
}
