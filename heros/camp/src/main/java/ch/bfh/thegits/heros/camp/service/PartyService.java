package ch.bfh.thegits.heros.camp.service;

import ch.bfh.thegits.heros.camp.model.Party;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PartyService implements IPartyService
{
    public Party createParty( String name )
    {
        Party party = new Party();
        party.setName( name );
        party.print();
        return party;
    }
}
