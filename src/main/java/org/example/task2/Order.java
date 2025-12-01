package org.example.task2;

public class Order {

    private long id;
    private String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {

        StringBuilder bill = new StringBuilder();
        bill.append("=== Order #").append(id)
            .append(" | Customer: ").append(customer).append(" ===\n");

        double total = 0.0;

        for (int i = 0; i < cart.index; i++) {

            Item current = cart.contents[i];
            total += current.price;

            bill.append("• ID: ").append(current.id)
                .append(" | ").append(current.name)
                .append(" | Price: ").append(current.price)
                .append("\n");
        }

        bill.append("--------------------------------\n");
        bill.append("Total: ").append(total);

        return bill.toString();
    }
}
