public class Plus extends Calc implements PrintAns{

    public class InnerPlus {
    
        int a;
        void ppp() {
            System.out.println("pp");
        }        
    }
    
    Plus.InnerPlus ss =  new InnerPlus();

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
