public class testComplexnumber {
    public static void main(String[]args){
        Complexnumber z1 = new Complexnumber(2,4);
        Complexnumber z2= new Complexnumber(4,3);

        Complexnumber z3= z1.multiply(z2);
        System.out.println(z3);
         double v = z2.args();
         System.out.println(v);


         System.out.println(z1.equals(z2));

    }
}
