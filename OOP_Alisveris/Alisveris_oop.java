import java.util.*;

import java.util.ArrayList;



class Urun

{

    private String _urunAdi;

    public void seturunAdi(String ad) { _urunAdi=ad; }

    public String geturunAdi() { return _urunAdi; }



    private double _urunFiyat;

    public void seturunFiyat(double fiyat) { _urunFiyat=fiyat; }

    public double geturunFiyat() { return _urunFiyat; }

    

    protected double KDV()

    {

       return _urunFiyat*1.08;

    }

    public Urun() {}

}

class Ekmek extends Urun

{

    private String _ekmekTuru;

    public void setekmekTuru(String ekturu) { _ekmekTuru=ekturu; }

    public String getekmekTuru() { return _ekmekTuru; }

    private double _gramaj;

    public void setgramaj(double gram) { _gramaj=gram; }

    public double getgramaj() { return _gramaj; }

    public Ekmek () {}

    public Ekmek (String uAdi, double uFiyat,String ekTur,double gr)

    {

        seturunAdi(uAdi);

        seturunFiyat(uFiyat);

        _ekmekTuru=ekTur;

        _gramaj=gr;

    }

}

class CepTel extends Urun

{

    private String _model;

    public void setmodel(String mo) { _model=mo; }

    public String getmodel() { return _model; }

    private String _ozellik;

    public void setozellik(String oz) { _ozellik=oz; }

    public String getozellik() { return _ozellik; }

    public CepTel () {}

    public CepTel (String uAdi, double uFiyat,String mo,String oz)

    {

        seturunAdi(uAdi);

        seturunFiyat(uFiyat);

        _model=mo;

        _ozellik=oz;

    }

    protected double KDV()

    {

       return geturunFiyat()*1.18; 

    }

}

class Sepet{

    List<Urun> _sepet=new ArrayList<Urun>();

    public void Ekle(Urun u)

    {

        _sepet.add(u);

    }

    private double t=0;

    public double sepetTutar()

    {

        

        for (Urun i : _sepet) {

              System.out.println(i.KDV());

              t=t+i.KDV();

        }

        return t;

    }

    public void Goster()

    {

        System.out.println("Sepet Toplam:"+t);

    }

}



public class Alisveris_oop

{

	public static void main(String[] args) {

		Sepet sp=new Sepet();

		//Ekmek ek=new Ekmek("Uno",10,"Kepekli",100);

		//sp.Ekle(ek);

		sp.Ekle(new Ekmek("Uno",10,"Kepekli",100));

		sp.Ekle(new Ekmek("Uno2",15,"Kepekli",200));

		sp.Ekle(new CepTel("Xiaomi",4000,"Poco","X3 NFC"));

		sp.sepetTutar();

		sp.Goster();

	}

}