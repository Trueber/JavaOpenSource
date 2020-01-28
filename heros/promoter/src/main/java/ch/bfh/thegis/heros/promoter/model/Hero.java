package ch.bfh.thegis.heros.promoter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero
{
    private String name;
    private int atk;
    private int def;
    private double hp;

    public void print()
    {
        System.out.println( String.format( "Hero %s: Attack: %d, Defence: %d, Health: %.1f", name, atk, def, hp ) );
    }
}
