import javax.swing.JOptionPane;

import clases.OperacionesMatematicas;
import gui.VentanaOperaciones; 

public class Aplicacion{
	
	OperacionesMatematicas misOperaciones;
		
	public Aplicacion(){
			misOperaciones = new OperacionesMatematicas();
			//presentarMenu();
			presentarVentana();
			
		}

	private void presentarVentana() {
		VentanaOperaciones miVentana = new VentanaOperaciones();
		miVentana.asignarOperaciones(misOperaciones);
		miVentana.setVisible(true);
		
	}

	private void presentarMenu(){
		
		String menu = "Operaciones Conversor\n";
		menu+="1. Sumar\n";
		menu+="2. Restar\n";
		menu+="3. Multiplicar\n";
		menu+="4. Dividir\n";
		menu+="5. Salir\n";
		menu+="Ingrese una Opción\n";
		
		int cod=0;
		
		do {
			int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1"));
			int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 2"));
			
			cod=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (cod) {
			
			case 1:
				int resp=misOperaciones.sumar(num1, num2);
				JOptionPane.showMessageDialog(null, "La suma es: "+resp);
				break;
			case 2:
				int rest=misOperaciones.restar(num1, num2);
				JOptionPane.showMessageDialog(null, "La resta es: "+rest);
				break;
			case 3:
				int mult=misOperaciones.multiplicar(num1, num2);
				JOptionPane.showMessageDialog(null, "La multiplicación es: "+mult);
				break;
			case 4:
				String div=misOperaciones.dividir(num1, num2);
				JOptionPane.showMessageDialog(null, div);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "¡Hasta pronto!");
				break;
			}			
		} while (cod!=5);
		
	}
	
}
