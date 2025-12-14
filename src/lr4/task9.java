package lr4;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alf = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnmЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮйцукенгшщзхъфывапролджэячсмитьбю1234567890!@#$%^&*() ";

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ:");
        int k = scanner.nextInt();
        scanner.nextLine();

        String shifr = shifrovka(text, k, alf);
        System.out.println("Текст после преобразования: " + shifr);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String otvet = scanner.nextLine();

        if (otvet.equals("y")) {
            String deshifr = shifrovka(shifr, -k, alf);
            System.out.println("Обратное преобразование: " + deshifr);
        } else if (otvet.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

        scanner.close();
    }

    public static String shifrovka(String text, int sdvig, String alf) {
        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            int i = alf.indexOf(c);
            if (i != -1) {
                int n = (i + sdvig) % alf.length();
                if (n < 0) n += alf.length();
                sb.append(alf.charAt(n));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}