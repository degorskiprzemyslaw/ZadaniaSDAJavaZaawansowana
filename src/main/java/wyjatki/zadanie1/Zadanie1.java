package wyjatki.zadanie1;

public class Zadanie1 {

    public double divide(double a, double b) throws CannotDivideBy0Exception{
        if (b == 0){
            throw new CannotDivideBy0Exception("Nie mozna dzielic przez 0");
        }
        return a / b;
    }
}
