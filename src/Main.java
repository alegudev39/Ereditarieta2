//Scrivere un programma che contenga una classe chiamata Forma
// ed un metodo chiamato calcolaArea() che stampi l'area della forma.
//Crea poi una sottoclasse chiamata Rettangolo che fa override
//del metodo calcolaArea() per calcolare l'area del rettangolo.
//
public class Main {

    static Rettangolo rettangolo = new Rettangolo(2, 2);

    public static void main(String[] args) {

        System.out.println(rettangolo.calcolaArea());

    }
}