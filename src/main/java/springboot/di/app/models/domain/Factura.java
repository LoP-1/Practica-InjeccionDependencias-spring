package springboot.di.app.models.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@Component
@RequestScope
public class Factura{

    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;

    @Autowired
    @Qualifier("ItemsFacturaOficina")
    private List<ItemFactura> items;

    //Agregar datos post Contructor
    @PostConstruct
    public void inicializar(){
        cliente.setNombre(cliente.getNombre().concat(" ").concat("Angel "));
        descripcion = descripcion.concat(" del Cliente: ").concat(cliente.getNombre());
    }

    @PreDestroy
    public void destruir(){
        System.out.println("Factura destruida ".concat(descripcion));
    }


    //Getters y setters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }
}
