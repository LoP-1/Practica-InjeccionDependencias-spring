package springboot.di.app.models.domain;

public class ItemFactura {
    private Producto producto;
    private Integer cantidad;


    public ItemFactura(Integer cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Integer calcularImporte(){
        return cantidad* producto.getPrecio();
    }
}
