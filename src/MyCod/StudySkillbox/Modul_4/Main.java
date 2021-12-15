package MyCod.StudySkillbox.Modul_4;

import java.util.Scanner;

public class Main {
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000; // минимальная сумма инвестиций

    public static void main (String[] args) {
        while (true) {
            System.out.println("Введите сумму доход компании за месяц " +
                    "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt();

            if (!checkIncomeRange(income)) {
                continue;
            }

            double managerSalary = income*managerPercent;
            double pureIncome = income - managerSalary - calculateFixedCharges(); // чисты доход
            double taxAmount = mainTaxPercent*pureIncome; // сумма налога
            double pureIncomeAfterTax = pureIncome - taxAmount; // чистый доход после уплаты налогов

            boolean canMakeInvestments = pureIncomeAfterTax >= minInvestmentsAmount; // инвестируем да, нет
            System.out.println("Зарплата мененджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " + (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " + (canMakeInvestments ? "да" : "нет"));
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }
private static boolean checkIncomeRange(int income) {
        if (income < minIncome) {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome) {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
}
private static int calculateFixedCharges() {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
}
}
