class Personel
{
    //Kapsülleme
    private String _Ad;
    private String _Soyad;
    private double _Maas;
    private int _CocukSayisi;
   
    public void setAd(String ad) { _Ad=ad; }
    public String getAd(){ return _Ad;}
   
    public void setSoyad(String sad) { _Soyad=sad; }
    public String getSoyad(){ return _Soyad;}
   
    public void setMaas(double ma) { _Maas=ma; }
    public double getMaas(){ return _Maas;}
   
    public void setCocukSayisi(int cs) { _CocukSayisi=cs; }
    public int getCocukSayisi(){ return _CocukSayisi;}
    //Yapici Metod
    public Personel () {}
    public Personel(String ad,String soyad,double maas,int cocuk)
    {
        _Ad=ad;
        _Soyad=soyad;
        _Maas=maas;
        _CocukSayisi=cocuk;
    }
    //Sinifin Metodlari
    public double ZamHesapla()
    {
        double maas=_Maas;
        int cocuk=_CocukSayisi;
        double zam=0;
        double ek=42*cocuk;
        if(maas<1000) { zam=maas*0.03; }
        else if(maas>=1000 & maas<2500) { zam=maas*0.04; }
        else if(maas>=2500)  { zam=maas*0.05; }
        else { zam=0; }
        return zam+ek;
    }
    public void YilHesapla()
    {
       
    }
    public void Yazdir()
    {
        System.out.println("Adiniz:"+_Ad);
        System.out.println("Soyadiniz:"+_Soyad);
        System.out.println("Maasiniz:"+_Maas);
        System.out.println("Çocuk Sayisi:"+_CocukSayisi);
        System.out.println("Zamli Maas:"+(getMaas()+ZamHesapla()));
        System.out.println("Zam:"+ZamHesapla());
    }
}


public class Maas_Hesaplayici
{
 public static void main(String[] args) {
     Personel ps=new Personel("Başar","Ersek",3000,5);
     ps.Yazdir();
 }
}