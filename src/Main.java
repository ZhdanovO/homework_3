public class Main {
    public static void main(String[] args) {
        //task 1
        byte clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task 2
        byte deviceOS = 1;
        int clientDeviceYear = 2015;

        if (deviceOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (deviceOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (deviceOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (deviceOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task 3
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным годом");
        } else {
            System.out.println(year + " не является високосным годом");
        }

        //task 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка карты займет одни сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка карты займет двое суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка карты займет трое суток");
        }

        //task 5
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц с порядковым номером " + monthNumber + " это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц с порядковым номером " + monthNumber + " это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц с порядковым номером " + monthNumber + " это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц с порядковым номером " + monthNumber + " это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
