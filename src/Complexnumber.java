public class Complexnumber {
    double a;
    double b;

public Complexnumber(double a, double b){
    this.a=a;
    this.b=b;
    }
public Complexnumber add(Complexnumber z2){
    double a =this.a + z2.a;
    double b= this.b + z2.b;
    Complexnumber z3 = new Complexnumber(a,b);
    return z3;
    }
public String toString(){
    return this.a + "+" + this.b + "i";
    }
}
