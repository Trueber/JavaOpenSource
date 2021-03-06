package ch.bfh.thegits.heros.camp.service.impl;

import ch.bfh.thegits.heros.camp.model.Hero;
import ch.bfh.thegits.heros.camp.repository.HeroRepository;
import ch.bfh.thegits.heros.camp.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DefaultHeroService implements HeroService {
    @Autowired
    private HeroRepository heroRepository;

    private static Random rand = new Random();

    public Hero createHero(String name) {

        Hero hero = new Hero();
        hero.setName(name);
        hero.setAtk(rand.nextInt(100) + 1);
        hero.setDef(rand.nextInt(100) + 1);
        hero.setHp(100);
        hero.setMorale(100);
        String id = heroRepository.save(hero).getId();
        System.out.println("Created new Hero");
        hero.print();
        Long count = heroRepository.countByAtkGreaterThan(50);
        System.out.println("Number of heros with attack greater than 50: " + count);
        //noinspection OptionalGetWithoutIsPresent
        return heroRepository.findById(id).get();
    }
}
