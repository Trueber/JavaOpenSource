package ch.bfh.thegits.heros.camp.config;

import ch.bfh.thegits.heros.camp.service.impl.DefaultHeroService;
import ch.bfh.thegits.heros.camp.service.impl.DefaultPartyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public DefaultHeroService heroService() {
        return new DefaultHeroService();
    }

    @Bean
    public DefaultPartyService partyService() {
        return new DefaultPartyService();
    }
}