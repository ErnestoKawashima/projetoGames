package com.projeto.dslist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public GameList() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return id.equals(gameList.id) && name.equals(gameList.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
