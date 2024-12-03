package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Product;
import com.service.ProductService_impl;
import com.service.Product_Service;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;

public class ProductList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField nameTxt;
	private JTextField priceTxt;
	private JTextField companyTxt;
	private JComboBox categoryCmb ;
	private int id;
	private JTextField searchTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductList frame = new ProductList();
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
	public ProductList() {
		setTitle("Product list");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1082, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane tmodel = new JScrollPane();
		tmodel.setBounds(354, 75, 550, 377);
		contentPane.add(tmodel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Price", "Category", "Company"
			}
		));
		tmodel.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Product List");
		lblNewLabel.setBounds(539, 10, 183, 30);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setBounds(623, 483, 85, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null,"Select any data");
					return;
				}
				int selrow = table.getSelectedRow();
				int id = (int) table.getModel().getValueAt(selrow,0);
				
				Product_Service ps = new ProductService_impl();
				ps.deleteProduct(id);
				
				JOptionPane.showMessageDialog(null,"deleted Sucess");
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null,"Select any data");
					return;
				}
				int selrow = table.getSelectedRow();
				id = (int) table.getModel().getValueAt(selrow,0);
				
				nameTxt.setText(table.getModel().getValueAt(selrow, 1).toString());
				priceTxt.setText(table.getModel().getValueAt(selrow, 2).toString());
				companyTxt.setText(table.getModel().getValueAt(selrow, 4).toString());
				categoryCmb.setSelectedItem(table.getModel().getValueAt(selrow,3).toString());
				
				
			}
		});
		btnNewButton_1.setBounds(525, 483, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 94, 90, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Price");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 134, 90, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Company");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(10, 174, 90, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Category");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(10, 214, 90, 30);
		contentPane.add(lblNewLabel_1_3);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(110, 75, 203, 44);
		contentPane.add(nameTxt);
		nameTxt.setColumns(10);
		
		priceTxt = new JTextField();
		priceTxt.setColumns(10);
		priceTxt.setBounds(110, 142, 203, 19);
		contentPane.add(priceTxt);
		
		companyTxt = new JTextField();
		companyTxt.setColumns(10);
		companyTxt.setBounds(110, 182, 203, 19);
		contentPane.add(companyTxt);
		
		categoryCmb = new JComboBox();
		categoryCmb.setModel(new DefaultComboBoxModel(new String[] {"select", "Electronics", "Clothing", "Kitchen "}));
		categoryCmb.setBounds(110, 221, 203, 44);
		contentPane.add(categoryCmb);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Product p = new Product();
				
				p.setId(id);
				p.setName(nameTxt.getText());
				p.setPrice(Integer.parseInt(priceTxt.getText()));
				p.setCategory(categoryCmb.getSelectedItem().toString());
				p.setCompany(companyTxt.getText());
				
				Product_Service ps = new ProductService_impl();
				ps.updateProduct(p);
				
				JOptionPane.showMessageDialog(null,"updated sucess");
				displayData();
				
				//clear input data
				nameTxt.setText("");
				priceTxt.setText("");
				companyTxt.setText("");
				categoryCmb.setSelectedIndex(0);
			}
		});
		btnNewButton_2.setBounds(161, 295, 85, 21);
		contentPane.add(btnNewButton_2);
		
		searchTxt = new JTextField();
		searchTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				String sdata = searchTxt.getText().trim();
				
				Product_Service ps = new ProductService_impl();
				List<Product> plist = ps.searchProduct(sdata);

				
				DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
				tmodel.setRowCount(0);//reset table data
				
				for(Product p : plist) {
					tmodel.addRow(new Object[] {p.getId(),p.getName(),p.getPrice(),p.getCategory(),p.getCompany()});
				}
				
			}
		});
		searchTxt.setBounds(787, 50, 117, 19);
		contentPane.add(searchTxt);
		searchTxt.setColumns(10);
		
		JLabel search = new JLabel("Search");
		search.setBounds(740, 53, 45, 13);
		contentPane.add(search);
		
		JButton btnNewButton_3 = new JButton("Print");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_3.setBounds(417, 483, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Add Product");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProductForm().setVisible(true);
			}
		});
		btnNewButton_4.setBounds(355, 18, 147, 47);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Refresh data");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayData();
			}
		});
		btnNewButton_5.setBounds(322, 483, 85, 21);
		contentPane.add(btnNewButton_5);
		
		displayData();
	}
	//display data in JTable
	private void  displayData() {
		
		Product_Service ps = new ProductService_impl();
		List<Product> plist = ps.getAllProduct();
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);//reset table data
		
		for(Product p : plist) {
			tmodel.addRow(new Object[] {p.getId(),p.getName(),p.getPrice(),p.getCategory(),p.getCompany()});
		}
		
	}
}
