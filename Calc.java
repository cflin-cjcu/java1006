
abstract public class Calc {

    private int a;
    private int b;

    abstract void answer();
    
    void setData(int m,int n) {
        a = m;
        b = n;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    
}