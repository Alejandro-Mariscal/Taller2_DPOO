package Clases;

public class ProductoMenu {
	private String Nombre;
    private int PrecioBase;

    public ProductoMenu(String Nombre, int PrecioBase) {
        this.Nombre = Nombre;
        this.PrecioBase = PrecioBase;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(int PrecioBase) {
        this.PrecioBase = PrecioBase;
    }
}
