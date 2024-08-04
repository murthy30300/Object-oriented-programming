package project;

//java project
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BillingSystemGUI extends JFrame implements ActionListener {

  // Categories and items
  private String[] categories = {"Books", "Electronics", "Clothing"};
  private String[][] items = {{"Book1", "Book2", "Book3"}, {"Electronics1", "Electronics2", "Electronics3"}, {"Clothing1", "Clothing2", "Clothing3"}};
  // Discounts
  private double[] discounts = {0.1, 0.2, 0.3};
  // Prices
  private double[][] prices = {{10.0, 20.0, 30.0}, {50.0, 100.0, 150.0}, {25.0, 50.0, 75.0}};
  // GUI elements
  private JComboBox categoryDropdown, itemDropdown;
  private JLabel itemLabel, discountLabel, priceLabel;
  private JTextField totalPriceField;
  private JButton calculateButton;
  
  public BillingSystemGUI()
  {
      super("Billing System");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400, 300);
      setLocationRelativeTo(null);
      
      // Initialize GUI elements
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(6, 2));
      
      JLabel categoryLabel = new JLabel("Category:");
      panel.add(categoryLabel);
      categoryDropdown = new JComboBox(categories);
      categoryDropdown.addActionListener(this);
      panel.add(categoryDropdown);
      
      JLabel itemCategoryLabel = new JLabel("Item:");
      panel.add(itemCategoryLabel);
      itemDropdown = new JComboBox(items[0]);
      panel.add(itemDropdown);
      
      itemLabel = new JLabel("Item Name: ");
      panel.add(itemLabel);
      discountLabel = new JLabel("Discount: ");
      panel.add(discountLabel);
      priceLabel = new JLabel("Price: ");
      panel.add(priceLabel);
      
      JLabel totalLabel = new JLabel("Total Price: ");
      panel.add(totalLabel);
      totalPriceField = new JTextField("");
      panel.add(totalPriceField);
      
      calculateButton = new JButton("Calculate");
      calculateButton.addActionListener(this);
      panel.add(calculateButton);
      
      add(panel);
      setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e) 
  {
      if (e.getSource() == categoryDropdown) {
          // Update item dropdown based on selected category
          int index = categoryDropdown.getSelectedIndex();
          itemDropdown.removeAllItems();
          for (int i = 0; i < items[index].length; i++) {
              itemDropdown.addItem(items[index][i]);
          }
      } else if (e.getSource() == calculateButton) {
          // Calculate total price
          int categoryIndex = categoryDropdown.getSelectedIndex();
          int itemIndex = itemDropdown.getSelectedIndex();
          double price = prices[categoryIndex][itemIndex];
          double discount = discounts[categoryIndex];
          double total = price * (1 - discount);
          totalPriceField.setText(String.format("%.2f", total));
          // Write to file
          try {
              java.io.FileWriter fw = new java.io.FileWriter("billing.txt", true);
              java.util.Date date = new java.util.Date();
              fw.write(date.toString() + " - " + categories[categoryIndex] + " - " + items[categoryIndex][itemIndex] + " - " + total + "\n");
              fw.close();
          } catch (Exception ex) {
              System.out.println("Error writing to file: " + ex.getMessage());
          }
      }
  }
  
  public static void main(String[] args) {
      new BillingSystemGUI();
  }
}

