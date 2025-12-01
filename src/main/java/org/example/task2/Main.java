package org.example.task2;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart(10);

        cart.add(new Item(1, "iPhone 15 Pro", 45999));
        cart.add(new Item(2, "Acer Aspire 7", 28999));
        cart.add(new Item(3, "Sony Bravia 50\" 4K HDR", 24999));
        cart.add(new Item(4, "Whirlpool W7 Пральна машина", 16999));
        cart.add(new Item(5, "LG InstaView Холодильник", 33999));
        cart.add(new Item(6, "Jura E8 Кавомашина", 38999));
        cart.add(new Item(7, "Electrolux Електрична плита", 12999));
        cart.add(new Item(8, "Xiaomi G10 Пилосос", 9499));
        cart.add(new Item(9, "Panasonic NN-SD27 Мікрохвильова піч", 3999));
        cart.add(new Item(10, "Remington AirStyle Фен", 1999));

        System.out.println(cart);

        cart.removeById(9);

        System.out.println(cart);

        Order order = new Order(1L, "Vlada");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);
    }
}
