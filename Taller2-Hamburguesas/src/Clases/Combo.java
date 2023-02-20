package Clases;

import java.util.ArrayList;

public class Combo {
	private double descuento;
    private String nombreCombo;
	private ArrayList<String> itemsCombo;

    public Combo(String nombreCombo, double descuento, ArrayList<String> itemsCombo) {
        this.descuento = descuento;
        this.nombreCombo = nombreCombo;
        this.itemsCombo=itemsCombo;
    }


	public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getNombreCombo() {
        return nombreCombo;
    }

    public void setNombreCombo(String nombreCombo) {
        this.nombreCombo = nombreCombo;
    }


	public ArrayList<String> getItemsCombo() {
		return itemsCombo;
	}


	public void setItemsCombo(ArrayList<String> itemsCombo) {
		this.itemsCombo = itemsCombo;
	}
    
 
}
