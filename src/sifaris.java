import java.util.Scanner;

public class sifaris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sifaris meblegini qeyd edin: ");
        double mebleg = sc.nextDouble();
        sc.nextLine();
        int catdirilma = 0;
        System.out.println("Catdirilma bolgesini teyin edin: ");
        System.out.println("Bakı");
        System.out.println("Xırdalan");
        System.out.println("Sumqayıt");
        String seherSecimi = sc.nextLine();
        switch(seherSecimi){
            case"Bakı":
                catdirilma = 5;
                break;
            case"Xırdalan":
                catdirilma = 7;
                break;
            case"Sumqayıt":
                catdirilma = 6;
                break;
            default:
                System.out.println("diger seherler movcud deyil.");

        }
        if(catdirilma!=0) {
            if (mebleg > 50) {
                System.out.println(seherSecimi + "-a catdirilma odenissiz olacaq.");
                System.out.println("umumi odeyecyiniz mebleg: " + mebleg);
            } else{
                mebleg += catdirilma;
                System.out.println(seherSecimi + "-a catdirilma " + catdirilma + "azn olacaq.");
                System.out.println("umumi odeyeceyiniz mebleg: " + mebleg);
            }
        }
    }
}
