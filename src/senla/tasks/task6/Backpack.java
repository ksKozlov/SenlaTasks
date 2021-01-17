package senla.tasks.task6;

import java.util.ArrayList;

public class Backpack {
    private double maxWeight;
    private ArrayList<Item> bestSet;
    private double bestPrice;

    public Backpack(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    private double calculateWeight(ArrayList<Item> items) {
        double sumWeight = 0;

        for (Item i:
             items) {
            sumWeight += i.getWeight();
        }

        return sumWeight;
    }

    private double calculatePrice(ArrayList<Item> items) {
        double sumPrice = 0;

        for (Item i:
             items) {
            sumPrice += i.getPrice();
        }

        return sumPrice;
    }

    private void checkSet(ArrayList<Item> items) {
        if (bestSet == null) {
            if (calculateWeight(items) <= maxWeight) {
                bestSet = items;
                bestPrice = calculatePrice(items);
            }
        }
        else {
            if (calculateWeight(items) <= maxWeight && calculatePrice(items) > bestPrice) {
                bestSet = items;
                bestPrice = calculatePrice(items);
            }
        }
    }

    public void makeAllSets(ArrayList<Item> items) {
        if (items.size() > 0) {
            checkSet(items);
        }

        for (int i = 0; i < items.size(); i++) {
            ArrayList<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public ArrayList<Item> getBestSet() {
        return bestSet;
    }
}
