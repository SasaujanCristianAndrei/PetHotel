package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class SecondView extends JFrame {

	private JTextField textNumeField;
	private JTextField textGreutateField;

	private JComboBox comboSpecieBox;

	private JButton cazeazaButton;
	private JButton pretButton;
	private JButton spalaButton;
	private JButton plimbaAnimalButton;


	public SecondView()
	{

		this.setBounds(100, 100, 650, 380);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setLayout(null);

		JLabel inregistrareAnimalLabel = new JLabel("INREGISTRARE ANIMAL");
		inregistrareAnimalLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		inregistrareAnimalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inregistrareAnimalLabel.setBounds(201, 23, 235, 28);
		this.getContentPane().add(inregistrareAnimalLabel);

		JLabel numeLabel = new JLabel("Nume");
		numeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		numeLabel.setBounds(36, 105, 75, 28);
		this.getContentPane().add(numeLabel);

		JLabel specieLabel = new JLabel("Specie");
		specieLabel.setHorizontalAlignment(SwingConstants.CENTER);
		specieLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		specieLabel.setBounds(36, 150, 75, 28);
		this.getContentPane().add(specieLabel);

		JLabel greutateLabel = new JLabel("Greutate");
		greutateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		greutateLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		greutateLabel.setBounds(36, 198, 75, 28);
		this.getContentPane().add(greutateLabel);

		textNumeField = new JTextField();
		textNumeField.setBounds(113, 111, 117, 20);
		this.getContentPane().add(textNumeField);
		textNumeField.setColumns(10);

		textGreutateField = new JTextField();
		textGreutateField.setColumns(10);
		textGreutateField.setBounds(113, 204, 117, 20);
		this.getContentPane().add(textGreutateField);

		comboSpecieBox = new JComboBox();
		comboSpecieBox.setModel(new DefaultComboBoxModel(new String[] {"CAINE", "PISICA"}));
		comboSpecieBox.setBounds(113, 155, 117, 22);
		this.getContentPane().add(comboSpecieBox);

		cazeazaButton = new JButton("CAZEAZA");
		cazeazaButton.setBounds(113, 254, 102, 23);
		this.getContentPane().add(cazeazaButton);

		pretButton = new JButton("VEZI PRET CURENT CAZARE SI SERVICII");
		pretButton.setBounds(181, 302, 274, 28);
		this.getContentPane().add(pretButton);

		JLabel serviciiExtraLabel = new JLabel("SERVICII EXTRA");
		serviciiExtraLabel.setHorizontalAlignment(SwingConstants.CENTER);
		serviciiExtraLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		serviciiExtraLabel.setBounds(437, 105, 123, 28);
		this.getContentPane().add(serviciiExtraLabel);

		spalaButton = new JButton("SPALA ANIMAL");
		spalaButton.setBounds(437, 154, 127, 24);
		this.getContentPane().add(spalaButton);

		plimbaAnimalButton = new JButton("PLIMBA ANIMAL");
		plimbaAnimalButton.setBounds(437, 203, 127, 23);
		this.getContentPane().add(plimbaAnimalButton);

		this.setVisible(false);

	}

	public String getTextNumeField() {
		return textNumeField.getText();
	}

	public void setTextNumeField(String textNumeField) {
		this.textNumeField.setText(textNumeField);
	}

	public double getTextGreutateField() {
		return Double.parseDouble(textGreutateField.getText());
	}

	public void setTextGreutateField(double textGreutateField) {
		this.textGreutateField.setText(String.valueOf(textGreutateField));
	}

	public String getComboSpecieBox() {
		return comboSpecieBox.getSelectedItem().toString();
	}

	public void addCazeazaListener(ActionListener action)
	{
		cazeazaButton.addActionListener(action);
	}
	public void addVeziPretListener(ActionListener action)
	{
		pretButton.addActionListener(action);
	}
	public void addSpalaListener(ActionListener action)
	{
		spalaButton.addActionListener(action);
	}
	public void addPlimbaListener(ActionListener action)
	{
		plimbaAnimalButton.addActionListener(action);
	}

	public void addExistListener(WindowListener action)
	{
		this.addWindowListener(action);
	}

	public void showMessage(String message)
	{
		JOptionPane.showMessageDialog(this,message);
		//refresh();
	}

	/*public void refresh()
	{
		textNumeField.setText(null);
		textGreutateField.setText(null);
	}*/
}
