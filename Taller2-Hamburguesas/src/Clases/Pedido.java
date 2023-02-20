package Clases;

public class Pedido {
	private int NumeroPedidos;
    private int IdPedido;
    private String nombreCliente;
    private String direccionCliente;
    private int PrecioNetoPedido;
    private int PrecioTotalPedido;
    private int PrecioIvaPedido;

    public Pedido(int NumeroPedidos, int IdPedido, String nombreCliente, String direccionCliente, int PrecioNetoPedido, int PrecioTotalPedido, int PrecioIvaPedido) {
        this.NumeroPedidos = NumeroPedidos;
        this.IdPedido = IdPedido;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.PrecioNetoPedido=PrecioNetoPedido;
        this.PrecioTotalPedido=PrecioTotalPedido;
        this.PrecioIvaPedido=PrecioIvaPedido;
        		
    }

    public int getNumeroPedidos() {
        return NumeroPedidos;
    }

    public void setNumeroPedidos(int NumeroPedidos) {
        this.NumeroPedidos = NumeroPedidos;
    }

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int IdPedido) {
        this.IdPedido = IdPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
}
