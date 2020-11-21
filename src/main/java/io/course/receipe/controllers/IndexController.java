package io.course.receipe.controllers;

import io.course.receipe.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("")
    public String getIndexPage(Model model) {
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
