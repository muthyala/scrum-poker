package uk.co.adaptivelogic.poker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

@Controller
@RequestMapping("/")
public class FirstController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        return "index";
    }

    @RequestMapping(value = "/session", method = RequestMethod.POST)
    public String redirectSession(ModelMap model) {
        UUID uuid = UUID.randomUUID();
        return "redirect:/session/" + uuid.toString();
    }

    @RequestMapping(value = "/session/{foo}", method = RequestMethod.GET)
    public String startSession(ModelMap model) {
        UUID uuid = UUID.randomUUID();
        return "session";
    }
}
