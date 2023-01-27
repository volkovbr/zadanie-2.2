public class Main {
    public static void main(String[] args) {
        int startScore = 150;
        int replenishment = 1100;

        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int finishScore = startScore + replenishment + bonus;
        System.out.println("начисленно:" + replenishment);
        if (bonus > 0) {
            System.out.println("начисленно бонусных рублей:" + bonus);
        }
        System.out.println("ваш счет:" + finishScore);
    }
}
