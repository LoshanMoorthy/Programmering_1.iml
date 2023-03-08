public class Player {

    private String name;
    private int money;
    private int currentPosition;
    // list of property


    public Player(String name, int money, int currentPosition) {
        this.name = name;
        this.money = money;
        this.currentPosition = currentPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void recieveMoney(int amount) {
        money += amount;
    }

    public void bankrupt() {
        if (money >= 0) {
            System.out.println("Is bankrupt");
        }
    }
}
