package Clases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Restaurante {
	private ArrayList<Ingrediente> ingredientes;	
	private ArrayList<ProductoMenu> menuBase;
	private ArrayList<Pedido> pedidos;
	private ArrayList<Combo> combos;
	private ArrayList<Pedido> pedidoEnCurso;
	
	public void lector_menu() throws IOException{
		Carga("./data/menu.txt", 1);
		Carga("./data/ingredientes.txt", 2);
		Carga("./data/menu.txt", 3);
		
	}
	
	public void Carga(String nombre, int tipo) throws IOException{
		File archivo = new File(nombre);
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea = lector.readLine();
		while(linea!=null) {
			String[] datos = linea.split(";");
			if(tipo==1) {
				String Producto = datos[0];
				int precio = Integer.parseInt(datos[1]);
				ProductoMenu total = new ProductoMenu(Producto, precio);
				menuBase.add(total);
			}
			
			else if (tipo==2) {
				String Producto = datos[0];
				int precio = Integer.parseInt(datos[1]);
				Ingrediente total=new Ingrediente(Producto, precio);
				ingredientes.add(total);
			}
			else if(tipo==3) {
				String NombreCombo=datos[0];
				int descuento=Integer.parseInt(datos[1].replaceAll("%", ""));
				String ingredient_1=datos[2];
				String ingredient_2=datos[3];
				String ingredient_3=datos[4];
				
				ArrayList<String> itemsCombo=new ArrayList<String>();
				itemsCombo.add(ingredient_1);
				itemsCombo.add(ingredient_2);
				itemsCombo.add(ingredient_3);
				
				Combo total=new Combo(NombreCombo, descuento, itemsCombo);
				combos.add(total);
			}
			linea=lector.readLine();
		}
		lector.close();
	}
}
