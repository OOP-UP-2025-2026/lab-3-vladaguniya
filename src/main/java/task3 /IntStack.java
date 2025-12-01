package task3;

import java.util.EmptyStackException;

public class IntStack {

    private int[] elements;
    private int top;
    private static final int INITIAL_CAPACITY = 20;

    // Конструктор
    public IntStack() {
        this.elements = new int[INITIAL_CAPACITY];
        this.top = 0;
    }

    // Додавання елемента у стек
    public void push(int value) {
        if (top == elements.length) {
            expand();
        }
        elements[top++] = value;
    }

    // Видалення та повернення верхнього елемента
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[--top];
    }

    // Повернення верхнього елемента без видалення
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top - 1];
    }

    // Кількість елементів
    public int size() {
        return top;
    }

    // Перевірка, чи стек порожній
    public boolean isEmpty() {
        return top == 0;
    }

    // Очистити стек
    public void clear() {
        top = 0;
    }

    // Розширення масиву
    private void expand() {
        int newCapacity = elements.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }
}
