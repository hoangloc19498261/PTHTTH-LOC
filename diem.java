import java.util.Scanner;
public class diem 
{
    float x;
    float y;
    
    void toado(float hoanhdo, float tungdo)
    {
        this.x=hoanhdo;
        this.y=tungdo;
    }

    void nhaptoado()
    {
        float hoanhdo,tungdo;

        Scanner s = new Scanner(System.in);

        System.out.print("nhap toa do x : ");
        hoanhdo = s.nextFloat();
        System.out.print("nhap toa do y : ");
        tungdo = s.nextFloat();
        
        toado(hoanhdo, tungdo);
    }

    void intoado()
    {
        System.out.println("Toa do x,y : ("+ x + "," + y +" ) ");
    }

    void khoangcach()
    {
        double kc;

        kc = Math.sqrt(x*x+y*y);
        System.out.println("khoang cach tu diem den goc toa do : " + kc);
    }

        public static void main(String[] args) 
    {
        diem a =new diem();
        a.nhaptoado();
        a.intoado();
        a.khoangcach();
    }

}

