package org.example.task2;

import java.util.Arrays;

public class Cart {

    private final Item[] contents;
    private int index;

    public Cart(int capacity) {
        this.contents = new Item[capacity]; // тут this потрібен, бо поле і параметр різні
        this.index = 0;
    }

    public void add(Item item) {
        if (isCartFull()) {
            System.out.println("Ваш кошик заповнений!");
            return;
        }
        contents[index] = item;
        index++;
    }

    public void removeById(int id) {
        if (index == 0) return;

        int foundItemIndex = findItemIndexById(id);
        if (foundItemIndex == -1) return;

        shiftArray(foundItemIndex);
    }

    private void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < index - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[index - 1] = null;
        index--;
    }

    private int findItemIndexById(int id) {
        for (int i = 0; i < index; i++) {
            if (contents[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean isCartFull() {
        return index == contents.length;
    }

    public Item[] getItems() {
        return Arrays.copyOf(contents, index);
    }

    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < index; i++) {
            sum += contents[i].getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(getItems()) +
                "}" + "\n";
    }
}
