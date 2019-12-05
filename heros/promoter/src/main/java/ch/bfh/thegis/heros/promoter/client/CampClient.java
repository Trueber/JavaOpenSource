package ch.bfh.thegis.heros.promoter.client;

import ch.bfh.thegits.heros.camp.model.Party;
import org.springframework.hateoas.Resource;

public interface CampClient
{
    public Resource<Party> createParty( String name );
}
