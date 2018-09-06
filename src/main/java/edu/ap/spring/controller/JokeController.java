package edu.ap.spring.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
@Scope("session")
public class JokeController {

    private static final String API_URL = "http://api.icndb.com/jokes/random";
    private RestTemplate restTemplate = new RestTemplate();

    @Autowired
    public JokeController(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    @RequestMapping("/joke")
    public String joke() {
        return "joke";
    }

    @RequestMapping("/joke_post")
    public String joke_post(@RequestParam("firstName") String firstName,
                            @RequestParam("lastName") String lastName,
                            Model model) {

        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);

        JsonNode json = restTemplate.getForObject(API_URL + "?firstName=" + firstName + "&lastName=" + lastName, JsonNode.class);

        model.addAttribute("joke", joke);
        return "joke_post";
    }

    @RequestMapping("/")
    public String root() {
        return "redirect:/joke";
    }
}
