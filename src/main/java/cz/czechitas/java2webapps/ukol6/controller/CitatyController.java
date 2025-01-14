package cz.czechitas.java2webapps.ukol6.controller;

import cz.czechitas.java2webapps.ukol6.service.CitatyService;
import cz.czechitas.java2webapps.ukol6.service.NahodneCisloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.AssertFalse;
import java.util.List;
import java.util.Random;

/**
 *
 */
@Controller
public class CitatyController {

  private final CitatyService service;

  @Autowired
  public CitatyController(CitatyService service) {
    this.service = service;
  }

  @GetMapping("/")
  public ModelAndView nahodnyCitat() {

    ModelAndView modelAndView = new ModelAndView("citat");
    modelAndView.addObject("citat", service.nahodnyCitat());
    return modelAndView;
  }

  @GetMapping("/{poradi}")
  public ModelAndView kokretniCitat(@PathVariable int poradi) {

    ModelAndView modelAndView = new ModelAndView("citat");
    modelAndView.addObject("citat", service.konkretniCitat(poradi));
    return modelAndView;
  }
  @GetMapping({"/EN", "/en"})
  public ModelAndView nahodnyCitatEN() {

    ModelAndView modelAndView = new ModelAndView("citat");
    modelAndView.addObject("citat", service.nahodnyCitatEN());
    return modelAndView;
  }
  @GetMapping({"/CZ", "/cz"})
  public ModelAndView nahodnyCitatCZ() {

    ModelAndView modelAndView = new ModelAndView("citat");
    modelAndView.addObject("citat", service.nahodnyCitatCZ());
    return modelAndView;
  }
}
