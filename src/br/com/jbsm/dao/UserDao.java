package br.com.jbsm.dao;

import br.com.jbsm.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void save(User user){
        sessionFactory.getCurrentSession().save(user);
    }
}
