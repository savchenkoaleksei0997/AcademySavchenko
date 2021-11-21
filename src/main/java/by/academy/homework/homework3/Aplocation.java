package by.academy.homework.homework3;

import java.util.Scanner;

public class Aplocation {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        BelarusianBumberValidator numberPhone = new BelarusianBumberValidator();
        EmailValidator emailBuyer = new EmailValidator();
        DataValidator buyerDataOfBirth = new DataValidator();

        User buyer = new User( );
        User seller = new User("Продовец", 1000000);

        Product[] products = new Product[10];
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


        System.out.println("Добро пожаловать в Магазин, введите личные данные для входа в МЕНЮ.");
        do {
            if (buyer.getName() == null){
                System.out.print("Введите ваше имя : ");
                String nameBuyer = scanner.nextLine();
                buyer.setName(nameBuyer);
            }

            if (buyer.getPhone() == null) {
                System.out.println("Введите ваш номер телефона (+375......... )");
                String numberPhoneBuyer = scanner.next();
                if (numberPhone.isValid(numberPhoneBuyer) == true) {
                    buyer.setPhone(numberPhoneBuyer);
                } else {
                    System.err.println("Вы ввели некоректный номер телефона, введите еще раз.");
                    continue;
                }
            }

            if (buyer.getEmail() == null) {
                System.out.println("Введите вашу электронную почту : ");
                String buyerEmail = scanner.next();
                if (emailBuyer.isValid(buyerEmail) == true) {
                    buyer.setEmail(buyerEmail);
                }else {
                    System.err.println("Вы ввели некоректный email, введите еще раз.");
                }
            }

            if (buyer.getDateOfBirth() == null){
                System.out.println("Введите дату вашего рождения (dd/MM/yyyy , dd-MM-yyyy): ");
                String dateOfBirth = scanner.next();
                if (buyerDataOfBirth.isValid(dateOfBirth)) {
                    buyer.setDateOfBirth(dateOfBirth);
                    break;
                }else {
                    System.err.println("Вы ввели дату неправильно, введите еще раз.");
                }

            }

        }while (true);

        System.out.println("---------------------------------------------");
        do {
            System.out.println(".............МЕНЮ.............");
            System.out.println(".Для выбора продуктов введите 1." + "\n.Для просмотра товара введите 2." +
                    "\n.Для просмотра корзины введите 3." + "\n.Для просмотра личной информации введите 4." +
                    "\n.Для перехода к оплате и печате чека введите 5." +
                    "\n.Для выхода из магазина введите 6.");
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
                                System.err.println("ID продукта отсутвует , выберите еще раз.");
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
                                System.err.println("ID продукта отсутвует , выберите еще раз.");
                            }
                        } while (true);
                        break;

                    case 4:
                        deal.printBuyerInfo(buyer);
                        break;

                    case 5:
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
                                System.err.println("Средств недостаточно, внесите большую сумму!!!");
                            }
                        } while (true);

                    case 6:
                        return;

                    default:
                        System.err.println("Введенные номер отсутствует, выберите еще раз.");
                }
        } while (true);
    }
}
