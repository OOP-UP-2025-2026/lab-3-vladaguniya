package task1;

public class Box {
    private double length;
    private double width;
    private double height;

    // Конструктор
    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    // Private сеттери з валідацією
    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Введена довжина повинна бути більше за 0");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Введена ширина повинна бути більше за 0");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Введена висота повинна бути більше за 0");
        }
        this.height = height;
    }

    // Методи для розрахунків
    public double getVolume() {
        return length * width * height;
    }

    public double getLateralSurfaceArea () {
        return 2 * (length * height + width * height);
    }

    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    // Метод main для тестування
    public static void main(String[] args) {
        try {
            Box box = new Box(5, 6, 8);

            System.out.println("Об'єм: " + box.getVolume());
            System.out.println("Площа бічної поверхні: " + box.getLateralSurfaceArea());
            System.out.println("Площа поверхні: " + box.getSurfaceArea());
        } catch (IllegalArgumentException error) {
            System.out.println("Помилка: " + error.getMessage());
        }
    }
}
