import java.util.Scanner;

public class phanso {
    int ts;
    int ms;

    Scanner s =new Scanner(System.in);
    public void InputData()
    {
        System.out.print("Nhap tu so: ");
        this.ts=s.nextInt();
        do
        {
        System.out.print("Nhap mau so: ");
        this.ms=s.nextInt();
        } 
        while (this.ms==0);
    }

    public void OutputData(String x)
    {
        System.out.println(x + "=" + ts+ "/" +ms);
    }
    public int UCLN(int a,int b)
    {
        if ((a==0) || (b==0))
            return a+b;
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public void ToiGian() 
    {
        int i=UCLN(ts,ms);
        this.ts = this.ts/i;
        this.ms = this.ms/i;
    }

    public void NghichDao()
    {
        int temp=this.ts;
        this.ts = this.ms;
        this.ms = temp;
    }

    public phanso tong(phanso f)
    {
        phanso ps=new phanso();
        ps.ts = ((this.ts*f.ms) + (this.ms*f.ts));
        ps.ms = (this.ms*f.ms);
        ps.ToiGian();
        return ps;
    }

    public phanso Hieu(phanso f)
    {
        phanso ps=new phanso();
        ps.ts = (this.ts*f.ms) - (this.ms*f.ts);
        ps.ms = (this.ms*f.ms);
        return ps;
    }
    public phanso Tich(phanso f)
    {
        phanso ps=new phanso();
        ps.ts = this.ts*f.ts;
        ps.ms = this.ms*f.ms;
        ps.ToiGian();
        return ps;
    }
    public phanso Thuong(phanso f)
    {
        phanso ps=new phanso();
        ps.ts = this.ts*f.ms;
        ps.ms = this.ms*f.ts;
        ps.ToiGian();
        return ps;
    }

    public static void main(String[] argv)    
    {
        phanso ps1=new phanso();
        phanso ps2=new phanso();
        ps1.InputData();
        ps2.InputData();
        ps1.OutputData("Phan so 1 la: ");     
        ps2.OutputData("Phan so 2 la: ");
        ps1.ToiGian();
        ps1.OutputData("Phan so 1 sau khi toi gian la: ");
        ps2.ToiGian();
        ps2.OutputData("Phan so 2 sau khi toi gian la: ");
        ps1.tong(ps2).OutputData("Tong hai phan so la: ");
        ps1.Hieu(ps2).OutputData("Hieu hai phan so la: ");
        ps1.Tich(ps2).OutputData("Tich hai phan so la: ");
        ps1.Thuong(ps2).OutputData("Thuong hai phan so la:");
    }
}
