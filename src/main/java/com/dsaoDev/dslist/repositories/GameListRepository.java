package com.dsaoDev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsaoDev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
