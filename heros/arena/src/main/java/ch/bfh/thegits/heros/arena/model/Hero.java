package ch.bfh.thegits.heros.arena.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Hero
{
    @Id
    @GeneratedValue( generator = "system-uuid" )
    //@GenericGenerator( name = "system-uuid", strategy = "uuid" )
    private String id;

    private String name;
    private int atk;
    private int def;
    private double hp;

    public void print()
    {
        System.out.println( String.format( "Hero %s: Attack: %d, Defence: %d, Health: %.1f", name, atk, def, hp ) );
    }
}
