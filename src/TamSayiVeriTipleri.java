public class TamSayiVeriTipleri {
    public static void main(String[] args) {
        //2. UYGULAMA:
        byte kucukSayi = 127;
        short kisaSayi = 32767;
        int tamSayi = 2147483647;
        long uzunSayi = 9223372036854775807L;
        System.out.println("byte: "+ kucukSayi);
        System.out.println("short: " + kisaSayi);
        System.out.println("int: " + tamSayi);
        System.out.println("long: " + uzunSayi);

        //SIRA SİZDE:
        uzunSayi = 255;
        //uzunSayi=2147483648; //Integer number too large
        uzunSayi=2147483648L;
    }
}
