/*
Один из сотовых операторов решил сделать своим клиентам приятный бонус:
если клиент пополняет счёт более чем на 1000 рублей, то сотовый оператор дарит ему по 1 рублю
за каждые полные 100 рублей пополнения.

Примеры. Начальные данные: у клиента на счёте 100 рублей.

Клиент пополнил счёт на 100 рублей - бонусов нет, итоговая сумма на счету клиента - 200 рублей
Клиент пополнил счёт на 1100 рублей - бонус равен 11 рублям, итоговая сумма на счету клиента - 1211 рублей
 */

public class Main {
    public static void main(String[] args) {
        int startAmount = 100;
        int incomeAmount = 200;
        int bonus = 0;
        int totalAmount = 0;
        if (incomeAmount > 1000) {
            bonus = incomeAmount / 100;
            totalAmount = startAmount + incomeAmount + bonus;

        } else {
            totalAmount = startAmount + incomeAmount;
        }
        System.out.println("Итоговый счёт: " + totalAmount);
        System.out.println("из них " + bonus + " бонусных рублей");

    }
}
