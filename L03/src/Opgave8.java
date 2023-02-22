import java.util.Scanner;

public class Opgave8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number from 1-12 indicating the month: ");
        int inputMonth = sc.nextInt();

        System.out.print("Enter a number from 1-31 indicating the day: ");
        int inputDay = sc.nextInt();

        System.out.println("It is " + findSeason(inputDay, inputMonth) + " season.");
    }

    public static String findSeason(int day, int month) {
        String season = null;

        if(month >= 1 && month <= 3) {
            season = "Winter";
            if((month == 3) && (21 <= day))
                season = "Spring";
        } else if (4 <= month && month <= 6){
            season = "Spring";
            if((month == 6) && (21 <= day))
                season = "Summer";
        } else if (7 <= month && month <= 9){
            season = "Summer";
            if((month == 9) && (21 <= day))
                season = "Fall";
        } else if (10 <= month && month <= 12){
            season = "Fall";
            if((month == 12) && (21 <= day))
                season = "Winter";
        }
        return season;
    }
}