//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialАmount = 100;
        int replenishmentAmount = 1422;
        int bonus;
        int totalAmount1;
        int totalAmount2;
        if (replenishmentAmount >= 1000) {
            bonus = (replenishmentAmount / 100);
            totalAmount1 = (initialАmount + replenishmentAmount + bonus);
            System.out.println("Бонус равен " + bonus + ", Итоговая сумма " + totalAmount1);
        } else {
            totalAmount2 = (initialАmount + replenishmentAmount);
            System.out.println("Бонусов нет, итоговая сумма " + totalAmount2);
        }
    }
}