package com.dsaoDev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsaoDev.dslist.dto.GameDTO;
import com.dsaoDev.dslist.dto.GameMinDTO;
import com.dsaoDev.dslist.services.GameService;

@RestController 
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gameService.findById(id);
		return result;
		
	}
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result =  gameService.findAll();
		return result;
	}

}
