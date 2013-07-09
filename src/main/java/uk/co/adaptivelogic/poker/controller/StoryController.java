package uk.co.adaptivelogic.poker.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import uk.co.adaptivelogic.poker.dao.ProjectDao;
import uk.co.adaptivelogic.poker.entity.Project;
import uk.co.adaptivelogic.poker.entity.User;
import uk.co.adaptivelogic.poker.entity.UserStory;

import java.util.List;

@Controller
public class StoryController {
    @Autowired
    private ProjectDao projectDao;

    @RequestMapping(value = "/project/{id}/story", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public Project startProject(@PathVariable("id") Long projectId) {
        return projectDao.getProject(projectId);
    }

    public void setProjectDao(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }
}
