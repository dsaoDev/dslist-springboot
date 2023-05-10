package com.dsaoDev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsaoDev.dslist.dto.GameListDTO;
import com.dsaoDev.dslist.dto.GameMinDTO;
import com.dsaoDev.dslist.services.GameListService;
import com.dsaoDev.dslist.services.GameService;

@RestController 
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameService;	
	
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result =  gameService.findByList(listId);
		return result;
	}
	
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result =  gameListService.findAll();
		return result;
	}

}
