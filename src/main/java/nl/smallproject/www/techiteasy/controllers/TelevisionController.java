package nl.smallproject.www.techiteasy.controllers;

import nl.smallproject.www.techiteasy.models.Television;
import nl.smallproject.www.techiteasy.services.TelevisionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/televisions")
public class TelevisionController {

    private final TelevisionService televisionService;

    public TelevisionController(TelevisionService televisionService) {
        this.televisionService = televisionService;
    }

    @GetMapping
    public ResponseEntity<List<Television>> getAllTelevisionsByBrand(@RequestParam(required = false) String brand) {
        List<Television> televisions = televisionService.getAllTelevisionsByBrand(brand);
        return ResponseEntity.ok(televisions);
    }
}
