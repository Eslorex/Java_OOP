class Kedi
{
    int ayaksayisi=4;
    public void yakala()
    {
        System.out.println("Kedi YAkala");
    }
}
class Kaplan extends Kedi
{
     int gucu=100;
    public void yakala() //Override işlemi
    {
        System.out.println("Kaplan Yakala");
    }
     public void yakala(int sayi) //Overloading işlemi
     {
         System.out.println("Kaplan yakala"+sayi);
     }
}
public class kedi_override_overloading
{
 public static void main(String[] args) {
     Kaplan kl=new Kaplan();
     kl.yakala();
     kl.yakala(5);

 }
}