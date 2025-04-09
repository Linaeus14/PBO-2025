package model.hewan;

import model.Hewan;

// Subkelas 2
public class Kucing extends Hewan {
    // Polimorfisme Dinamis (Method Overriding)
    @Override
    public void suara() {
        System.out.println("Kucing mengeong");
    }
}
