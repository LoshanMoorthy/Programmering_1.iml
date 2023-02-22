public class ChildApp {

    //Metoden skal returenre en tekststreng der beskriver hvilken institution et barn skal gå i, afhængig af barnets alder.
    // Reglerne for dette kan ses på opgavedsedlen

    public static String institution(int age) {
        if(age < 1) {
            return "Home";
        } else if(age < 3) {
            return "Nursery";
        } else if(age < 6) {
            return "Kindergarten";
        } else if(age < 17) {
            return "School";
        }
        return "Out of school";
    }


    // Metoden skal returenre en tekststreng der beskriver hvilket gymnastikhold et barn skal gå på, afhængig af barnets alder og køn.
    // Reglerne for dette kan ses på opgavedsedlen

    public static String team(boolean isBoy, int age) {
        String team = null;

        if(!isBoy && age < 8) {
            team = "Tumbling girls";
        } else if(!isBoy) {
            team = "Springy girls";
        } else if(age < 8) {
            team = "Young cubs";
        } else {
            team = "Cool boys";
        }
        return team;
    }

    public static void main(String[] args) {
        System.out.println("En barn på 5 skal i " + institution(5));
        System.out.println("En pige på 9 skal i " + team(false,7));
    }
}