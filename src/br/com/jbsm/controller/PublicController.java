package br.com.jbsm.controller;

import br.com.jbsm.Service.PublicService;
import br.com.jbsm.dao.PersonDao;
import br.com.jbsm.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {

    @Autowired
    private PersonDao dao;

    @RequestMapping("index.html")
    public String index(){
        return "index";
    }

    @RequestMapping("save.html")
    public String savePerson(Person person){
//        PublicService service = new PublicService();
//        service.save(person);
        dao.save(person);
        return "index";
    }
}
