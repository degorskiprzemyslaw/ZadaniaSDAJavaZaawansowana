package wyjatki.zadanie1;

public class Zadanie1Demo {
    public static void main(String[] args) {

        Zadanie1 zadanie = new Zadanie1();
        try{
            zadanie.divide(23, 0);
        } catch (CannotDivideBy0Exception e){
            System.out.println();
        } finally{
            System.out.println("Operacja skonczona");
        }

    }
}
