public class Rettangolo extends Forma{

    private float base;
    private float altezza;
    @Override
    public void calcolaArea() {
        System.out.println("Area rettangolo: " + (base * altezza));
    }
    public Rettangolo(float base, float altezza){
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

}
