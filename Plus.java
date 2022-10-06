public class Plus extends Calc implements PrintAns{

    @Override
    void answer() {
        // TODO Auto-generated method stub
       System.out.println(getA()+getB()); 
    }

    @Override
    public void print(int a, int b) {
        // TODO Auto-generated method stub
        System.out.print(a+ "+"+ b + "=");
    }
    

}
