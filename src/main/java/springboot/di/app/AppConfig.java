package springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.di.app.models.domain.ItemFactura;
import springboot.di.app.models.domain.Producto;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("ItemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara",100);
        Producto producto2 = new Producto("Celular",150);
        Producto producto3 = new Producto("Televisor",500);

        ItemFactura linea1 = new ItemFactura(2,producto1);
        ItemFactura linea2 = new ItemFactura(5,producto2);
        ItemFactura linea3 = new ItemFactura(10,producto3);

        return Arrays.asList(linea1,linea2,linea3);
    }
    @Bean("ItemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Papel",10);
        Producto producto2 = new Producto("Lapiz",12);
        Producto producto3 = new Producto("Tajador",5);

        ItemFactura linea1 = new ItemFactura(2,producto1);
        ItemFactura linea2 = new ItemFactura(1,producto2);
        ItemFactura linea3 = new ItemFactura(1,producto3);

        return Arrays.asList(linea1,linea2,linea3);
    }
}
