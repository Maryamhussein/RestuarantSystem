import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JTextArea;

public class Restaurant {

	private JFrame frame;
	private JTextField textChickenBurger;
	private JTextField textChickenBurgerMeal;
	private JTextField textCheeseBurger;
	private JTextField textQuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(68, 102, 647, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChickenBurger.setBounds(35, 31, 173, 29);
		panel.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChickenBurgerMeal.setBounds(35, 76, 242, 29);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCheeseBurger.setBounds(35, 116, 173, 29);
		panel.add(lblCheeseBurger);
		
		textChickenBurger = new JTextField();
		textChickenBurger.setBounds(325, 31, 232, 27);
		panel.add(textChickenBurger);
		textChickenBurger.setColumns(10);
		
		textChickenBurgerMeal = new JTextField();
		textChickenBurgerMeal.setColumns(10);
		textChickenBurgerMeal.setBounds(325, 76, 232, 27);
		panel.add(textChickenBurgerMeal);
		
		textCheeseBurger = new JTextField();
		textCheeseBurger.setColumns(10);
		textCheeseBurger.setBounds(325, 116, 232, 27);
		panel.add(textCheeseBurger);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDrink.setBounds(35, 160, 173, 29);
		panel.add(lblDrink);
		
		JLabel lblQyt = new JLabel("Qty");
		lblQyt.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblQyt.setBounds(325, 160, 173, 29);
		panel.add(lblQyt);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxTax.setBounds(325, 222, 97, 23);
		panel.add(chckbxTax);
		
		JList list = new JList();
		list.setBounds(71, 244, 1, 1);
		panel.add(list);
		
		JComboBox comoboxSelectDrink = new JComboBox();
		comoboxSelectDrink.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comoboxSelectDrink.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange Juice"}));
		comoboxSelectDrink.setBounds(35, 191, 161, 24);
		panel.add(comoboxSelectDrink);
		
		JCheckBox chckbxDelivery = new JCheckBox("Home Delivery");
		chckbxDelivery.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxDelivery.setBounds(35, 222, 161, 23);
		panel.add(chckbxDelivery);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 156, 522, 2);
		panel.add(separator);
		
		textQuantity = new JTextField();
		textQuantity.setColumns(10);
		textQuantity.setBounds(325, 191, 232, 27);
		panel.add(textQuantity);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(728, 102, 288, 266);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBoxChooseRegion = new JComboBox();
		comboBoxChooseRegion.setModel(new DefaultComboBoxModel(new String[] {"Region", "South of Riyadh", "North of Riyadh", "East of Riyadh", "West of Riyadh"}));
		comboBoxChooseRegion.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBoxChooseRegion.setBounds(56, 90, 193, 28);
		panel_1.add(comboBoxChooseRegion);
		
