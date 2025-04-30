import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Program ini adalah contoh sederhana GUI menggunakan Swing.
 * Program ini menampilkan sebuah jendela dengan label dan tombol
 * untuk mengganti warna latar belakang dan warna teks.
 */
public class App {
    public static void main(String[] args) {
        // Membuat JFrame baru dengan judul "Simple GUI Example"
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Menutup program saat jendela ditutup
        frame.setSize(400, 300); // Mengatur ukuran jendela
        frame.setLayout(new BorderLayout()); // Mengatur layout menjadi BorderLayout

        // Membuat JLabel untuk menampilkan teks di tengah jendela
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);
        label.setOpaque(true); // Mengaktifkan latar belakang label agar terlihat
        label.setBackground(Color.WHITE); // Mengatur warna latar belakang menjadi putih
        label.setForeground(Color.BLACK); // Mengatur warna teks menjadi hitam
        frame.add(label, BorderLayout.CENTER); // Menambahkan label ke tengah jendela

        // Membuat JButton untuk mengganti warna latar belakang
        JButton toggleButton = new JButton("Ganti Warna");
        frame.add(toggleButton, BorderLayout.SOUTH); // Menambahkan tombol di bagian bawah jendela

        // Menambahkan ActionListener ke tombol
        toggleButton.addActionListener(new ActionListener() {
            private boolean isWhite = true; // Variabel untuk melacak warna saat ini

            @Override
            public void actionPerformed(ActionEvent e) {
                // Logika untuk mengganti warna latar belakang dan teks
                if (isWhite) {
                    label.setBackground(Color.BLACK); // Mengatur latar belakang menjadi hitam
                    label.setForeground(Color.WHITE); // Mengatur teks menjadi putih
                } else {
                    label.setBackground(Color.WHITE); // Mengatur latar belakang menjadi putih
                    label.setForeground(Color.BLACK); // Mengatur teks menjadi hitam
                }
                isWhite = !isWhite; // Membalik nilai isWhite
            }
        });

        // Menampilkan jendela
        frame.setVisible(true);
    }
}
