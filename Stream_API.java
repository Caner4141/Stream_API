
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Stream_API {

    public static void main(String[] args) {

        // 1'den 100'e kadar olan sayılarla liste oluşturma
        List<Integer> sayilar = IntStream.rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.toList());

        // Hem 2 hem 4 ile bölünebilen sayıların sayısı
        long ikiVeDortIleBolunen = sayilar.stream()
                .filter(sayi -> sayi % 2 == 0 && sayi % 4 == 0)
                .count();

        System.out.println("Hem 2 hem de 4 ile bölünebilen sayı adedi: " + ikiVeDortIleBolunen);

        // Tek sayıların adedi ve toplamı
        long tekAdet = sayilar.stream()
                .filter(sayi -> sayi % 2 != 0)
                .count();

        int tekToplam = sayilar.stream()
                .filter(sayi -> sayi % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Tek sayı adedi: " + tekAdet);
        System.out.println("Tek sayıların toplamı: " + tekToplam);

        // Çift sayıların adedi ve toplamı
        long ciftAdet = sayilar.stream()
                .filter(sayi -> sayi % 2 == 0)
                .count();

        int ciftToplam = sayilar.stream()
                .filter(sayi -> sayi % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Çift sayı adedi: " + ciftAdet);
        System.out.println("Çift sayıların toplamı: " + ciftToplam);
    }
}

