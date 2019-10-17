package ch.bfh.thegits.heros.camp.service;

import ch.bfh.thegits.heros.camp.model.Hero;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class HeroService implements IHeroService
{
    private static Random rand = new Random();

    public Hero createHero( String name )
    {
        Hero hero = new Hero( name, rand.nextInt( 100 ) + 1, rand.nextInt( 100 ) + 1, 100 );
        System.out.println( "Created new Hero" );
        hero.print();
        return hero;
    }
}
