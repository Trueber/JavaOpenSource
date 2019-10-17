package ch.bfh.thegits.heros.camp.model;

import lombok.Data;

import java.util.List;

@Data
public class Party
{
    private String name;
    private List<Hero> members;

    public void print()
    {
        System.out.println( "Party " + getName() + ":" );
        members.forEach( Hero::print );
    }
}
