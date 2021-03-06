package br.com.jbsm.controller;

import br.com.jbsm.dao.PersonDao;
import br.com.jbsm.dao.UserDao;
import br.com.jbsm.model.Person;
import br.com.jbsm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {

    @Autowired
    private PersonDao dao;

    @Autowired
    private UserDao userDao;

    @RequestMapping("index.html")
    public String index(){
        return "index";
    }

    @RequestMapping("save.html")
    public String savePerson(Person person, User user){
        person.setUser(user);
        dao.save(person);
        return "index";
    }
}
