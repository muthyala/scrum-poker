package uk.co.adaptivelogic.poker.dao;

import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import uk.co.adaptivelogic.poker.entity.Project;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 30/06/2013
 * Time: 19:31
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class HibernateProjectDaoTest {
    private HibernateProjectDao projectDao;

    @Before
    public void setUp() {
        projectDao = new HibernateProjectDao();
        SessionFactory sessionFactory = Mockito.mock(SessionFactory.class);
        projectDao.setSessionFactory(sessionFactory);
    }

    @Test
    public void testSave() throws Exception {
        Project project = new Project();
        projectDao.save(project);

    }
}
