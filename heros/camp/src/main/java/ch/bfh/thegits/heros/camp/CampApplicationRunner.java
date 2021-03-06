package ch.bfh.thegits.heros.camp;

import ch.bfh.thegits.heros.camp.repository.HeroRepository;
import ch.bfh.thegits.heros.camp.service.impl.DefaultHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CampApplicationRunner implements ApplicationRunner {

    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private DefaultHeroService heroService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (heroRepository.count() == 0) {
            heroService.createHero("Superman");
            heroService.createHero("Batman");
            heroService.createHero("Wonder Woman");
            heroService.createHero("Spiderman");
            heroService.createHero("Aquaman");
            heroService.createHero("Green Lantern");
            heroService.createHero("Flash");
            heroService.createHero("Batwoman");
        }
    }
}
