package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.OperacionesMatematicas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaOperaciones extends JFrame implements ActionListener {

	private JPanel panelPrincipal;
	private JTextField txtCampoNum1;
	private JTextField txtCampoNum2;
	private JLabel lblNum2;
	JButton btnSuma,btnResta,btnMult,btnDiv;
	
	OperacionesMatematicas misOperaciones;
	private JLabel lblResultado;

	public VentanaOperaciones() {

		IniciarComponentes();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calcular");
		setResizable(false);
		setLocationRelativeTo(null);

	}

	private void IniciarComponentes() {

		setBounds(100, 100, 300, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);

		JLabel lblTitulo = new JLabel("Operaciones Matematicas");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblTitulo.setBounds(10, 11, 264, 20);
		panelPrincipal.add(lblTitulo);

		txtCampoNum1 = new JTextField();
		txtCampoNum1.setBounds(104, 42, 170, 20);
		panelPrincipal.add(txtCampoNum1);
		txtCampoNum1.setColumns(10);

		txtCampoNum2 = new JTextField();
		txtCampoNum2.setColumns(10);
		txtCampoNum2.setBounds(104, 73, 170, 20);
		panelPrincipal.add(txtCampoNum2);

		JLabel lblNum1 = new JLabel("1er Número");
		lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum1.setBounds(10, 42, 84, 20);
		panelPrincipal.add(lblNum1);

		lblNum2 = new JLabel("2do Número");
		lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum2.setBounds(10, 73, 84, 20);
		panelPrincipal.add(lblNum2);

		btnMult = new JButton("Multiplicación");
		btnMult.setBounds(154, 104, 120, 25);
		btnMult.addActionListener(this);
		panelPrincipal.add(btnMult);

		btnSuma = new JButton("Suma");
		btnSuma.setBounds(10, 104, 120, 25);
		btnSuma.addActionListener(this);
		panelPrincipal.add(btnSuma);

		btnResta = new JButton("Resta");
		btnResta.setBounds(10, 138, 120, 25);
		btnResta.addActionListener(this);
		panelPrincipal.add(btnResta);

		btnDiv = new JButton("División");
		btnDiv.setBounds(154, 138, 120, 25);
		btnDiv.addActionListener(this);
		panelPrincipal.add(btnDiv);
		
		lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(10, 199, 264, 20);
		panelPrincipal.add(lblResultado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (btnSuma==e.getSource()) {
			int num1=Integer.parseInt(txtCampoNum1.getText());
			int num2=Integer.parseInt(txtCampoNum2.getText());
			int resp=misOperaciones.sumar(num1, num2);
			lblResultado.setText("La suma es = "+resp);
		}
		if (btnResta==e.getSource()) {
			int num1=Integer.parseInt(txtCampoNum1.getText());
			int num2=Integer.parseInt(txtCampoNum2.getText());
			int resp=misOperaciones.restar(num1, num2);
			lblResultado.setText("La resta es = "+resp);
		}
		if (btnMult==e.getSource()) {
			int num1=Integer.parseInt(txtCampoNum1.getText());
			int num2=Integer.parseInt(txtCampoNum2.getText());
			int resp=misOperaciones.multiplicar(num1, num2);
			lblResultado.setText("La multiplicación es = "+resp);
		}
		if (btnDiv==e.getSource()) {
			int num1=Integer.parseInt(txtCampoNum1.getText());
			int num2=Integer.parseInt(txtCampoNum2.getText());
			String resp=misOperaciones.dividir(num1, num2);			
			lblResultado.setText("La división es = "+resp);
		}
	}

	public void asignarOperaciones(OperacionesMatematicas misOperaciones) {
		
		this.misOperaciones=misOperaciones;
		
		
	}
}