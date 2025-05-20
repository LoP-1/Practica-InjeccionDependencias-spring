package springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springboot.di.app.services.IServicio;

@Controller
public class IndexController {

    //Qualifier elije al servicio con ese nombre
    @Autowired
    @Qualifier("miServicioPrincipal")
    private IServicio servicio;

    //mapeo del index
    @GetMapping({"/","/index",""})
    public String index(Model model){
        model.addAttribute("objeto",servicio.operacion());
        return "index";
    }


}
