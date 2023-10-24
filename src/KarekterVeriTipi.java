public class KarekterVeriTipi {
    public static void main(String[] args) {
        //3. UYGULAMA:
        char karakter = 'A';
        System.out.println("Karakter: " + karakter);
        karakter = 'A' + 1;
        System.out.println("Karakter: " + karakter);

        //SIRA SİZDE:
        karakter = 'a';
        System.out.println("Karakter: " + karakter);
        karakter = 'a' + 1;
        System.out.println("Karakter: " + karakter);

        //4. UYGULAMA:
        karakter = 'a';
        int ascii = (int) karakter;
        System.out.println("Karakter: " + karakter);
        System.out.println("ASCII kodu: " + ascii);

        //SIRA SİZDE:
        karakter = 68;
        ascii = (int) karakter;
        System.out.println("Karakter: " + karakter);
        System.out.println("ASCII kodu: " + ascii);
    }
}
