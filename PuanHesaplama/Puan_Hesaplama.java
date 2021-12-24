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
    public void puanArttir()
    {
        _puan++;
    }
    public void puanAzalt()
    {
        _puan--;
    }
    public void Hesaplama(String isaret, double sayi)
    {
        if (isaret=="+")
        { _puan=_puan+sayi; }
        else if(isaret=="-")
        { _puan=_puan-sayi; }
        else
        { _puan=0; }
       
    }
      public static Hesapla veriGir(double sayi)
    {
        Hesapla hsp=new Hesapla();
        hsp.setPuan(sayi);
        //kv.KahveHazirla();
        return hsp;
    }
}
public class Puan_Hesaplama
{
 public static void main(String[] args) {
  Hesapla hsp=new Hesapla();
  hsp.setPuan(100);
  //Hesapla.veriGir(100);
  //hsp.puanArttir();
  //hsp.puanAzalt();
  hsp.Hesaplama("-",20);
  var puan=hsp.getPuan();
  System.out.println(puan);
  

 }
}