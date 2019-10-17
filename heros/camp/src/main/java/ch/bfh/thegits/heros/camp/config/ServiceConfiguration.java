package ch.bfh.thegits.heros.camp.config;

import ch.bfh.thegits.heros.camp.service.HeroService;
import ch.bfh.thegits.heros.camp.service.IHeroService;
import ch.bfh.thegits.heros.camp.service.IPartyService;
import ch.bfh.thegits.heros.camp.service.PartyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration
{
    @Bean
    public IPartyService partyService( IHeroService heroService )
    {
        return new PartyService(heroService);
    }

    @Bean
    public IHeroService heroService()
    {
        return new HeroService();
    }
}
