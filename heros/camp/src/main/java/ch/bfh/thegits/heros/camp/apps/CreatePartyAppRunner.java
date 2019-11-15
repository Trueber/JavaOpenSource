package ch.bfh.thegits.heros.camp.apps;

import ch.bfh.thegits.heros.camp.service.IPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CreatePartyAppRunner implements ApplicationRunner
{
    @Autowired
    private IPartyService partyService;


    @Override
    public void run( ApplicationArguments args )
    {
        partyService.createParty( "Test Party 1" );
    }
}
