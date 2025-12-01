package task3;

import java.util.EmptyStackException;

public class IntStack {
    private int[] data;
    private int top;
    private static final int INITIAL_CAPACITY = 20;

    // Конструктор
    public IntStack() {
        this.data = new int[INITIAL_CAPACITY];
        this.top = 0; // Стек порожній
    }

    // Додавання елементу у стек
    public void push(int value) {
        if (top == data.length) {
            grow(); // Розширення початкового масиву, якщо не вистачаж місця
        }
        data[top++] = value;
    }

    // Видалення елементу з верхівки стеку
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data[--top];
    }

    // Перегляд елемента на вершині стеку без його винятку
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data[top - 1];
    }

    // Кількість елементів у стеку
    public int size() {
        return top;
    }

    // Перевірка стеку на порожність
    public boolean isEmpty() {
        return top == 0;
    }

    // Повна очистка стеку
    public void clear() {
        top = 0;
    }

    // Можливість розширити масив
    private void grow() {
        int newCapacity = data.length * 2;
        int[] newData = new int[newCapacity];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}
