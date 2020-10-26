package com.tugrankenger.thymeleaf.thymeleafdemo.controller;

import com.tugrankenger.thymeleaf.thymeleafdemo.model.LostActors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/lostactors")
public class LostActorsController {

    private List<LostActors> theLostActors;

    @PostConstruct
    private void loadData(){

        // Create LostActors
        LostActors la1= new LostActors(1,"Desmond","Hume","desmondhume@yandex.com");
        LostActors la2= new LostActors(2,"juliet","Burke","julietburke@hotmail.com.tr");
        LostActors la3= new LostActors(3,"Tugran","Kenger","tugrankenger@gmail.com");
        LostActors la4= new LostActors(4,"Kate","Austen","kateausten@outlook.com");

        // Create the list
        theLostActors= new ArrayList<>();

        // Add to the list
        theLostActors.add(la1);
        theLostActors.add(la2);
        theLostActors.add(la3);
        theLostActors.add(la4);
    }
    @GetMapping("/list")
    public String listLostActors(Model theModel){
        theModel.addAttribute("lostactors",theLostActors);
        return "list-lostactors";
    }
}
