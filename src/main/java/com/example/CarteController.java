package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tudor on 29/04/2017.
 */
@RestController("/carti")
public class CarteController {
	@Autowired
	CarteService carteService;
	
	@GetMapping
	public List<Carte> getAllCarti(){
		return carteService.getAllCarti();
	}
	
	@GetMapping("{id}")
	public Carte carti(@PathVariable("id") String carteId) {
		return carteService.getCarte(carteId);
	}
	
	@PostMapping
	public ResponseEntity<String> saveCarte(@RequestBody Carte carte) {
		return carteService.saveCarte(carte);
	}
	
	
}


