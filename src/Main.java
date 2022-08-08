public class Main {
    public static void main(String[] args) {

// задание 1

    byte dress = 3;
    short pan = 227;
    int matches = 10392;
    long days = 15777L;
    float money = 37.7f;
    double pi = 3.14;
    char i = 144;
    boolean newDress = dress < 5;
    System.out.println(pan);
    System.out.println(newDress);

// Задание 2
    double boxer1 =  78.2;
    double boxer2 = 82.7;
    double twoBoxerWeight = boxer1 + boxer2;
    double weightDifferenceBoxer = boxer2 - boxer1;
    System.out.println("Общий вес бойцов " + twoBoxerWeight + " кг");
    System.out.println("Разница в весе бойцов " + weightDifferenceBoxer + " кг");

//Задание 3
    byte bananas = 5;
    int bananasWeight = bananas * 80;
    int milk = 200;
    int milkWeight = milk * 105;
    int icecream = 2;
    int icecreamWeight = icecream * 100;
    byte eggs = 4;
    int eggsWeight = eggs * 70;
    int allWeightGr = bananasWeight + milkWeight + icecreamWeight + eggsWeight;
    System.out.println("Общий вес завтрака " + allWeightGr + " гр");
    int allWeightKg = allWeightGr / 1000;
    System.out.println("Общий вес завтрака " + allWeightKg + " кг");

//Задание 4
   byte boxerDown = 7;
   float days1 = boxerDown / 0.25f;
   float days2 = boxerDown / 0.5f;
   System.out.println("Дней надо " + days1 + " при потере по 250гр/день");
   System.out.println("Дней надо " + days2 + " при потере по 500гр/день");
   float allDays = (days1 + days2) / 2;
   System.out.println("В среднем дней надо " + allDays);

//Задание 5
   int masha = 67760;
   int denis = 83690;
   int kristina = 76230;
   double newMasha = (masha * 0.1) + masha;
   double newDenis = (denis * 0.1) + denis;
   double newKristina = (kristina * 0.1) + kristina;
   double differenceMasha = newMasha - masha;
   double differenceDenis = newDenis - denis;
   double differenceKristina = newKristina - kristina;
   System.out.println("Маша теперь получает " + newMasha + " рублей." + " Годовой доход вырос на " + differenceMasha + " рублей.");
   System.out.println("Денис теперь получает " + newDenis + " рублей." + " Годовой доход вырос на " + differenceDenis + " рублей.");
   System.out.println("Кристина теперь получает " +  newKristina + " рублей." + " Годовой доход вырос на " + differenceKristina + " рублей.");
//Задание 6
   byte a = 12;
   byte b = 27;
   byte c = 44;
   byte d = 15;
   byte e = 9;
   int result = a * (b + (c - d * e));
   int outResult = result * -1;
   System.out.println(result);
   System.out.println(outResult);

//Задание 7
   byte f = 5;
   byte g = 7;
   int resultF = (f + g) - f;
   int resultG = (g + f) - g;
   System.out.println("f = " + resultF + " g = " + resultG);

//Задание 8
   short j = 498;
   int j2 = (j / 10);
   if (j2 < 20){
       int h = j2 - 10;
       System.out.println("h = " + h);
   }
        if (j2 < 30 && j2 >= 20){
            int h = j2 - 20;
            System.out.println("h = " + h);
        }
        if (j2 < 40 && j2 >= 30){
            int h = j2 - 30;
            System.out.println("h = " + h);
        }
        if (j2 < 50 && j2 >= 40){
            int h = j2 - 40;
            System.out.println("h = " + h);
        }
        if (j2 < 60 && j2 >= 50){
            int h = j2 - 50;
            System.out.println("h = " + h);
        }
        if (j2 < 70 && j2 >= 60){
            int h = j2 - 60;
            System.out.println("h = " + h);
        }
        if (j2 < 80 && j2 >= 70){
            int h = j2 - 70;
            System.out.println("h = " + h);
        }
        if (j2 < 90 && j2 >= 80){
            int h = j2 - 80;
            System.out.println("h = " + h);
        }

    }

}

