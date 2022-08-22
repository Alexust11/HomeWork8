import java.time.LocalDate;

public class Main {
    public static void checkingYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " - високосный год");
                }
            } else {
                System.out.println(year+"- високосный год");
            }
        } else {
            System.out.println(year + " - не високосный год");
        }
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " - не високосный год");
        }

    }

    public static int calculationDays(int distant) {
        int days;
        if (distant <= 20) {
            days = 1;
        } else {
            days = (distant - 20) / 40 + 2;
        }
      return days;
    }
    public static void choosingVersion(int OS, int yar) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear > yar && OS == 1) {
            System.out.println("Вам рекомендуется установить облегченную версию OS Андроид");
        } else {
            if (currentYear == yar && OS == 1) {
                System.out.println("Вам можно установить новую версию OS Андроид");

            }
        }
        if (currentYear > yar && OS == 0) {
            System.out.println("Вам рекомендуется установить облегченную версию OS iOS");
        } else {
            if (currentYear == yar && OS == 0) {
                System.out.println("Вам можно установить новую версию OS iOS");
            }
        }
    }

    public static void main(String[] args) {
        //Задача 1
        int year=2004;
        checkingYear(year);

//        Задача 2
        int OS = 1; // 1- Android, 0- iOS
        int yearReleasePhone=2022;// год выпуска телефона
        choosingVersion(OS, yearReleasePhone);

//  Задача 3
        int distance=105;
        int day=calculationDays(distance);
        System.out.println("Для доставки карты потребуется дней - "+day);

//        System.out.println("Hello world!");
    }
}