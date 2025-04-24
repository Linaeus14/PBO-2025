package model;

// Implementasi Interface
public class MouseBaru implements Mouse {
    @Override
    public void klikKiri() {
        System.out.println("Klik kiri dilakukan.");
    }

    @Override
    public void klikKanan() {
        System.out.println("Klik kanan dilakukan.");
    }

    @Override
    public int doubleKlik() {
        System.out.println("Double klik dilakukan.");

        return 0;
    }

    public static void main(String[] args) {
        Mouse mouse = new MouseBaru();
        mouse.klikKiri();
        mouse.klikKanan();
        mouse.doubleKlik();
    }
}
