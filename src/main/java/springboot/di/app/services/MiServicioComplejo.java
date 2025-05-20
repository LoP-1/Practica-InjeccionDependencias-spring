package springboot.di.app.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//injectando a travez de la interfaz iservicio
@Service("miServicioComplejo")
@Primary
public class MiServicioComplejo implements IServicio{

    @Override
    public String operacion(){
        return "Operando con datos de otro plano existencial super complejos...";
    }
}
