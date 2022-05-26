package ex8_weighting;

public class Main {

    public static void main(String[] args) {
        Item hat = new Item("hat", 2);
        Item shoes = new Item("shoes", 4);
        Item laptop = new Item("laptop", 7);
        Item suit = new Item("suit", 5);
        Item phone = new Item("phone", 1);
        Item dumbbell = new Item("dumbbell", 25);
        Item cinderblock = new Item ("cinder block", 38);

        Suitcase suitcase1 = new Suitcase(50);
        Suitcase suitcase2 = new Suitcase(40);

        suitcase1.addItem(hat);
        suitcase1.addItem(shoes);
        suitcase1.addItem(laptop);
        suitcase1.addItem(suit);
        suitcase1.addItem(phone);
        suitcase1.addItem(dumbbell);

        suitcase2.addItem(cinderblock);
        suitcase2.addItem(phone);
        suitcase2.addItem(phone);

        Hold hold = new Hold(100);
        hold.addSuitcase(suitcase1);
        hold.addSuitcase(suitcase2);

        System.out.println("Suitcase 1 contents: ");
        suitcase1.printItems();
        System.out.println("Suitcase 1 weight: " + suitcase1.totalWeight());

        System.out.println("\nSuitcase 2 contents: ");
        suitcase2.printItems();
        System.out.println("Suitcase 2 weight: " + suitcase2.totalWeight());

        System.out.println("\nHold contents: ");
        hold.printItems();
        System.out.println("Hold weight: " + hold.totalWeight());


    }

}
