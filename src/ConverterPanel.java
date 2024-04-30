import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterPanel extends JPanel {

    private JTextField input = new JTextField(10);
    double convertedTextToInt;
    double convertedValue = 0;
    JLabel question = new JLabel("Select currency for conversion from the drop-down menu");
    String[] comboBoxListe = {"EUR -> USD", "EUR -> JPY", "USD -> EUR", "USD -> JPY", "JPY -> USD", "JPY -> EUR"};
    JComboBox currencyChoice = new JComboBox(comboBoxListe);
    JLabel result = new JLabel("Converted Value: " + convertedValue);

    public ConverterPanel() {
        super();
        setBackground(new Color(181, 193, 142));
        add(question);
        add(currencyChoice);
        add(input);
        input.addActionListener(new InputListener());

        JButton button = new JButton("Convert"); // Text auf dem Button
        add(button);
        ActionListener convertButton = new ButtonListener();
        button.addActionListener(convertButton);

        add(result);
    }

    private class InputListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String text = input.getText();
            convertedTextToInt = Double.parseDouble(text);
            //TO-DO try-catch
        }
    }
    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedConverter = (String) currencyChoice.getSelectedItem();
            // TO-DO
            switch (selectedConverter) {
                    case "USD -> EUR":
                        convertedValue = Converter.convertUSDtoEUR(convertedTextToInt);
                        break;
                    case "EUR -> USD":
                        convertedValue = Converter.convertEURtoUSD(convertedTextToInt);
                        break;
                    case "EUR -> JPY":
                        convertedValue = Converter.convertEURtoJPY(convertedTextToInt);
                        break;
                    case "JPY -> EUR":
                        convertedValue = Converter.convertJPYtoEUR(convertedTextToInt);
                        break;
                    case "USD -> JPY":
                        convertedValue = Converter.convertUSDtoJPY(convertedTextToInt);
                        break;
                    case "JPY -> USD":
                        convertedValue = Converter.convertJPYtoUSD(convertedTextToInt);
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
            }
            result.setText("Converted Value: " + convertedValue);
        }
    }

}
