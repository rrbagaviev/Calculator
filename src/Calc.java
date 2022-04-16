import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Calc {
    public static String[] Array;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] Array;
        String delimiter = " ";
        Array = x.split(delimiter);

        //ограничение на только 1 математическую операцию
        if (Array.length > 3) {
            throw new IOException("Можно вводить только 1 математическую операцию");
        }

        // ограничение на содержание математической операции
        if (Array.length < 3) {
            throw new IOException("Строка не является математической операцией");
        }

        // ограничение на использование только 1 системы счисления
        if (((Array[0].equals("I") || Array[0].equals("II") || Array[0].equals("III") || Array[0].equals("IV") ||
                Array[0].equals("V") || Array[0].equals("VI") || Array[0].equals("VII") || Array[0].equals("VIII") ||
                Array[0].equals("IX") || Array[0].equals("X"))
                &&
                (Array[2].equals("1") || Array[2].equals("2") || Array[2].equals("3") || Array[2].equals("4") ||
                        Array[2].equals("5") || Array[2].equals("6") || Array[2].equals("7") || Array[2].equals("8") ||
                        Array[2].equals("9") || Array[2].equals("10")))
                ||
                ((Array[2].equals("I") || Array[2].equals("II") || Array[2].equals("III") || Array[2].equals("IV") ||
                Array[2].equals("V") || Array[2].equals("VI") || Array[2].equals("VII") || Array[2].equals("VIII") ||
                Array[2].equals("IX") || Array[2].equals("X"))
                        &&
                (Array[0].equals("1") || Array[0].equals("2") || Array[0].equals("3") || Array[0].equals("4") ||
                        Array[0].equals("5") || Array[0].equals("6") || Array[0].equals("7") || Array[0].equals("8") ||
                        Array[0].equals("9") || Array[0].equals("10")))) {
            throw new IOException("Можно использовать только одну систему счисления");
        }

        //замена римских на арабские
        String roman = Array[0];
        String roman2 = Array[2];

        //отработка исключения только целые числа
        String str1 = Array[0];
        int str11 = str1.indexOf('.');
        int str111 = str1.indexOf(',');
        String str2 = Array[2];
        int str22 = str2.indexOf('.');
        int str222 = str2.indexOf(',');
        if (str11 != -1 || str111 != -1 || str22 != -1 || str222 != -1) {
            throw new IOException("Можно вводить только целые числа");
        }

        //отработка исключения ввод чисел от 1 до 10 (римские)
        if (Rome.roman2Decimal(roman) < 0 || Rome.roman2Decimal(roman) > 10 ||
                Rome.roman2Decimal(roman2) < 0 || Rome.roman2Decimal(roman2) > 10) {
            throw new IOException("Можно вводить числа только от 1 до 10");
        }

        //определение арифметической операции и вывод
        if ((Array[0].equals("I") || Array[0].equals("II") || Array[0].equals("III") || Array[0].equals("IV") ||
                Array[0].equals("V") || Array[0].equals("VI") || Array[0].equals("VII") || Array[0].equals("VIII") ||
                Array[0].equals("IX") || Array[0].equals("X")) || (Array[2].equals("I") || Array[2].equals("II") ||
                Array[2].equals("III") || Array[2].equals("IV") || Array[2].equals("V") || Array[2].equals("VI") ||
                Array[2].equals("VII") || Array[2].equals("VIII") || Array[2].equals("IX") || Array[2].equals("X"))) {
            switch (Array[1].charAt(0)) {
                case '+' -> {
                    int resultFinal = Rome.roman2Decimal(roman) + Rome.roman2Decimal(roman2);
                    if (resultFinal < 1) {
                        throw new IOException("Результат операции с римскими числами не может быть меньше 1");
                    } else {
                        if (resultFinal == 1) {
                            System.out.println("I");
                        } else if (resultFinal == 2) {
                            System.out.println("II");
                        } else if (resultFinal == 3) {
                            System.out.println("III");
                        } else if (resultFinal == 4) {
                            System.out.println("IV");
                        } else if (resultFinal == 5) {
                            System.out.println("V");
                        } else if (resultFinal == 6) {
                            System.out.println("VI");
                        } else if (resultFinal == 7) {
                            System.out.println("VII");
                        } else if (resultFinal == 8) {
                            System.out.println("VIII");
                        } else if (resultFinal == 9) {
                            System.out.println("IX");
                        } else if (resultFinal == 10) {
                            System.out.println("X");
                        } else if (resultFinal == 11) {
                            System.out.println("XI");
                        } else if (resultFinal == 12) {
                            System.out.println("XII");
                        } else if (resultFinal == 13) {
                            System.out.println("XIII");
                        } else if (resultFinal == 14) {
                            System.out.println("XIV");
                        } else if (resultFinal == 15) {
                            System.out.println("XV");
                        } else if (resultFinal == 16) {
                            System.out.println("XVI");
                        } else if (resultFinal == 17) {
                            System.out.println("XVII");
                        } else if (resultFinal == 18) {
                            System.out.println("XVIII");
                        } else if (resultFinal == 19) {
                            System.out.println("XIX");
                        } else if (resultFinal == 20) {
                            System.out.println("XX");
                        } else if (resultFinal == 21) {
                            System.out.println("XXI");
                        } else if (resultFinal == 22) {
                            System.out.println("XXII");
                        } else if (resultFinal == 23) {
                            System.out.println("XXIII");
                        } else if (resultFinal == 24) {
                            System.out.println("XXIV");
                        } else if (resultFinal == 25) {
                            System.out.println("XXV");
                        } else if (resultFinal == 26) {
                            System.out.println("XVI");
                        } else if (resultFinal == 27) {
                            System.out.println("XXVII");
                        } else if (resultFinal == 28) {
                            System.out.println("XXVIII");
                        } else if (resultFinal == 29) {
                            System.out.println("XXIX");
                        } else if (resultFinal == 30) {
                            System.out.println("XXX");
                        } else if (resultFinal == 31) {
                            System.out.println("XXXI");
                        } else if (resultFinal == 32) {
                            System.out.println("XXXII");
                        } else if (resultFinal == 33) {
                            System.out.println("XXXIII");
                        } else if (resultFinal == 34) {
                            System.out.println("XXXIV");
                        } else if (resultFinal == 35) {
                            System.out.println("XXXV");
                        } else if (resultFinal == 36) {
                            System.out.println("XXXVI");
                        } else if (resultFinal == 37) {
                            System.out.println("XXXVII");
                        } else if (resultFinal == 38) {
                            System.out.println("XXXVIII");
                        } else if (resultFinal == 39) {
                            System.out.println("XXXIX");
                        } else if (resultFinal == 40) {
                            System.out.println("XL");
                        } else if (resultFinal == 41) {
                            System.out.println("XLI");
                        } else if (resultFinal == 42) {
                            System.out.println("XLII");
                        } else if (resultFinal == 43) {
                            System.out.println("XLIII");
                        } else if (resultFinal == 44) {
                            System.out.println("XLIV");
                        } else if (resultFinal == 45) {
                            System.out.println("XLV");
                        } else if (resultFinal == 46) {
                            System.out.println("XLVI");
                        } else if (resultFinal == 47) {
                            System.out.println("XLVII");
                        } else if (resultFinal == 48) {
                            System.out.println("XLVIII");
                        } else if (resultFinal == 49) {
                            System.out.println("XLIX");
                        } else if (resultFinal == 50) {
                            System.out.println("L");
                        } else if (resultFinal == 51) {
                            System.out.println("LI");
                        } else if (resultFinal == 52) {
                            System.out.println("LII");
                        } else if (resultFinal == 53) {
                            System.out.println("LIII");
                        } else if (resultFinal == 54) {
                            System.out.println("LIV");
                        } else if (resultFinal == 55) {
                            System.out.println("LV");
                        } else if (resultFinal == 56) {
                            System.out.println("LVI");
                        } else if (resultFinal == 57) {
                            System.out.println("LVII");
                        } else if (resultFinal == 58) {
                            System.out.println("LVIII");
                        } else if (resultFinal == 59) {
                            System.out.println("LIX");
                        } else if (resultFinal == 60) {
                            System.out.println("LX");
                        } else if (resultFinal == 61) {
                            System.out.println("LXI");
                        } else if (resultFinal == 62) {
                            System.out.println("LXII");
                        } else if (resultFinal == 63) {
                            System.out.println("LXIII");
                        } else if (resultFinal == 64) {
                            System.out.println("LXIV");
                        } else if (resultFinal == 65) {
                            System.out.println("LXV");
                        } else if (resultFinal == 66) {
                            System.out.println("LXVI");
                        } else if (resultFinal == 67) {
                            System.out.println("LXVII");
                        } else if (resultFinal == 68) {
                            System.out.println("LXVIII");
                        } else if (resultFinal == 69) {
                            System.out.println("LXIX");
                        } else if (resultFinal == 70) {
                            System.out.println("LXX");
                        } else if (resultFinal == 71) {
                            System.out.println("LXXI");
                        } else if (resultFinal == 72) {
                            System.out.println("LXXII");
                        } else if (resultFinal == 73) {
                            System.out.println("LXXIII");
                        } else if (resultFinal == 74) {
                            System.out.println("LXXIV");
                        } else if (resultFinal == 75) {
                            System.out.println("LXXV");
                        } else if (resultFinal == 76) {
                            System.out.println("LXXVI");
                        } else if (resultFinal == 77) {
                            System.out.println("LXXVII");
                        } else if (resultFinal == 78) {
                            System.out.println("LXXVIII");
                        } else if (resultFinal == 79) {
                            System.out.println("LXXIX");
                        } else if (resultFinal == 80) {
                            System.out.println("LXXX");
                        } else if (resultFinal == 81) {
                            System.out.println("LXXXI");
                        } else if (resultFinal == 82) {
                            System.out.println("LXXXII");
                        } else if (resultFinal == 83) {
                            System.out.println("LXXXIII");
                        } else if (resultFinal == 84) {
                            System.out.println("LXXXIV");
                        } else if (resultFinal == 85) {
                            System.out.println("LXXXV");
                        } else if (resultFinal == 86) {
                            System.out.println("LXXXVI");
                        } else if (resultFinal == 87) {
                            System.out.println("LXXXVII");
                        } else if (resultFinal == 88) {
                            System.out.println("LXXXVIII");
                        } else if (resultFinal == 89) {
                            System.out.println("LXXXIX");
                        } else if (resultFinal == 90) {
                            System.out.println("XC");
                        } else if (resultFinal == 91) {
                            System.out.println("XCI");
                        } else if (resultFinal == 92) {
                            System.out.println("XCII");
                        } else if (resultFinal == 93) {
                            System.out.println("XCIII");
                        } else if (resultFinal == 94) {
                            System.out.println("XCIV");
                        } else if (resultFinal == 95) {
                            System.out.println("XCV");
                        } else if (resultFinal == 96) {
                            System.out.println("XCVI");
                        } else if (resultFinal == 97) {
                            System.out.println("XCVII");
                        } else if (resultFinal == 98) {
                            System.out.println("XCVIII");
                        } else if (resultFinal == 99) {
                            System.out.println("XCIX");
                        } else {
                            System.out.println("C");
                        }
                    }
                }
                case '-' -> {
                    int resultFinal = Rome.roman2Decimal(roman) - Rome.roman2Decimal(roman2);
                    if (resultFinal < 1){
                        throw new IOException("Результат операции с римскими числами не может быть меньше 1");
                    } else {
                        if (resultFinal == 1) {
                            System.out.println("I");
                        } else if (resultFinal == 2) {
                            System.out.println("II");
                        } else if (resultFinal == 3) {
                            System.out.println("III");
                        } else if (resultFinal == 4) {
                            System.out.println("IV");
                        } else if (resultFinal == 5) {
                            System.out.println("V");
                        } else if (resultFinal == 6) {
                            System.out.println("VI");
                        } else if (resultFinal == 7) {
                            System.out.println("VII");
                        } else if (resultFinal == 8) {
                            System.out.println("VIII");
                        } else if (resultFinal == 9) {
                            System.out.println("IX");
                        } else if (resultFinal == 10) {
                            System.out.println("X");
                        } else if (resultFinal == 11) {
                            System.out.println("XI");
                        } else if (resultFinal == 12) {
                            System.out.println("XII");
                        } else if (resultFinal == 13) {
                            System.out.println("XIII");
                        } else if (resultFinal == 14) {
                            System.out.println("XIV");
                        } else if (resultFinal == 15) {
                            System.out.println("XV");
                        } else if (resultFinal == 16) {
                            System.out.println("XVI");
                        } else if (resultFinal == 17) {
                            System.out.println("XVII");
                        } else if (resultFinal == 18) {
                            System.out.println("XVIII");
                        } else if (resultFinal == 19) {
                            System.out.println("XIX");
                        } else if (resultFinal == 20) {
                            System.out.println("XX");
                        } else if (resultFinal == 21) {
                            System.out.println("XXI");
                        } else if (resultFinal == 22) {
                            System.out.println("XXII");
                        } else if (resultFinal == 23) {
                            System.out.println("XXIII");
                        } else if (resultFinal == 24) {
                            System.out.println("XXIV");
                        } else if (resultFinal == 25) {
                            System.out.println("XXV");
                        } else if (resultFinal == 26) {
                            System.out.println("XVI");
                        } else if (resultFinal == 27) {
                            System.out.println("XXVII");
                        } else if (resultFinal == 28) {
                            System.out.println("XXVIII");
                        } else if (resultFinal == 29) {
                            System.out.println("XXIX");
                        } else if (resultFinal == 30) {
                            System.out.println("XXX");
                        } else if (resultFinal == 31) {
                            System.out.println("XXXI");
                        } else if (resultFinal == 32) {
                            System.out.println("XXXII");
                        } else if (resultFinal == 33) {
                            System.out.println("XXXIII");
                        } else if (resultFinal == 34) {
                            System.out.println("XXXIV");
                        } else if (resultFinal == 35) {
                            System.out.println("XXXV");
                        } else if (resultFinal == 36) {
                            System.out.println("XXXVI");
                        } else if (resultFinal == 37) {
                            System.out.println("XXXVII");
                        } else if (resultFinal == 38) {
                            System.out.println("XXXVIII");
                        } else if (resultFinal == 39) {
                            System.out.println("XXXIX");
                        } else if (resultFinal == 40) {
                            System.out.println("XL");
                        } else if (resultFinal == 41) {
                            System.out.println("XLI");
                        } else if (resultFinal == 42) {
                            System.out.println("XLII");
                        } else if (resultFinal == 43) {
                            System.out.println("XLIII");
                        } else if (resultFinal == 44) {
                            System.out.println("XLIV");
                        } else if (resultFinal == 45) {
                            System.out.println("XLV");
                        } else if (resultFinal == 46) {
                            System.out.println("XLVI");
                        } else if (resultFinal == 47) {
                            System.out.println("XLVII");
                        } else if (resultFinal == 48) {
                            System.out.println("XLVIII");
                        } else if (resultFinal == 49) {
                            System.out.println("XLIX");
                        } else if (resultFinal == 50) {
                            System.out.println("L");
                        } else if (resultFinal == 51) {
                            System.out.println("LI");
                        } else if (resultFinal == 52) {
                            System.out.println("LII");
                        } else if (resultFinal == 53) {
                            System.out.println("LIII");
                        } else if (resultFinal == 54) {
                            System.out.println("LIV");
                        } else if (resultFinal == 55) {
                            System.out.println("LV");
                        } else if (resultFinal == 56) {
                            System.out.println("LVI");
                        } else if (resultFinal == 57) {
                            System.out.println("LVII");
                        } else if (resultFinal == 58) {
                            System.out.println("LVIII");
                        } else if (resultFinal == 59) {
                            System.out.println("LIX");
                        } else if (resultFinal == 60) {
                            System.out.println("LX");
                        } else if (resultFinal == 61) {
                            System.out.println("LXI");
                        } else if (resultFinal == 62) {
                            System.out.println("LXII");
                        } else if (resultFinal == 63) {
                            System.out.println("LXIII");
                        } else if (resultFinal == 64) {
                            System.out.println("LXIV");
                        } else if (resultFinal == 65) {
                            System.out.println("LXV");
                        } else if (resultFinal == 66) {
                            System.out.println("LXVI");
                        } else if (resultFinal == 67) {
                            System.out.println("LXVII");
                        } else if (resultFinal == 68) {
                            System.out.println("LXVIII");
                        } else if (resultFinal == 69) {
                            System.out.println("LXIX");
                        } else if (resultFinal == 70) {
                            System.out.println("LXX");
                        } else if (resultFinal == 71) {
                            System.out.println("LXXI");
                        } else if (resultFinal == 72) {
                            System.out.println("LXXII");
                        } else if (resultFinal == 73) {
                            System.out.println("LXXIII");
                        } else if (resultFinal == 74) {
                            System.out.println("LXXIV");
                        } else if (resultFinal == 75) {
                            System.out.println("LXXV");
                        } else if (resultFinal == 76) {
                            System.out.println("LXXVI");
                        } else if (resultFinal == 77) {
                            System.out.println("LXXVII");
                        } else if (resultFinal == 78) {
                            System.out.println("LXXVIII");
                        } else if (resultFinal == 79) {
                            System.out.println("LXXIX");
                        } else if (resultFinal == 80) {
                            System.out.println("LXXX");
                        } else if (resultFinal == 81) {
                            System.out.println("LXXXI");
                        } else if (resultFinal == 82) {
                            System.out.println("LXXXII");
                        } else if (resultFinal == 83) {
                            System.out.println("LXXXIII");
                        } else if (resultFinal == 84) {
                            System.out.println("LXXXIV");
                        } else if (resultFinal == 85) {
                            System.out.println("LXXXV");
                        } else if (resultFinal == 86) {
                            System.out.println("LXXXVI");
                        } else if (resultFinal == 87) {
                            System.out.println("LXXXVII");
                        } else if (resultFinal == 88) {
                            System.out.println("LXXXVIII");
                        } else if (resultFinal == 89) {
                            System.out.println("LXXXIX");
                        } else if (resultFinal == 90) {
                            System.out.println("XC");
                        } else if (resultFinal == 91) {
                            System.out.println("XCI");
                        } else if (resultFinal == 92) {
                            System.out.println("XCII");
                        } else if (resultFinal == 93) {
                            System.out.println("XCIII");
                        } else if (resultFinal == 94) {
                            System.out.println("XCIV");
                        } else if (resultFinal == 95) {
                            System.out.println("XCV");
                        } else if (resultFinal == 96) {
                            System.out.println("XCVI");
                        } else if (resultFinal == 97) {
                            System.out.println("XCVII");
                        } else if (resultFinal == 98) {
                            System.out.println("XCVIII");
                        } else if (resultFinal == 99) {
                            System.out.println("XCIX");
                        } else {
                            System.out.println("C");
                        }
                    }
                }
                case '/' -> {
                    int resultFinal = Rome.roman2Decimal(roman) / Rome.roman2Decimal(roman2);
                    if (resultFinal < 1){
                        throw new IOException("Результат операции с римскими числами не может быть меньше 1");
                    } else {
                        if (resultFinal == 1) {
                            System.out.println("I");
                        } else if (resultFinal == 2) {
                            System.out.println("II");
                        } else if (resultFinal == 3) {
                            System.out.println("III");
                        } else if (resultFinal == 4) {
                            System.out.println("IV");
                        } else if (resultFinal == 5) {
                            System.out.println("V");
                        } else if (resultFinal == 6) {
                            System.out.println("VI");
                        } else if (resultFinal == 7) {
                            System.out.println("VII");
                        } else if (resultFinal == 8) {
                            System.out.println("VIII");
                        } else if (resultFinal == 9) {
                            System.out.println("IX");
                        } else if (resultFinal == 10) {
                            System.out.println("X");
                        } else if (resultFinal == 11) {
                            System.out.println("XI");
                        } else if (resultFinal == 12) {
                            System.out.println("XII");
                        } else if (resultFinal == 13) {
                            System.out.println("XIII");
                        } else if (resultFinal == 14) {
                            System.out.println("XIV");
                        } else if (resultFinal == 15) {
                            System.out.println("XV");
                        } else if (resultFinal == 16) {
                            System.out.println("XVI");
                        } else if (resultFinal == 17) {
                            System.out.println("XVII");
                        } else if (resultFinal == 18) {
                            System.out.println("XVIII");
                        } else if (resultFinal == 19) {
                            System.out.println("XIX");
                        } else if (resultFinal == 20) {
                            System.out.println("XX");
                        } else if (resultFinal == 21) {
                            System.out.println("XXI");
                        } else if (resultFinal == 22) {
                            System.out.println("XXII");
                        } else if (resultFinal == 23) {
                            System.out.println("XXIII");
                        } else if (resultFinal == 24) {
                            System.out.println("XXIV");
                        } else if (resultFinal == 25) {
                            System.out.println("XXV");
                        } else if (resultFinal == 26) {
                            System.out.println("XVI");
                        } else if (resultFinal == 27) {
                            System.out.println("XXVII");
                        } else if (resultFinal == 28) {
                            System.out.println("XXVIII");
                        } else if (resultFinal == 29) {
                            System.out.println("XXIX");
                        } else if (resultFinal == 30) {
                            System.out.println("XXX");
                        } else if (resultFinal == 31) {
                            System.out.println("XXXI");
                        } else if (resultFinal == 32) {
                            System.out.println("XXXII");
                        } else if (resultFinal == 33) {
                            System.out.println("XXXIII");
                        } else if (resultFinal == 34) {
                            System.out.println("XXXIV");
                        } else if (resultFinal == 35) {
                            System.out.println("XXXV");
                        } else if (resultFinal == 36) {
                            System.out.println("XXXVI");
                        } else if (resultFinal == 37) {
                            System.out.println("XXXVII");
                        } else if (resultFinal == 38) {
                            System.out.println("XXXVIII");
                        } else if (resultFinal == 39) {
                            System.out.println("XXXIX");
                        } else if (resultFinal == 40) {
                            System.out.println("XL");
                        } else if (resultFinal == 41) {
                            System.out.println("XLI");
                        } else if (resultFinal == 42) {
                            System.out.println("XLII");
                        } else if (resultFinal == 43) {
                            System.out.println("XLIII");
                        } else if (resultFinal == 44) {
                            System.out.println("XLIV");
                        } else if (resultFinal == 45) {
                            System.out.println("XLV");
                        } else if (resultFinal == 46) {
                            System.out.println("XLVI");
                        } else if (resultFinal == 47) {
                            System.out.println("XLVII");
                        } else if (resultFinal == 48) {
                            System.out.println("XLVIII");
                        } else if (resultFinal == 49) {
                            System.out.println("XLIX");
                        } else if (resultFinal == 50) {
                            System.out.println("L");
                        } else if (resultFinal == 51) {
                            System.out.println("LI");
                        } else if (resultFinal == 52) {
                            System.out.println("LII");
                        } else if (resultFinal == 53) {
                            System.out.println("LIII");
                        } else if (resultFinal == 54) {
                            System.out.println("LIV");
                        } else if (resultFinal == 55) {
                            System.out.println("LV");
                        } else if (resultFinal == 56) {
                            System.out.println("LVI");
                        } else if (resultFinal == 57) {
                            System.out.println("LVII");
                        } else if (resultFinal == 58) {
                            System.out.println("LVIII");
                        } else if (resultFinal == 59) {
                            System.out.println("LIX");
                        } else if (resultFinal == 60) {
                            System.out.println("LX");
                        } else if (resultFinal == 61) {
                            System.out.println("LXI");
                        } else if (resultFinal == 62) {
                            System.out.println("LXII");
                        } else if (resultFinal == 63) {
                            System.out.println("LXIII");
                        } else if (resultFinal == 64) {
                            System.out.println("LXIV");
                        } else if (resultFinal == 65) {
                            System.out.println("LXV");
                        } else if (resultFinal == 66) {
                            System.out.println("LXVI");
                        } else if (resultFinal == 67) {
                            System.out.println("LXVII");
                        } else if (resultFinal == 68) {
                            System.out.println("LXVIII");
                        } else if (resultFinal == 69) {
                            System.out.println("LXIX");
                        } else if (resultFinal == 70) {
                            System.out.println("LXX");
                        } else if (resultFinal == 71) {
                            System.out.println("LXXI");
                        } else if (resultFinal == 72) {
                            System.out.println("LXXII");
                        } else if (resultFinal == 73) {
                            System.out.println("LXXIII");
                        } else if (resultFinal == 74) {
                            System.out.println("LXXIV");
                        } else if (resultFinal == 75) {
                            System.out.println("LXXV");
                        } else if (resultFinal == 76) {
                            System.out.println("LXXVI");
                        } else if (resultFinal == 77) {
                            System.out.println("LXXVII");
                        } else if (resultFinal == 78) {
                            System.out.println("LXXVIII");
                        } else if (resultFinal == 79) {
                            System.out.println("LXXIX");
                        } else if (resultFinal == 80) {
                            System.out.println("LXXX");
                        } else if (resultFinal == 81) {
                            System.out.println("LXXXI");
                        } else if (resultFinal == 82) {
                            System.out.println("LXXXII");
                        } else if (resultFinal == 83) {
                            System.out.println("LXXXIII");
                        } else if (resultFinal == 84) {
                            System.out.println("LXXXIV");
                        } else if (resultFinal == 85) {
                            System.out.println("LXXXV");
                        } else if (resultFinal == 86) {
                            System.out.println("LXXXVI");
                        } else if (resultFinal == 87) {
                            System.out.println("LXXXVII");
                        } else if (resultFinal == 88) {
                            System.out.println("LXXXVIII");
                        } else if (resultFinal == 89) {
                            System.out.println("LXXXIX");
                        } else if (resultFinal == 90) {
                            System.out.println("XC");
                        } else if (resultFinal == 91) {
                            System.out.println("XCI");
                        } else if (resultFinal == 92) {
                            System.out.println("XCII");
                        } else if (resultFinal == 93) {
                            System.out.println("XCIII");
                        } else if (resultFinal == 94) {
                            System.out.println("XCIV");
                        } else if (resultFinal == 95) {
                            System.out.println("XCV");
                        } else if (resultFinal == 96) {
                            System.out.println("XCVI");
                        } else if (resultFinal == 97) {
                            System.out.println("XCVII");
                        } else if (resultFinal == 98) {
                            System.out.println("XCVIII");
                        } else if (resultFinal == 99) {
                            System.out.println("XCIX");
                        } else {
                            System.out.println("C");
                        }
                    }
                }
                case '*' -> {
                    int resultFinal = Rome.roman2Decimal(roman) * Rome.roman2Decimal(roman2);
                    if (resultFinal < 1){
                        throw new IOException("Результат операции с римскими числами не может быть меньше 1");
                    } else {
                        if (resultFinal == 1) {
                            System.out.println("I");
                        } else if (resultFinal == 2) {
                            System.out.println("II");
                        } else if (resultFinal == 3) {
                            System.out.println("III");
                        } else if (resultFinal == 4) {
                            System.out.println("IV");
                        } else if (resultFinal == 5) {
                            System.out.println("V");
                        } else if (resultFinal == 6) {
                            System.out.println("VI");
                        } else if (resultFinal == 7) {
                            System.out.println("VII");
                        } else if (resultFinal == 8) {
                            System.out.println("VIII");
                        } else if (resultFinal == 9) {
                            System.out.println("IX");
                        } else if (resultFinal == 10) {
                            System.out.println("X");
                        } else if (resultFinal == 11) {
                            System.out.println("XI");
                        } else if (resultFinal == 12) {
                            System.out.println("XII");
                        } else if (resultFinal == 13) {
                            System.out.println("XIII");
                        } else if (resultFinal == 14) {
                            System.out.println("XIV");
                        } else if (resultFinal == 15) {
                            System.out.println("XV");
                        } else if (resultFinal == 16) {
                            System.out.println("XVI");
                        } else if (resultFinal == 17) {
                            System.out.println("XVII");
                        } else if (resultFinal == 18) {
                            System.out.println("XVIII");
                        } else if (resultFinal == 19) {
                            System.out.println("XIX");
                        } else if (resultFinal == 20) {
                            System.out.println("XX");
                        } else if (resultFinal == 21) {
                            System.out.println("XXI");
                        } else if (resultFinal == 22) {
                            System.out.println("XXII");
                        } else if (resultFinal == 23) {
                            System.out.println("XXIII");
                        } else if (resultFinal == 24) {
                            System.out.println("XXIV");
                        } else if (resultFinal == 25) {
                            System.out.println("XXV");
                        } else if (resultFinal == 26) {
                            System.out.println("XVI");
                        } else if (resultFinal == 27) {
                            System.out.println("XXVII");
                        } else if (resultFinal == 28) {
                            System.out.println("XXVIII");
                        } else if (resultFinal == 29) {
                            System.out.println("XXIX");
                        } else if (resultFinal == 30) {
                            System.out.println("XXX");
                        } else if (resultFinal == 31) {
                            System.out.println("XXXI");
                        } else if (resultFinal == 32) {
                            System.out.println("XXXII");
                        } else if (resultFinal == 33) {
                            System.out.println("XXXIII");
                        } else if (resultFinal == 34) {
                            System.out.println("XXXIV");
                        } else if (resultFinal == 35) {
                            System.out.println("XXXV");
                        } else if (resultFinal == 36) {
                            System.out.println("XXXVI");
                        } else if (resultFinal == 37) {
                            System.out.println("XXXVII");
                        } else if (resultFinal == 38) {
                            System.out.println("XXXVIII");
                        } else if (resultFinal == 39) {
                            System.out.println("XXXIX");
                        } else if (resultFinal == 40) {
                            System.out.println("XL");
                        } else if (resultFinal == 41) {
                            System.out.println("XLI");
                        } else if (resultFinal == 42) {
                            System.out.println("XLII");
                        } else if (resultFinal == 43) {
                            System.out.println("XLIII");
                        } else if (resultFinal == 44) {
                            System.out.println("XLIV");
                        } else if (resultFinal == 45) {
                            System.out.println("XLV");
                        } else if (resultFinal == 46) {
                            System.out.println("XLVI");
                        } else if (resultFinal == 47) {
                            System.out.println("XLVII");
                        } else if (resultFinal == 48) {
                            System.out.println("XLVIII");
                        } else if (resultFinal == 49) {
                            System.out.println("XLIX");
                        } else if (resultFinal == 50) {
                            System.out.println("L");
                        } else if (resultFinal == 51) {
                            System.out.println("LI");
                        } else if (resultFinal == 52) {
                            System.out.println("LII");
                        } else if (resultFinal == 53) {
                            System.out.println("LIII");
                        } else if (resultFinal == 54) {
                            System.out.println("LIV");
                        } else if (resultFinal == 55) {
                            System.out.println("LV");
                        } else if (resultFinal == 56) {
                            System.out.println("LVI");
                        } else if (resultFinal == 57) {
                            System.out.println("LVII");
                        } else if (resultFinal == 58) {
                            System.out.println("LVIII");
                        } else if (resultFinal == 59) {
                            System.out.println("LIX");
                        } else if (resultFinal == 60) {
                            System.out.println("LX");
                        } else if (resultFinal == 61) {
                            System.out.println("LXI");
                        } else if (resultFinal == 62) {
                            System.out.println("LXII");
                        } else if (resultFinal == 63) {
                            System.out.println("LXIII");
                        } else if (resultFinal == 64) {
                            System.out.println("LXIV");
                        } else if (resultFinal == 65) {
                            System.out.println("LXV");
                        } else if (resultFinal == 66) {
                            System.out.println("LXVI");
                        } else if (resultFinal == 67) {
                            System.out.println("LXVII");
                        } else if (resultFinal == 68) {
                            System.out.println("LXVIII");
                        } else if (resultFinal == 69) {
                            System.out.println("LXIX");
                        } else if (resultFinal == 70) {
                            System.out.println("LXX");
                        } else if (resultFinal == 71) {
                            System.out.println("LXXI");
                        } else if (resultFinal == 72) {
                            System.out.println("LXXII");
                        } else if (resultFinal == 73) {
                            System.out.println("LXXIII");
                        } else if (resultFinal == 74) {
                            System.out.println("LXXIV");
                        } else if (resultFinal == 75) {
                            System.out.println("LXXV");
                        } else if (resultFinal == 76) {
                            System.out.println("LXXVI");
                        } else if (resultFinal == 77) {
                            System.out.println("LXXVII");
                        } else if (resultFinal == 78) {
                            System.out.println("LXXVIII");
                        } else if (resultFinal == 79) {
                            System.out.println("LXXIX");
                        } else if (resultFinal == 80) {
                            System.out.println("LXXX");
                        } else if (resultFinal == 81) {
                            System.out.println("LXXXI");
                        } else if (resultFinal == 82) {
                            System.out.println("LXXXII");
                        } else if (resultFinal == 83) {
                            System.out.println("LXXXIII");
                        } else if (resultFinal == 84) {
                            System.out.println("LXXXIV");
                        } else if (resultFinal == 85) {
                            System.out.println("LXXXV");
                        } else if (resultFinal == 86) {
                            System.out.println("LXXXVI");
                        } else if (resultFinal == 87) {
                            System.out.println("LXXXVII");
                        } else if (resultFinal == 88) {
                            System.out.println("LXXXVIII");
                        } else if (resultFinal == 89) {
                            System.out.println("LXXXIX");
                        } else if (resultFinal == 90) {
                            System.out.println("XC");
                        } else if (resultFinal == 91) {
                            System.out.println("XCI");
                        } else if (resultFinal == 92) {
                            System.out.println("XCII");
                        } else if (resultFinal == 93) {
                            System.out.println("XCIII");
                        } else if (resultFinal == 94) {
                            System.out.println("XCIV");
                        } else if (resultFinal == 95) {
                            System.out.println("XCV");
                        } else if (resultFinal == 96) {
                            System.out.println("XCVI");
                        } else if (resultFinal == 97) {
                            System.out.println("XCVII");
                        } else if (resultFinal == 98) {
                            System.out.println("XCVIII");
                        } else if (resultFinal == 99) {
                            System.out.println("XCIX");
                        } else {
                            System.out.println("C");
                        }
                    }
                }
                default -> throw new IOException("Вы ввели неверную математическую операцию");
            }
        } else {
            if (Integer.parseInt(Array[0]) < 1 || Integer.parseInt(Array[0]) > 10 ||
                    Integer.parseInt(Array[2]) < 1 || Integer.parseInt(Array[2]) > 10) {
                throw new IOException("Можно вводить числа только от 1 до 10");
            } else {
                switch (Array[1].charAt(0)) {
                    case '+' -> {
                        int resultFinal2 = Integer.parseInt(Array[0]) + Integer.parseInt(Array[2]);
                        System.out.println(resultFinal2);
                    }
                    case '-' -> {
                        int resultFinal2 = Integer.parseInt(Array[0]) - Integer.parseInt(Array[2]);
                        System.out.println(resultFinal2);
                    }
                    case '/' -> {
                        int resultFinal2 = Integer.parseInt(Array[0]) / Integer.parseInt(Array[2]);
                        System.out.println(resultFinal2);
                    }
                    case '*' -> {
                        int resultFinal2 = Integer.parseInt(Array[0]) * Integer.parseInt(Array[2]);
                        System.out.println(resultFinal2);
                    }
                    default -> throw new IOException("Вы ввели неверную математическую операцию");
                }
            }
        }
    }
}