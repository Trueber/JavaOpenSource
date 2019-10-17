package ch.bfh.thegits.heros.camp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hero
{
    private String name;
    private int atk;
    private int def;
    private int hp;
}
