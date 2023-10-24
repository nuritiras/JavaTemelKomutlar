public class MantiksalOperatorler {
    public static void main(String[] args) {
        //10. UYGULAMA:
        int x = 5;
        int y= 8;
        System.out.println("x 10’dan büyük ve y 10’dan küçük mü : " + (x > 20 && y < 20));
        System.out.println("x 10’dan büyük ve y 10’dan küçük mü tersi : " + !(x > 20 && y < 20));
        System.out.println("x 10’dan büyük veya y 10’dan küçük mü : " + (x > 20 || y <20));
        System.out.println("x 10’dan büyük veya y 10’dan küçük mü tersi: " + !(x > 20 || y <20));

        //SIRA SİZDE:
        x = 15;
        y= 8;
        System.out.println("x 10’dan büyük ve y 10’dan küçük mü : " + (x > 20 && y < 20));
        System.out.println("x 10’dan büyük ve y 10’dan küçük mü tersi : " + !(x > 20 && y < 20));
        System.out.println("x 10’dan büyük veya y 10’dan küçük mü : " + (x > 20 || y <20));
        System.out.println("x 10’dan büyük veya y 10’dan küçük mü tersi: " + !(x > 20 || y <20));
    }
}
