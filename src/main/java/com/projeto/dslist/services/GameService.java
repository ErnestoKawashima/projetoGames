package com.projeto.dslist.services;

import com.projeto.dslist.dto.GameMinDTO;
import com.projeto.dslist.repositories.GameRepository;
import entitites.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
