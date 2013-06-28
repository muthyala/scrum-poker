package uk.co.adaptivelogic.poker.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import uk.co.adaptivelogic.poker.entity.Project;

@Transactional @Repository
public class HibernateProjectDao implements ProjectDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Project project) {
        sessionFactory.getCurrentSession().save(project);
    }
}
