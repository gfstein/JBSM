package br.com.jbsm.Service;

import br.com.jbsm.dao.PersonDao;
import br.com.jbsm.model.Person;

public class PublicService {
    public void save(Person person){
        PersonDao dao = new PersonDao();
        dao.save(person);
    }
}
