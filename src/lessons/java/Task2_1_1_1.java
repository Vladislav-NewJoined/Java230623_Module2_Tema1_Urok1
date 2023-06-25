package lessons.java;

//  Draft1_Task2_1_1    Задание_TaskМодуль - Тема - Урок
//  здесь пример: https://stackoverflow.com/questions/43500275/test-interface-implementation-for-simple-calculator


//        Пример _ ППППППППППППППППППППППППППППППППППП
abstract class Operation {
    /*void calculate(int a, int b);*/

    void calculate() {

    }

    public abstract void calculate(int a, int b);
}

public class Task2_1_1_1 {
    static int a = 10;
    static int b = 2;
    static int result = 0;

    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tЗадание в рамках интерфейса java нужно создать калькулятор " +
                "\nвыполняющий 4 основных арифметических функций, сложение, вычитание, деление, умножение, " +
                "\nа также осуществить вывод на результатов на экран\n\nРешение: ");
        Operation add = new Operation() {

            @Override
            public void calculate(int a, int b) {

            }

            {
                result = a + b;
                System.out.println("Сложение: " + a + " + " + b + " = " + result);
            }
        };
        add.calculate();
        Operation substract = new Operation() {

            @Override
            public void calculate(int a, int b) {

            }

            {
                result = a - b;
                System.out.println("Вычитание: " + a + " - " + b + " = " + result);
            }
        };
        Operation multipl = new Operation() {

            @Override
            public void calculate(int a, int b) {

            }

            {
                result = a * b;
                System.out.println("Умножение: " + a + " * " + b + " = " + result);
            }
        };
        Operation division = new Operation() {

            @Override
            public void calculate(int a, int b) {

            }

            {
                result = a / b;
                System.out.println("Деление: " + a + " / " + b + " = " + result);
            }
        };
        add.calculate();
        substract.calculate();
        multipl.calculate();
        division.calculate();
    }
}
//        Конец Примера _ КККККККККККККККК


////        Пример 1 ППППППППППППППППППППППППППППППППППП
//interface Operation {
//    void calculate(int a, int b);
//
//    void calculate();
//}
//public class Draft1_Task2_1_1 {
//    static int a = 10;
//    static int b = 2;
//    static int result = 0;
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tЗадание в рамках интерфейса java нужно создать калькулятор " +
//                "\nвыполняющий 4 основных арифметических функций, сложение, вычитание, деление, умножение, " +
//                "\nа также осуществить вывод на результатов на экран\n\nРешение: ");
//        Operation add = new Operation() {
//
//            @Override
//            public void calculate(int a, int b) {
//                result = a + b;
//                System.out.println("Сложение: " + a + " + " + b + " = " + result);
//            }
//
//            @Override
//            public void calculate() {
//
//            }
//        };
//        add.calculate();
//    }
//}
////        Конец Примера 1 КККККККККККККККК