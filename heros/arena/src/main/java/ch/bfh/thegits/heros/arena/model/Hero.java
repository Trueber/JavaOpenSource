package ch.bfh.thegits.heros.arena.model;

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
    private double morale;

    public void print()
    {
        System.out.println( String.format( "Hero %s: Attack: %d, Defence: %d, Health: %.1f", name, atk, def, hp ) );
    }

    public int getAtk()
    {
        return (int) Math.min(atk * getMorale() / 100, 100);
    }

    public int getDef()
    {
        return (int) Math.min(def * getMorale() / 100, 100);
    }
}
