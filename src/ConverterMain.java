import javax.swing.*;

public class ConverterMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new ConverterPanel();
        frame.getContentPane().add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}