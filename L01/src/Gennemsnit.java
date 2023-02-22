import java.util.*;
public class Gennemsnit {
    public static double main(String[] args) {
        Kid kids1 = new Kid(6, true, false);
        Kid kids2 = new Kid(6, true, false);
        Kid kids3 = new Kid(8, true, false);
        Kid kids4 = new Kid(15, false, true);
        Kid kids5 = new Kid(16, false, true);
        Kid kids6 = new Kid(18, false, true);

        ArrayList<Kid> kids = new ArrayList<>();
        ArrayList<Kid> teenagers = new ArrayList<>();
        ArrayList<Kid> all = new ArrayList<>();

        kids.add(kids1);
        kids.add(kids2);
        kids.add(kids3);

        teenagers.add(kids4);
        teenagers.add(kids5);
        teenagers.add(kids6);

        return all.stream()
                  .mapToDouble(d -> d.getAge())
                  .average()
                  .orElse(0.0);
    }
}
