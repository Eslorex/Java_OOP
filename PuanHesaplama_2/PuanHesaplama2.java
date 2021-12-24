class Hesapla
{
    private double _puan=0;
    public void setPuan(double yeniPuan)
    {
        this._puan=yeniPuan;
    }
    public double getPuan()
    {
        return _puan;
    }
}
class Formul
{
    private final double _pi=3.14;
    public double getPi()
    {
        return _pi;
    }
    public double Mutlak(double veri)
    {
        if (veri<0) veri=veri*-1;
        return veri;
    }
}

public class PuanHesaplama2
{
    Hesapla hsp=new Hesapla();
    Formul frm=new Formul();
   
 public static void main(String[] args) {
     PuanHesaplama2 mn=new PuanHesaplama2();
     mn.hsp.setPuan(100);
     var puan=mn.hsp.getPuan();
  System.out.println(puan);
    var mutlak = mn.frm.Mutlak(-5);
    System.out.println(mn.frm.getPi());
 }
}