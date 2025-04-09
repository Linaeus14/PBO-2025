package model.hewan;

import model.Hewan;

// Subkelas 1
public class Anjing extends Hewan {
    // Polimorfisme Dinamis (Method Overriding)
    @Override
    public void suara() {
        System.out.println("Anjing menggonggong");
    }
}
