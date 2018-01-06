package mmazurkiewicz.jokes_app.controllers;

import mmazurkiewicz.jokes_app.services.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private QuotesService quotesService;

    @Autowired
    public JokesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @GetMapping("/")
    public String viewJokes(Model model){
        model.addAttribute("joke",quotesService.getRandomQuote());
        return "chucknorris";
    }
}
