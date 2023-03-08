public class Field {

    private String name;

    public void giveMoney(Player player, int amount) {
        player.recieveMoney(amount);
    }

    public void pauseField() {

    }

    public void startField(Player player, int amount) {
        amount = 4000;
        player.recieveMoney(amount);
    }
}
