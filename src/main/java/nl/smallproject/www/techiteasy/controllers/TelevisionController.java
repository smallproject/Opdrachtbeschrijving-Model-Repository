package nl.smallproject.www.techiteasy.controllers;

import nl.smallproject.www.techiteasy.services.TelevisionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelevisionController {

    private final TelevisionService televisionService;

    public TelevisionController(TelevisionService televisionService) {
        this.televisionService = televisionService;
    }
}
