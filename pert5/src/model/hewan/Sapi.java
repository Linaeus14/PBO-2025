package model.hewan;

import model.Hewan;

// Subkelas 3
public class Sapi extends Hewan {
    // Polimorfisme Dinamis (Method Overriding)
    @Override
    public void suara() {
        System.out.println("Sapi melenguh");
    }
}
