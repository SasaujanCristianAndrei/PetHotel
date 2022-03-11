package views;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    private JComboBox comboBoxMain;

    private JButton vfDisponibilitateButton;
    private JButton inregistrareButton;

    private JLabel afisareLocLabel;


    public MainView()
    {
        this.setBounds(100, 100, 650, 380);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        comboBoxMain = new JComboBox();
        comboBoxMain.setModel(new DefaultComboBoxModel(new String[] {"CAINE", "PISICA"}));
        comboBoxMain.setBounds(24, 125, 130, 22);
        this.getContentPane().add(comboBoxMain);

        JLabel mainTitluLabel = new JLabel("Hotel pentru Animale");
        mainTitluLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainTitluLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        mainTitluLabel.setBounds(171, 11, 284, 22);
        this.getContentPane().add(mainTitluLabel);

        vfDisponibilitateButton = new JButton("VERIFICA DISPONIBILITATEA");
        vfDisponibilitateButton.setBounds(213, 121, 189, 31);
        this.getContentPane().add(vfDisponibilitateButton);

        afisareLocLabel = new JLabel("");
        afisareLocLabel.setHorizontalAlignment(SwingConstants.CENTER);
        afisareLocLabel.setBounds(452, 120, 160, 27);
        this.getContentPane().add(afisareLocLabel);

        inregistrareButton = new JButton("INREGISTRARE");
        inregistrareButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
        inregistrareButton.setBounds(213, 216, 189, 31);
        this.getContentPane().add(inregistrareButton);

        this.setVisible(true);
    }

    public void addVfDisponibilitateListner(ActionListener action)
    {
        vfDisponibilitateButton.addActionListener(action);
    }
    public void addInregistrareListener(ActionListener action)
    {
       inregistrareButton.addActionListener(action);
    }

    public String getComboBoxMain() {
        return comboBoxMain.getSelectedItem().toString();
    }

    public JButton getVfDisponibilitateButton() {
        return vfDisponibilitateButton;
    }

    public void setVfDisponibilitateButton(JButton vfDisponibilitateButton) {
        this.vfDisponibilitateButton = vfDisponibilitateButton;
    }

    public JButton getInregistrareButton() {
        return inregistrareButton;
    }

    public void setInregistrareButton(JButton inregistrareButton) {
        this.inregistrareButton = inregistrareButton;
    }

    public JLabel getAfisareLocLabel() {
        return afisareLocLabel;
    }

    public void setAfisareLocLabel(String afisareLocLabel) {
        this.afisareLocLabel.setText(afisareLocLabel);
    }
}
