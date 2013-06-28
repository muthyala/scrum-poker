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

import java.util.UUID;

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
        projectDao.save(project);

        return "redirect:/project/" + project.getId();
    }

    @RequestMapping(value = "/project/{id}", method = RequestMethod.GET)
    public ModelAndView startProject(@PathVariable("id") Long id) {
        ModelAndView model = new ModelAndView("session");
        model.addObject("name", "example");

        return model;
    }

    public void setProjectDao(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }
}
