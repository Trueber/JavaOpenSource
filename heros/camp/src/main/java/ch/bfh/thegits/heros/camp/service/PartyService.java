package ch.bfh.thegits.heros.camp.service;

import ch.bfh.thegits.heros.camp.model.Hero;
import ch.bfh.thegits.heros.camp.model.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartyService implements IPartyService
{
    private IHeroService heroService;

    @Autowired
    PartyService( IHeroService heroService )
    {
        this.heroService = heroService;
    }

    public Party createParty( String name )
    {
        List<Hero> heros = new ArrayList<>();
        for( int i = 0; i < 5; i++ )
        {
            heros.add( heroService.createHero( "Hero" + i ) );
        }
        Party party = new Party();
        party.setName( name );
        party.setMembers( heros );
        System.out.println( "Created Party:" );
        party.print();
        return party;
    }
}
