import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int birthYear,zodiacYear;
        String zodiac = "";

        System.out.print("Enter Year of Bird : ");
        birthYear = inp.nextInt();
        zodiacYear = birthYear % 12;

        switch (zodiacYear){
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Cockerel";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Mouse";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Sheep";
            default:
        }
        System.out.print("\nChinese zodiac sign "+ zodiac );
    }
}