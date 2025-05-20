package springboot.di.app.services;

import org.springframework.stereotype.Service;

//injectando a travez de la interfaz iservicio
@Service("miServicioPrincipal")
public class MiServicio implements IServicio{

    @Override
    public String operacion(){
        return "Operando con datos de otro plano existencial simple...";
    }
}
