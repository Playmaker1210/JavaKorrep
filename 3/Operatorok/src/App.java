public class App {
    public static void main(){
        //https://www.w3schools.com/java/java_operators.asp
        //MATEMATIKAI OPERÁTOROK
        int num = 5; //ertek ado operátor
        num += 5; //num = num + 5 rövidítése
        num -= 5; //num = num - 5 rövidítése
        num *= 5; //num = num * 5 rövidítése
        num /= 5; //num = num / 5 rövidítése || LEVAGJA A TIZEDES JEGYEKET

        //Moduló vagyis maradékos osztás
        //Az osztzás eredménye nem a hányados lesz hanem a maradék
        System.out.println("Normal osztas eredmenye: " + 6/4);
        System.out.println("Maradekos osztas eredmenye: " + 6%4);

        //ÖSSZEHASONLÍTÓ OPERÁTOROK
        //egyenlőség vizsgálat
        int num2 = 6;
        boolean b = num2 == 6;
        System.out.println("Bool erteke: " + b);

        num2 = 5;
        b = num2 == 6;
        System.out.println("Bool erteke: " + b);

        //nem egyenlő
        num2 = 6;
        b = num2 != 6;
        System.out.println("Bool erteke: " + b);

        num2 = 5;
        b = num2 != 6;
        System.out.println("Bool erteke: " + b);

        //Kisebb, nagyobb, nagyobb egyenlő, kisebb egyenlő

        //LOGIKAI OPERÁTOROK
        //logikai és (&&)
        //Mindkét feltételnek teljesülnie kell ahhoz, hogy igazat adjon vissza
        //ha az egyik feltétel hamis az egész vizsgálat hamis lesz
        int num3 = 5;
        int num4 = 6;
        boolean b2 = num3 < 6 && num4 == 6; //barmelyik logikai operátort fel lehet használni a vizsgálathoz
        System.out.println("Bool erteke: " + b2);

        //logikai vagy (||)
        //Itt elég az egyik feltétlenek teljesülnie ahhoz hogy igaz legyen a vizsgálat
        num3 = 8;
        num4 = 6;
        b2 = num3 < 6 || num4 == 6;
        System.out.println("Bool erteke: " + b2);

        //logikai tagadás (!)
        //Itt tagadja a meglévő értéket vagyis igazból hamis lesz, és hamisból igaz
        boolean b3 = true;
        System.out.println("Tagadás elott: " + b3 + "Tagadás után: " + !b3);

        //++ és --
        int num5 = 6;
        System.out.println("Num5: " + num5);
        System.out.println("Num5++: " + num5++);
        System.out.println("++Num5: " + ++num5); //Műveleti sorrend
        System.out.println("++Num5: " + ++num5);

        //Feladatok: https://www.w3schools.com/java/exercise.asp?filename=exercise_operators1
    }
}
