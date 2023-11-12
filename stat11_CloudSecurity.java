import java.util.Timer;
import java.util.TimerTask;

public class SecurityMonitoringSystem {
    public static void main(String[] args) {
        // Аналіз журналів подій
        boolean suspiciousActivity = analyzeEventLogs();
        // Перевірка доступу до ресурсів
        boolean correctResourceAccess = checkResourceAccess();

        printResult("Виявлено підозрілу активність в журналах подій.", suspiciousActivity);
        printResult("Доступ до ресурсів у порядку.", correctResourceAccess);
    }

    // Метод для аналізу журналів подій
    private static boolean analyzeEventLogs() {
        int failedLoginAttempts = getFailedLoginAttemptsFromLogs();
        return failedLoginAttempts > 5;
    }

    // Метод для перевірки доступу до ресурсів
    private static boolean checkResourceAccess() {
        return checkFileAccess("importantfile.txt");
    }

    // Функція для отримання кількості невдалих спроб входу з журналів подій
    private static int getFailedLoginAttemptsFromLogs() {
        return 7; // Приклад значення, яке можна отримати з журналів
    }

    // Функція для перевірки доступу до файлу
    private static boolean checkFileAccess(String fileName) {
        return isUserAuthorizedToAccessFile(fileName);
    }

    // Функція для перевірки авторизації користувача
    private static boolean isUserAuthorizedToAccessFile(String fileName) {
        return true; // У цьому прикладі завжди повертаємо true
    }

    // Функція для виводу результату
    private static void printResult(String message, boolean condition) {
        System.out.println(condition ? message : "Не " + message);
    }
}