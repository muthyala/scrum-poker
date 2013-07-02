package uk.co.adaptivelogic.poker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import uk.co.adaptivelogic.poker.dao.ProjectDao;
import uk.co.adaptivelogic.poker.entity.Project;
import uk.co.adaptivelogic.poker.entity.User;

import javax.ws.rs.POST;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 01/07/2013
 * Time: 20:57
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class InvitationController {
    @Autowired
    private ProjectDao projectDao;

    public void setProjectDao(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @RequestMapping("/project/{projectId}/invite", method = RequestMethod.GET)
    public ModelAndView handleInvitation(@PathVariable("projectId") Long projectId) {
        ModelAndView model = new ModelAndView("invitation");
        model.getModel().put("project", projectDao.getProject(projectId));

        return model;
    }

    @RequestMapping("/project/{projectId}/invite", method = RequestMethod.POST)
    public String handleInvitation(@PathVariable("projectId") Long projectId, @RequestParam("name") String name) {
        Project project = projectDao.getProject(projectId);
        User user = new User();
        project.getTeam().getMembers().add()

        return "redirect: /project/" + project.getId();
    }
}
