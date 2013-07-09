package uk.co.adaptivelogic.poker.dao;

import org.hibernate.classic.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import uk.co.adaptivelogic.poker.dao.impl.HibernateProjectDao;
import uk.co.adaptivelogic.poker.entity.Project;
import static org.mockito.Mockito.*;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 30/06/2013
 * Time: 19:31
 * To change this template use File | Settings | File Templates.
 */
public class HibernateProjectDaoTest {
    private HibernateProjectDao projectDao;
    private Session session;
    private SessionFactory sessionFactory;

    @Before
    public void setUp() {
        projectDao = new HibernateProjectDao();
        sessionFactory = mock(SessionFactory.class);
        session = mock(Session.class);
        when(sessionFactory.getCurrentSession()).thenReturn(session);
        projectDao.setSessionFactory(sessionFactory);
    }

    @Test
    public void testSave() {
        Project project = new Project();
        projectDao.save(project);

        verify(session).save(project);
    }

    @Test
    public void testGetProject() {
        Project project = new Project();
        projectDao.getProject(1L);

        verify(session).get(Project.class, 1L);
    }
}
