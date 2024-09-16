package bank.management;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.util.*;

public class SignupTwo extends JFrame implements ActionListener {

    long random;
    JButton next;
    JDateChooser dateChooser;
    JRadioButton male, female, unmarried, married, other;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField;
    JTextField cityTextField, stateTextField, pincodeTextField;

    SignupTwo() {

        setLayout(null);

        setTitle("New Account application Form - Page 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        String valreligion[] = { "Hindu", "Sikh", "Christian", "Others" };
        JComboBox religion = new JComboBox(valreligion);
        // we use the JComboBox Class to create a dropdown and pass the values
        religion.setFont(new Font("raleway", Font.BOLD, 28));
        religion.setBackground(Color.WHITE);
        religion.setBounds(300, 140, 400, 30);
        add(religion);

        // nameTextField = new JTextField();
        // nameTextField.setFont(new Font("raleway", Font.BOLD, 28));
        // nameTextField.setBounds(300, 140, 400, 30);
        // add(nameTextField);

        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        String valcategory[] = { "General", "OBC", "SC", "ST", "Others" };
        JComboBox category = new JComboBox(valcategory);
        category.setFont(new Font("raleway", Font.BOLD, 28));
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel income = new JLabel("Annual Income");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String incomeval[] = { "Null", "<50,000", "<2,50,000", "<5,00,000", "10,00,000" };
        JComboBox incomecategory = new JComboBox(incomeval);
        incomecategory.setFont(new Font("raleway", Font.BOLD, 28));
        incomecategory.setBounds(300, 240, 400, 30);
        incomecategory.setBackground(Color.WHITE);
        add(incomecategory);

        // dateChooser.setBounds(300, 240, 400, 30);
        // dateChooser.setForeground(new Color(105, 105, 105));
        // add(dateChooser);

        JLabel education = new JLabel("Education:");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        add(education);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 120, 30);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup gendeGroup = new ButtonGroup();
        gendeGroup.add(male);
        gendeGroup.add(female);

        JLabel qualification = new JLabel("Qualifications:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 340, 200, 30);
        add(qualification);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("raleway", Font.BOLD, 28));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel mstatus = new JLabel("Occupation:");
        mstatus.setFont(new Font("Raleway", Font.BOLD, 20));
        mstatus.setBounds(100, 390, 200, 30);
        add(mstatus);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);

        unmarried = new JRadioButton("unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(600, 390, 100, 30);
        other.setBackground(Color.white);
        add(other);

        ButtonGroup marriageGroup = new ButtonGroup();
        marriageGroup.add(married);
        marriageGroup.add(unmarried);
        marriageGroup.add(other);

        JLabel address = new JLabel("Pan Card Number:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("raleway", Font.BOLD, 28));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("Aadhar Card Number:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("raleway", Font.BOLD, 28));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("raleway", Font.BOLD, 28));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("raleway", Font.BOLD, 28));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 28));
        next.setBounds(620, 660, 150, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.white);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        String address = addressTextField.getText();
        String state = stateTextField.getText();
        String city = cityTextField.getText();
        String pincode = pincodeTextField.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showInputDialog(null, "Name is Required");
            } else {
                Conn c = new Conn();
                String query = "Insert into signup values('" + formno + "', '" + name + "', '" + fname + "', '" + dob
                        + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city
                        + "', '" + state + "', '" + pincode + "')";
                c.s.executeUpdate(query);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo();
    }
}
