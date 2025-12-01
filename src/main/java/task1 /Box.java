package task1;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        validate(length, "length");
        validate(width, "width");
        validate(height, "height");

        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Універсальна валідація
    private void validate(double value, String field) {
        if (value <= 0) {
            throw new IllegalArgumentException(
                    "Параметр '" + field + "' повинен бути більше нуля"
            );
        }
    }

    public double calculateVolume() {
        return length * width * height;
    }

    public double calculateSideArea() {
        double lh = length * height;
        double wh = width * height;
        return 2 * (lh + wh);
    }

    public double calculateTotalArea() {
        double lw = length * width;
        double lh = length * height;
        double wh = width * height;
        return 2 * (lw + lh + wh);
    }

    public static void main(String[] args) {
        Box b = new Box(5, 6, 8);

        System.out.println("Обʼєм коробки: " + b.calculateVolume());
        System.out.println("Бічна площа: " + b.calculateSideArea());
        System.out.println("Повна площа: " + b.calculateTotalArea());
    }
}
