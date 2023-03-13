public class VariablesTheme {

    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1. Вывод характеристик компьютера");

        byte core = 4;
        short streams = 4;
        int ramAmount = 512;
        long ram = 16;
        float cpuFrequency = 2999;
        double cpuFrequencyNominal = 1599.9;
        char os = 'W';
        boolean accessible = true;

        System.out.println("Число ядер: " + core);
        System.out.println("Число потоков: " + streams);
        System.out.println("Количество оперативной памяти, Гб: " + ramAmount);
        System.out.println("Объем оперативной памяти: " + ram);
        System.out.println("Частота процессора, гц: " + cpuFrequency);
        System.out.println("Частота процессора номинальная, гц: " + cpuFrequencyNominal);
        System.out.println("Операционная система, где 'W' - Windows, 'L' - Linux: " + os);
        System.out.println("Подключение установлено: " + accessible + "\n");

        //Задача 2
        System.out.println("Задача 2. Расчет стоимости товара со скидкой");

        int penPrice = 100;
        int bookPrice = 200;
        double totalDiscount = (penPrice+bookPrice)*0.11;


        System.out.println("Общая стоимость без скидки: " + (penPrice+bookPrice));
        System.out.println("Сумма скидки: " + totalDiscount);
        System.out.println("Сумма товаров со скидкой: " + ((penPrice+bookPrice)-totalDiscount + "\n"));

        //Задача 3
        System.out.println("Задача 3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a  \n");

        //Задача 5
        System.out.println("Задача 5. Перестановка значений элементов");
        int a = 2;
        int b = 5;
        int tmp;
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Текущие значения переменных, а = " + a + " b = " + b);
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("Значения после перестановки, а = " + a + " b = " + b + "\n");
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Текущие значения переменных, а = " + a + " b = " + b);
        a -= 3;
        b += 3;
        System.out.println("Значения после перестановки, а = " + a + " b = " + b + "\n");
        System.out.println("Перестановка с помощью побитовой операции");
        System.out.println("Текущие значения переменных, а = " + a + " b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Значения после перестановки, а = " + a + " b = " + b + "\n");

        //Задача 6
        System.out.println("Задача 6. Вывод символов и их кодов");
        char c1 = '#';
        int code1 = 34;
        char c2 = '&';
        int code2 = 38;
        char c3 = '@';
        int code3 = 64;
        char c4 = '^';
        int code4 = 94;
        char c5 = '_';
        int code5 = 95;
        System.out.println("Символ: " + c1 + "\t" + "Код: " + code1);
        System.out.println("Символ: " + c2 + "\t" + "Код: " + code2);
        System.out.println("Символ: " + c3 + "\t" + "Код: " + code3);
        System.out.println("Символ: " + c4 + "\t" + "Код: " + code4);
        System.out.println("Символ: " + c5 + "\t" + "Код: " + code5 + "\n");

        //Задача 7
        System.out.println("Задача 7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char slashReverse = '\\';
        char bracketOpened = '(';
        char bracketClosed = ')';
        char line = '_';
        System.out.println("\t"+ slash + slashReverse);
        System.out.println("   " + slash + "  " + slashReverse);
        System.out.println("  " + slash + line + bracketOpened + " " + bracketClosed + slashReverse);
        System.out.println(" " + slash + "\t" + "    " + slashReverse);
        System.out.println("" + slash + line + line + line + line + slash + slashReverse + line + line + slashReverse + "\n");

        //Задача 8
        System.out.println("Задача 8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        System.out.println("Число 123 содержит:");
        int hundreds = number / 100;
        System.out.println("Сотен: " + hundreds);
        int decades = (number % 103) / 10;
        System.out.println("Десятков: " + decades);
        int units = (number % 120);
        System.out.println("Единиц: " + units);
        System.out.println("Сумма цифр: " +(hundreds + decades + units));
        System.out.println("Произведение цифр: " + (hundreds * decades * units) + "\n");

        //Задача 9
        System.out.println("Задача 9. Вывод времени");
        int totalSec = 86399;
        int hours = totalSec / 3600;
        int minutes = (totalSec - (hours*3600)) / 60;
        int sec = totalSec - (hours * 3600) - (minutes * 60);
        System.out.println(hours + ":" + minutes + ":" + sec);



























    }
}