		JLabel lblRegion = new JLabel("");
		lblRegion.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblRegion.setBounds(58, 148, 192, 27);
		panel_1.add(lblRegion);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxChooseRegion.getSelectedItem().equals("South of Riyadh")) {
					lblRegion.setText("8.00");}
				if(comboBoxChooseRegion.getSelectedItem().equals("North of Riyadh")) {
					lblRegion.setText("20.00");}
				if(comboBoxChooseRegion.getSelectedItem().equals("East of Riyadh")) {
					lblRegion.setText("16.00");}
				if(comboBoxChooseRegion.getSelectedItem().equals("West of Riyadh")) {
					lblRegion.setText("12.00");}
				if(comboBoxChooseRegion.getSelectedItem().equals("Region")) {
					lblRegion.setText("0.00");
				}				
				
				
			}
		});
		btnCheck.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCheck.setBounds(102, 197, 89, 26);
		panel_1.add(btnCheck);
		
		JLabel lblNewLabel = new JLabel("Delivery Cost");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(56, 29, 193, 30);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(68, 379, 647, 169);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDrinks.setBounds(35, 29, 173, 29);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfMeal.setBounds(35, 74, 242, 29);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDeleviry = new JLabel("Cost of Delivery");
		lblCostOfDeleviry.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDeleviry.setBounds(35, 115, 173, 29);
		panel_2.add(lblCostOfDeleviry);
		
		JLabel lblDrinks = new JLabel("");
		lblDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblDrinks.setBounds(325, 29, 232, 27);
		panel_2.add(lblDrinks);
		
		JLabel lblMeal = new JLabel("0");
		lblMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblMeal.setBounds(325, 74, 232, 27);
		panel_2.add(lblMeal);
		
		JLabel lblDelivery = new JLabel("");
		lblDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblDelivery.setBounds(325, 115, 232, 27);
		panel_2.add(lblDelivery);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(728, 379, 288, 169);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_2 = new JLabel("Cost of Drinks");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_2.setBounds(310, 11, 135, 29);
		panel_3.add(label_2);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSubTotal.setBounds(21, 75, 101, 29);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTotal.setBounds(21, 115, 101, 29);
		panel_3.add(lblTotal);
		
		JLabel label_5 = new JLabel("");
		label_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_5.setBounds(300, 11, 145, 27);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_6.setBounds(300, 56, 145, 27);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_7.setBounds(300, 97, 145, 27);
		panel_3.add(label_7);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTax.setBounds(21, 35, 101, 29);
		panel_3.add(lblTax);
		
		JLabel labelTax = new JLabel("");
		labelTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelTax.setBounds(141, 35, 126, 27);
		panel_3.add(labelTax);
		
		JLabel labelSubTotal = new JLabel("");
		labelSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelSubTotal.setBounds(141, 75, 126, 27);
		panel_3.add(labelSubTotal);
		
		JLabel labelTotal = new JLabel("");
		labelTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelTotal.setBounds(141, 115, 126, 27);
		panel_3.add(labelTotal);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(1036, 102, 278, 446);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 36, 246, 382);
		panel_4.add(tabbedPane);
		
		JPanel textSummary = new JPanel();
		tabbedPane.addTab("Receipt", null, textSummary, null);
		textSummary.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(18, 24, 200, 286);
		textSummary.add(textArea);
	
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(68, 559, 1236, 80);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//-------------------------Burger---------------------------//
				double chickBurger=Double.parseDouble(textChickenBurger.getText());
				double iChickBurger=2.39;
				double burgerPrice=(chickBurger *iChickBurger);
				String bMeal=String.format("%.2f",burgerPrice);
				lblMeal.setText(bMeal);
				
				
				double chickBurgerMeal=Double.parseDouble(textChickenBurgerMeal.getText());
				double iChickBurgerMeal=4.39;
				double chickBurgerPrice=(chickBurgerMeal *iChickBurgerMeal);
				String chickBurgerMealString=String.format("%.2f",chickBurgerPrice+burgerPrice);
				lblMeal.setText(chickBurgerMealString);
				
				double cheeseBurger=Double.parseDouble(textCheeseBurger.getText());
				double iCheeseBurger=3.39;
				double cheeseBurgerPrice=(cheeseBurger *iCheeseBurger);
				String cheeseBurgerMeal=String.format("%.2f",cheeseBurgerPrice+chickBurgerPrice+burgerPrice);
				lblMeal.setText(cheeseBurgerMeal);
				
				if(chckbxDelivery.isSelected()) {
						lblDelivery.setText(lblRegion.getText());
				}
						
				else {
					lblDelivery.setText("0,00");
					
				}
				
				//-----------------------------Drinks---------------------------//
				double quantity=Double.parseDouble(textQuantity.getText());
				double Tea=2.00 *quantity;
				double ice_Tea=3.00 *quantity;
				double coffee=3.00 * quantity;
				double ice_coffee=4.00 *quantity;
				double cola=2.50 *quantity;
				double coke=3.00 * quantity;
				double orange=5.00*quantity;
				double apple=4.00*quantity;
				
				if (comoboxSelectDrink.getSelectedItem().equals("Apple Juice")) {
					String appleJuice=String.format("%.2f", apple);
					lblDrinks.setText(appleJuice);}
				if (comoboxSelectDrink.getSelectedItem().equals("Orange Juice")) {
					String orangeJuice=String.format("%.2f", orange);
					lblDrinks.setText(orangeJuice);}
				if (comoboxSelectDrink.getSelectedItem().equals("Ice Tea")) {
					String iceTea=String.format("%.2f", ice_Tea);
					lblDrinks.setText(iceTea);}
				if (comoboxSelectDrink.getSelectedItem().equals("Tea")) {
					String tea=String.format("%.2f", Tea);
					lblDrinks.setText(tea);}
				if (comoboxSelectDrink.getSelectedItem().equals("Coffee")) {
					String Coffee=String.format("%.2f", coffee);
					lblDrinks.setText(Coffee);}
				if (comoboxSelectDrink.getSelectedItem().equals("Ice Coffee")) {
					String iceCoffee=String.format("%.2f", ice_coffee);
					lblDrinks.setText(iceCoffee);}
				if (comoboxSelectDrink.getSelectedItem().equals("Cola")) {
					String Cola=String.format("%.2f", cola);
					lblDrinks.setText(Cola);}
				if (comoboxSelectDrink.getSelectedItem().equals("Coke")) {
					String Coke=String.format("%.2f", coke);
					lblDrinks.setText(Coke);}
				if (comoboxSelectDrink.getSelectedItem().equals("Select a drink")) {
					lblDrinks.setText("0.00");}
				double cTotal1=Double.parseDouble(lblDrinks.getText());
				double cTotal2=Double.parseDouble(lblMeal.getText());
				double cTotal3=Double.parseDouble(lblDelivery.getText());
				double all=(cTotal1+cTotal2+cTotal3)/100.00;
				if(chckbxTax.isSelected()) {
					String iTotal=String.format("%.2f",all);
					labelTax.setText(iTotal);
				}
				
				//-------------------------Subtotal-----------------------------------//
				
				double cTotal4=Double.parseDouble(labelTax.getText());
				double subtotal=(cTotal1+cTotal2+cTotal3);
				String iSubTotal=String.format("%.2f", subtotal);
				labelSubTotal.setText(iSubTotal);
				
				//--------------------------------------Total-----------------------//
				double total=(cTotal1+cTotal2+cTotal3+cTotal4);
				String AllTotal=String.format("%.2f", total);
				labelTotal.setText(AllTotal);
				
			}
				
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTotal.setBounds(303, 23, 89, 26);
		panel_5.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Qty1=Double.parseDouble(textChickenBurger.getText());
				double Qty2=Double.parseDouble(textCheeseBurger.getText());
				double Qty3=Double.parseDouble(textChickenBurgerMeal.getText());
				double tax=Double.parseDouble(labelTax.getText());
				double subTotal=Double.parseDouble(labelSubTotal.getText());
				double total=Double.parseDouble(labelTotal.getText());

				
				textArea.append("Restaurant Managment System:\n\n"+
					    "Ckicken Burger:\t\t"
						+Qty1+"\n Ckicken Burger Meals:\t"
						+Qty3+"\n Cheese Burger:\t"+
						Qty2 +"\n Tax:"+tax+"\n Sub Total:\t"+subTotal+"\n Total:\t"+total+
						"\n\n Thank You");
				
				
				


				
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReceipt.setBounds(483, 23, 89, 26);
		panel_5.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textChickenBurger.setText(null);
				textChickenBurgerMeal.setText(null);
				textCheeseBurger.setText(null);
				comoboxSelectDrink.setSelectedItem("Select a drink");
				textQuantity.setText(null);
				chckbxDelivery.setSelected(false);
				chckbxTax.setSelected(false);
				lblDrinks.setText(null);
				lblMeal.setText(null);
				lblDelivery.setText(null);
				comboBoxChooseRegion.setSelectedItem("Choose city");
				lblRegion.setText(null);
				labelTax.setText(null);
				labelSubTotal.setText(null);
				labelTotal.setText(null);
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(663, 23, 89, 26);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBounds(843, 23, 89, 26);
		panel_5.add(btnExit);
		
		JLabel lblLoanManagmentSystem = new JLabel("Restaurant managment System");
		lblLoanManagmentSystem.setFont(new Font("Tahoma", Font.BOLD, 72));
		lblLoanManagmentSystem.setBounds(68, 11, 1236, 96);
		frame.getContentPane().add(lblLoanManagmentSystem);
	}
}
