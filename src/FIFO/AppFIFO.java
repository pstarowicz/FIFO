package FIFO;

public class AppFIFO {
    public static void main(String[] args) {
        FIFO kolejka = new FIFO();

        //System.out.println(kolejka.pop());
        kolejka.push("jeden");
        kolejka.push("dwa");
        kolejka.push("trzy");

        System.out.println(kolejka.pop());
        System.out.println(kolejka.pop());

        kolejka.push("cztery");

        System.out.println(kolejka.pop());
        System.out.println(kolejka.pop());

    }
}
