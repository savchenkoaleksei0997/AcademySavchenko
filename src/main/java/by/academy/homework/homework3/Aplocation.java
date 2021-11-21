package by.academy.homework.homework3;

import java.util.Scanner;

public class Aplocation {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя : ");
        String nameBuyer = scanner.nextLine();

        User buyer = new User(nameBuyer, 0);
        User seller = new User("Продовец", 1000000);

        int numberOfProductNames = 10;
        Product[] products = new Product[numberOfProductNames];
        Product[] basket = new Product[20];

        Deal deal = new Deal(seller, buyer, products, basket);

        products[0] = new Milk("Молоко Белакт", 0.5, 1.85, 1);
        products[1] = new Milk("Молоко Белакт", 1, 2.44, 1);
        products[2] = new Apple("Яблоки белоруские 'Сетка' ", 0.5, 1.59, 1);
        products[3] = new Apple("Яблоки польские 'Сетка'", 1, 2.87, 1);
        products[4] = new Bread("Хлеб бородинский 'Половина'", 0.2, 1.3, 1);
        products[5] = new Bread("Хлеб бородинский ", 0.4, 1.97, 1);
        products[6] = new Cheese("Сыр Ленинградский", 0.4, 3.86, 1);
        products[7] = new Cheese("Сыр пряный", 0.5, 4.65, 1);
        products[8] = new Chocolate("Шоколад Milka", 0.1, 2.5, 1);
        products[9] = new Chocolate("Шоколад Nestle", 0.1, 2.96, 1);

        do {
            System.out.println(".............МЕНЮ.............");
            System.out.println(".Для выбора продуктов введите 1." + "\n.Для просмотра товара введите 2." +
                    "\n.Для просмотра корзины введите 3." + "\n.Для перехода к оплате и печате чека введите 4.");
            int caseShop = scanner.nextInt();
            switch (caseShop) {
                case 1:
                    do {
                        System.out.println("Для выхода в меню введите 0 !");
                        System.out.print("Введите ID продукта который хотите преобрести :  ");
                        int number = scanner.nextInt();
                        if (number == 0) {
                            break;
                        }
                        if (number < products.length) {
                            deal.add(products[number - 1]);
                        } else {
                            System.out.println("ID продукта отсутвует , выберите еще раз.");
                        }
                    } while (true);

                case 2:
                    deal.listProduct();
                    break;

                case 3:
                    do {
                        System.out.println("..........КОРЗИНА..........");
                        deal.basketPrint();
                        System.out.println("Общая сумма покупок.........." + deal.getFullPrice());
                        System.out.println("Для выхода в мню введите 0.");
                        System.out.print("Для удаление продукта укажите его ID .");
                        int deleteNumber = scanner.nextInt();
                        if (deleteNumber == 0) {
                            break;
                        }
                        if (deleteNumber < basket.length) {
                            deal.delete(deleteNumber - 1);
                        } else {
                            System.out.println("ID продукта отсутвует , выберите еще раз.");
                        }
                    } while (true);

                case 4:
                    do {
                        System.out.println("Суума к оплате.........." + deal.getFullPrice());
                        System.out.print("Внесите сумму :");
                        double moneyBuyer = scanner.nextDouble();
                        deal.deposition(moneyBuyer);
                        if (deal.calculation() == 0 || deal.calculation() > 0) {
                            System.out.println("..........ЧЕК..........");
                            deal.basketPrint();
                            System.out.println("ИТОГ.........." + deal.getFullPrice() + "...Рублей");
                            System.out.println("Средств внесено....." + moneyBuyer + "...Рублей");
                            System.out.println("Сдача.........." + deal.calculation() + "...Рублей");
                            System.out.println("Приходите к нам еще!!!");
                            return;
                        } else if (deal.calculation() < 0) {
                            System.out.println("Средств недостаточно, внесите большую сумму!!!");
                        }
                    } while (true);
            }
        } while (true);
    }
}
