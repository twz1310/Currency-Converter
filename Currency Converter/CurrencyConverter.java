import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CurrencyConverter extends JFrame {
	private JTextField tfSGD;
	private JTextField tfUSD;
	private JTextField tfEuros;
	private double SGD, USD, Euros;

	public CurrencyConverter() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(3, 2, 10, 3));

		cp.add(new JLabel("Singapore Dollars"));

		tfSGD = new JTextField("", 10);
		tfSGD.setHorizontalAlignment(JTextField.RIGHT);
		cp.add(tfSGD);
		tfSGD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double moneyIn = Double.parseDouble(tfSGD.getText());
				USD = moneyIn / 1.41;
				Euros = moneyIn * 0.65;
				tfUSD.setText(String.format("%.2f", USD));
				tfEuros.setText(String.format("%.2f", Euros));
			}
		});

		cp.add(new JLabel("US Dollars:"));

		tfUSD = new JTextField("", 10);
		tfUSD.setHorizontalAlignment(JTextField.RIGHT);
		cp.add(tfUSD);
		tfUSD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double moneyIn = Double.parseDouble(tfUSD.getText());
				SGD = moneyIn * 1.41;
				Euros = moneyIn * 0.92;
				tfSGD.setText(String.format("%.2f", SGD));
				tfEuros.setText(String.format("%.2f", Euros));

			}
		});

		cp.add(new JLabel("Euros:"));

		tfEuros = new JTextField("", 10);
		tfEuros.setHorizontalAlignment(JTextField.RIGHT);
		cp.add(tfEuros);
		tfEuros.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double moneyIn = Double.parseDouble(tfEuros.getText());
				SGD = moneyIn / 0.65;
				USD = moneyIn / 0.92;
				tfSGD.setText(String.format("%.2f", SGD));
				tfUSD.setText(String.format("%.2f", USD));

			}
		});

		setVisible(true);
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Currency Converter");

	}

	public static void main(String[] args) {
		new CurrencyConverter();
	}
}
