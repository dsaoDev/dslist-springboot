package com.dsaoDev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsaoDev.dslist.dto.GameDTO;
import com.dsaoDev.dslist.services.GameService;

@RestController 
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameDTO> findAll(){
		List<GameDTO> result =  gameService.findAll();
		return result;
	}

}
