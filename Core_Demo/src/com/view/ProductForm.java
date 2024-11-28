package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Product;
import com.service.ProductService_impl;
import com.service.Product_Service;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class ProductForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel field;
	private JTextField priceTxt;
	private JTextField companyTxt;
	private JTextField nameTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductForm frame = new ProductForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProductForm() {
		setTitle("ProductForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1006, 650);
		field = new JPanel();
		field.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(field);
		field.setLayout(null);
		
		priceTxt = new JTextField();
		priceTxt.setColumns(10);
		priceTxt.setBounds(369, 314, 262, 39);
		field.add(priceTxt);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrice.setBounds(267, 312, 106, 39);
		field.add(lblPrice);
		
		companyTxt = new JTextField();
		companyTxt.setColumns(10);
		companyTxt.setBounds(369, 253, 262, 39);
		field.add(companyTxt);
		
		nameTxt = new JTextField();
		nameTxt.setColumns(10);
		nameTxt.setBounds(369, 186, 262, 39);
		field.add(nameTxt);
		
		JLabel lblCompany = new JLabel("Company");
		lblCompany.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCompany.setBounds(267, 253, 106, 39);
		field.add(lblCompany);
		
		JLabel lblPricnamee = new JLabel("Name");
		lblPricnamee.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPricnamee.setBounds(267, 186, 106, 39);
		field.add(lblPricnamee);
		
		JComboBox categoryCmb = new JComboBox();
		categoryCmb.setModel(new DefaultComboBoxModel(new String[] {"select", "Electronics", "Clothing", "Kitchen "}));
		categoryCmb.setBounds(369, 379, 262, 39);
		field.add(categoryCmb);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Input validation
				if(nameTxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(nameTxt,"Name is required");
					return;
				}
				
				if(companyTxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(companyTxt,"Company is required");
					return;
				}
				
				if(priceTxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(priceTxt,"Price is required");
					return;
				}
				
				if(categoryCmb.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(categoryCmb,"Select Category");
					return;
				}
				
				
				//get data from product form.
				String nm = nameTxt.getText();
				String company = companyTxt.getText();
				int  price = Integer.parseInt(priceTxt.getText());
				String category = categoryCmb.getSelectedItem().toString();
				
				//set data to product object
				Product p = new Product();
				p.setName(nm);
				p.setPrice(price);
				p.setCompany(company);
				p.setCategory(category);
				
				Product_Service ps = new ProductService_impl();
				ps.addProduct(p);
				JOptionPane.showInternalMessageDialog(null,"Added sucess");
				
				nameTxt.setText("");
				companyTxt.setText("");
				categoryCmb.setSelectedIndex(0);
				priceTxt.setText("");
			
			}
		});
		btnNewButton.setBounds(435, 440, 126, 33);
		field.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Category");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(267, 396, 96, 19);
		field.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(425, 121, 262, 55);
		field.add(lblNewLabel_1);
		
	}
}
