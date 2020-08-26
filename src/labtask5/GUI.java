//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 28/05/2019
package labtask5;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame { //the class
    
    private ArrayList<House> houseArrayList = new ArrayList(); // the arraylist
    
    //creating the buttons and labels...
     private JLabel label; //declaring labels and buttons.
     private JLabel labelBedroom, labelBathroom;
     private JTextField textBedroom, textBathroom;
     private JLabel labelGarage;
     private JRadioButton radioGarage0, radioGarage1, radioGarage2, radioGarage3;
     private JTextField displayField;
     private JButton calculateButton, displayButton, exitButton;
     private JComboBox <String> houseComboBox;
     
     //creating container for the images...
     private String [] comboBoxNames = {"- select one -","The Aspen","The Brittany","The Colonial","The Dartmoor"};
     //assigning the images...
     
      private final Icon[] icons = {null, //setting the images.
         new ImageIcon(getClass().getResource("1.jpg")),
         new ImageIcon(getClass().getResource("2.jpg")),
         new ImageIcon(getClass().getResource("3.jpg")),
         new ImageIcon(getClass().getResource("4.jpg")),
     };
     
     //creating a GUI
     public GUI() 
     {
         //super
        super("GUI");
        //set layout
        setLayout(new FlowLayout());
        
        
        label = new JLabel("Please Select a House.             "); //setting the values of the labels and combox, and buttons.
         
        houseComboBox = new JComboBox<String>(comboBoxNames);
        labelBedroom = new JLabel("Enter the amount of Bedroom               ");
        textBedroom = new JTextField(10);
        labelGarage = new JLabel("Enter the amount of Garage ");
        radioGarage0 = new JRadioButton("0");
        radioGarage1 = new JRadioButton("1");
        radioGarage2 = new JRadioButton("2");
        radioGarage3 = new JRadioButton("3");
        labelBathroom = new JLabel("Enter the amount of Bathroom               ");
        textBathroom = new JTextField(10);
        displayField = new JTextField(10);
        calculateButton = new JButton("Calculate");
        displayButton = new JButton("Display");
        exitButton = new JButton("Exit");
        
        ButtonGroup bg = new ButtonGroup(); //grouping the radio buttons together.
        bg.add(radioGarage0);
        bg.add(radioGarage1);
        bg.add(radioGarage2);
        bg.add(radioGarage3);
         
        add(label);
        add(houseComboBox);
        add(labelBedroom);
        add(textBedroom);
        add(labelGarage);
        add(radioGarage0);        
        add(radioGarage1);
        add(radioGarage2);
        add(radioGarage3);
        add(labelBathroom);
        add(textBathroom);
        add(displayField);
        add(calculateButton);
        add(displayButton);
        add(exitButton);
        
        houseComboBox.addItemListener(new ItemListener() 
                {
                    @Override
                    public void itemStateChanged(ItemEvent picture) {
                        if(picture.getStateChange() == ItemEvent.SELECTED)
                            label.setIcon(icons[houseComboBox.getSelectedIndex()]);
                    }
                });
        
        displayField.setEditable(false); //the display field isn't editable.
        setSize(450,600); //setting size
        setVisible(true); //setting visible.
        
        
        calculateButton.addActionListener(new ButtonHandler());
        displayButton.addActionListener(new ButtonHandler());
        exitButton.addActionListener(new ButtonHandler());

         
     }
        
    private class ButtonHandler implements ActionListener 
    {
        @Override
        public void actionPerformed (ActionEvent e) {
            House houseObj = new House();
            if(e.getSource() == calculateButton)
            {
                
                houseObj.setHouseModel(comboBoxNames[houseComboBox.getSelectedIndex()]);
                houseObj.setNoOfBed(Integer.parseInt(textBedroom.getText()));
                if(radioGarage0.isSelected()) {
                    houseObj.setSizeOfGarage(0);
                }
                else if(radioGarage1.isSelected()) {
                    houseObj.setSizeOfGarage(1);
                }
                else if(radioGarage2.isSelected()) {
                    houseObj.setSizeOfGarage(2);
                }
                else if(radioGarage3.isSelected()) {
                    houseObj.setSizeOfGarage(3);
                }
                
                houseObj.setNoOfBath(Integer.parseInt(textBathroom.getText()));
                displayField.setText(""+houseObj.totalPrice());
                houseArrayList.add(houseObj);
                
            }
            else if(e.getSource() == displayButton) 
            {
                for(int x=0; x<houseArrayList.size(); x++) {
                    JOptionPane.showMessageDialog(null, houseArrayList.get(x).toString());
                    
                }
                
                
            }
            
            else if(e.getSource() == exitButton)
            {
                System.exit(0);
            }
        }
        
    }
        
    
    
}
