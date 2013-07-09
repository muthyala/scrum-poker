package uk.co.adaptivelogic.poker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import uk.co.adaptivelogic.poker.dao.ProjectDao;
import uk.co.adaptivelogic.poker.entity.Project;
import uk.co.adaptivelogic.poker.entity.User;
import uk.co.adaptivelogic.poker.entity.UserStory;

@Controller
@RequestMapping("/")
public class FirstController {
    @Autowired
    private ProjectDao projectDao;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        return "index";
    }

    @RequestMapping(value = "/project", method = RequestMethod.POST)
    public String redirectSession(@RequestParam("name") String name, ModelMap model) {
        Project project = new Project();
        project.setName(name);
        User moderator = new User();
        project.setModerator(moderator);
        projectDao.save(project);

        return "redirect:/project/" + project.getId() + "/stories";
    }

    @RequestMapping(value = "/project/{id}/stories", method = RequestMethod.GET)
    public ModelAndView startProject(@PathVariable("id") Long projectId) {
        ModelAndView model = new ModelAndView("add-stories");
        model.addObject("project", projectDao.getProject(projectId));

        return model;
    }

    @RequestMapping(value = "/project/{id}/stories", method = RequestMethod.POST)
    public String addStories(@PathVariable("id") Long projectId, @RequestParam("story") String storyText) {
        Project project = projectDao.getProject(projectId);
        project.getUserStories();
        UserStory story = new UserStory();
        story.setText(storyText);
        project.getUserStories().add(story);
        projectDao.save(project);

        return "redirect:/project/" + projectId + "/estimate";
    }

    @RequestMapping(value = "/project/{id}/estimate", method = RequestMethod.GET)
    public ModelAndView addTeam(@PathVariable("id") Long projectId) {
        ModelAndView model = new ModelAndView("estimate");
        model.addObject("project", projectDao.getProject(projectId));

        return model;
    }

    public void setProjectDao(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }
}
