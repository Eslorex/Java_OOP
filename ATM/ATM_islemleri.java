import java.util.Scanner;


class Atm{
    private String ad;
    private String soyad;
    private int Bakiye = 0;
   
    public String getAd() { return ad; }
    public void setAd(String ad) { this.ad = ad; }
    public String getSoyad() { return soyad; }
    public void setSoyad(String soyad) {this.soyad = soyad;  }
    public int getBakiye() {return Bakiye;   }
    public void setBakiye(int Bakiye) {   this.Bakiye = Bakiye;  }
   
    Scanner scan = new Scanner(System.in);
    public Atm(String ad , String soyad,int bakiye){
        setAd(ad);
        setSoyad(soyad);
        setBakiye(bakiye);
    }
    public int YatirmaCekme(){
        int islem,cekme,yatirma,sonuc = 0,ikiyüz=0,yüz=0,elli=0,on=0,yirmi=0,bes=0;
        System.out.print("Para çekmek istiyorsaniz 1 e yatirmak istiyorsaniz 2 ye basiniz : ");
        islem = scan.nextInt();
        if (islem==1){
            System.out.print("çekmek istediğiniz tutari giriniz : ");
            cekme=scan.nextInt();
            sonuc = getBakiye()-cekme;
            for (int i = 0 ; i<500;i++){
                if (cekme>=200){
                     cekme=cekme-200;
                     ikiyüz++;
                }
                if (cekme<200 && cekme>=100){
                     cekme=cekme-100;
                     yüz++;
                }
                if (cekme<100 && cekme>=50){
                     cekme=cekme-50;
                     elli++;
                }
                if (cekme<50 && cekme>=20){
                     cekme=cekme-20;
                     yirmi++;
                }
                if (cekme<20 && cekme>=10){
                     cekme=cekme-10;
                     on++;
                }
                if (cekme<10 && cekme>=5){
                     cekme=cekme-5;
                     bes++;
                }
            }      
            System.out.println(ikiyüz + " adet ikiyüz TL \r\n" + yüz + " adet yüz TL \r\n" + elli + " adet elli TL \r\n" + yirmi + " adet Yirmi TL \r\n" + on + " adet on TL \r\n" + bes + " adet bes TL\r\n");
            System.out.print("Eski bakiyeniz : " + getBakiye() + " Yeni Bakiyeniz : " + sonuc);
       
    }else if (islem==2){
            System.out.print("yatirma istediğiniz tutari giriniz : ");
            yatirma=scan.nextInt();
            sonuc = getBakiye()+yatirma;
            System.out.print("Eski bakiyeniz : " + getBakiye() + " Yeni Bakiyeniz : " + sonuc);
    }
        return sonuc;
    }
}

public class ATM_islemleri
{
 public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        Atm b = new Atm("ali","VELİ",3000);
        b.YatirmaCekme();
 }
}