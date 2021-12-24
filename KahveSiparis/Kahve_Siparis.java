class Kahve

{

    private int siparis_sayisi;

    private Kahve()

    {

        System.out.println("Kahve Yapilandirici Çagirildi");

    }

    private void KahveHazirla()

    {

        System.out.println(siparis_sayisi+" adet hazirlandi");

    }

    public static Kahve siparisGarson(int sayi)

    {

        Kahve kv=new Kahve();

        kv.siparis_sayisi=sayi;

        kv.KahveHazirla();

        return kv;

    }


   public static void main(String[] args) {
    Kahve kh= Kahve.siparisGarson(5);
   }
}

