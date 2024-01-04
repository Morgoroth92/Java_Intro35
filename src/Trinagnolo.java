public class Trinagnolo extends Forma{

    private float base;
    private float altezza;

    public Trinagnolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltezza() {
        return altezza;
    }
    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea() {
        System.out.println("Area triangolo: " + (base * altezza) / 2);
    }
}
