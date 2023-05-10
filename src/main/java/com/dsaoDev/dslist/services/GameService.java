package com.dsaoDev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsaoDev.dslist.dto.GameDTO;
import com.dsaoDev.dslist.dto.GameMinDTO;
import com.dsaoDev.dslist.entities.Game;
import com.dsaoDev.dslist.projections.GameMinProjection;
import com.dsaoDev.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result =  gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();

	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result =  gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
