package com.sprhib.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.sprhib.model.CurrentMatches;
import com.sprhib.model.CurrentMatchesView;
import com.sprhib.restclient.ApacheHttpClientGet;

@Controller
@RequestMapping(value = "/currentmatches")
public class CurrentMatchesController
{

    @RequestMapping(value = "/index")
    public ModelAndView viewCurrentMatches()
    {
        ModelAndView modelAndView = new ModelAndView("current-matches");

        String jsonString = ApacheHttpClientGet.getCurrentMatches(null);
        ObjectMapper mapper = new ObjectMapper();

        List<CurrentMatches> currentMatchesList = new ArrayList<>();
        try
        {
            currentMatchesList = mapper.readValue(jsonString,
                TypeFactory.defaultInstance().constructCollectionType(List.class, CurrentMatches.class));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        modelAndView.addObject("currentmatches", currentMatchesList);

        return modelAndView;
    }

    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView viewTeamScore(@PathVariable Integer id)
    {
        ModelAndView modelAndView = new ModelAndView("current-matches-view");
        String jsonString = ApacheHttpClientGet.getCurrentMatches(id.toString());
        ObjectMapper mapper = new ObjectMapper();

        List<CurrentMatchesView> currentMatchesList = new ArrayList<>();
        try
        {
            currentMatchesList = mapper.readValue(jsonString,
                TypeFactory.defaultInstance().constructCollectionType(List.class, CurrentMatchesView.class));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        modelAndView.addObject("currentmatchesview", currentMatchesList);
        return modelAndView;
    }

}
