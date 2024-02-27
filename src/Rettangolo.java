public class Rettangolo extends Forma {

    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int calcolaArea() {
        return base * altezza;

    }

}
