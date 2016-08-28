package br.com.jbsm.dao;

import br.com.jbsm.model.Person;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class PersonDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Person person){
        sessionFactory.getCurrentSession().save(person);
    }

}
