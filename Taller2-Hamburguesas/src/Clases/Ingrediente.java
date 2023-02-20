package Clases;

public class Ingrediente {
	private String Nombre;
    private int CostoAdicional;

    public Ingrediente(String Nombre, int CostoAdicional) {
        this.Nombre = Nombre;
        this.CostoAdicional = CostoAdicional;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCostoAdicional() {
        return CostoAdicional;
    }

    public void setCostoAdicional(int CostoAdicional) {
        this.CostoAdicional = CostoAdicional;
    }
}
