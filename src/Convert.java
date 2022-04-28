import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convert extends JFrame {

    private JComboBox from;
    private JComboBox to;

    private JPanel converter;
    private JButton convert;

    private JTextField amount;
    private JLabel result;

    public Convert(String title) throws HeadlessException {

        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(converter);
        this.pack();

        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int f = from.getSelectedIndex();
                int t = to.getSelectedIndex();
                int val = Integer.parseInt(amount.getText());
                Temperature temp = null;
                switch (f) {
                    case 0 -> temp = new Celsius(val);
                    case 1 -> temp = new Fahrenheit(val);
                    default -> temp = new Kelvin(val);
                }
                temp = temp.convert(t + 1);
                result.setText("Result: " + temp.toString());
            }
        });

    }

    public static void main(String[] args) {
        JFrame converter = new Convert("Temperature Converter");
        converter.setResizable(false);
        converter.setVisible(true);
    }

}
