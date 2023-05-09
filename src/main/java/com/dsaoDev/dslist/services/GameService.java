package com.dsaoDev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsaoDev.dslist.dto.GameDTO;
import com.dsaoDev.dslist.entities.Game;
import com.dsaoDev.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameDTO> findAll(){
		List<Game> result =  gameRepository.findAll();
		return result.stream().map(x -> new GameDTO(x)).toList();

	}
}
