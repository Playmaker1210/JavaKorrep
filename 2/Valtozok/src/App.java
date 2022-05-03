public class App {
    public static void main(String[] args) {
        int num = 6; //tipus: int, nev: num, ertek: 6
        float f = 6.6f;
        double d = 6.6;
        boolean b = true;
        char c = 'a';
        String s = "Hello";

        //Feladat 1: Hozz letre egy szoveg tipuso valtozot és adj neki egy értéket

        //Valtozo hatara
        System.out.print("Int hatarai: ");
        System.out.print(Integer.MIN_VALUE + " ");
        System.out.println(Integer.MAX_VALUE);
        
        //Konstansok
        final int num2 = 6; //ezt az értéket a futásidó alatt nem lehet megváltozatni
        //num2 = 7; //A program nem fog tudni lefordulni

        //Valtozok kiirasa
        System.out.println(num); //num értékének kiirasa
        
        //Tipus koverzio       
        System.out.println(s + " " + num); //Kenyszeritett | a program magatol atalakitja a szamot szovegge

        //Normal tipuskonverzio
        String s2 = "6";
        int num3 = Integer.parseInt(s2);

        num3 = 5;
        s2 = String.valueOf(num3);

        char c2 = 'a';
        num3 = Character.getNumericValue(c2);

        double d2 = 5.5;
        int num4 = (int)d2; //levagja a tizedeserteket
        System.out.println(num4);

        //alapmuveletek
        System.out.println(num3 + num4);
        System.out.println(num3 - num4);
        System.out.println(num3 / num4);
        System.out.println(num3 * num4);

        //Feladat 2:    a,Hozz létre két karakter változot adj nekik egy szám érteket
        //              b,Alakitsd at ezt a két értéket szám típussá
        //              c,Ird ki a két szám értékét a következő formátumban: Eredmény: x; (x az összeg)   
        
        //Tovabbi gyak feladatok: https://www.w3schools.com/java/exercise.asp?filename=exercise_variables1
    }
}