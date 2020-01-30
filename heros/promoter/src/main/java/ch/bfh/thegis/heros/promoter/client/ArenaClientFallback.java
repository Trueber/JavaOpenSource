package ch.bfh.thegis.heros.promoter.client;

import ch.bfh.thegis.heros.promoter.model.Party;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArenaClientFallback implements ArenaClient {

    @Override
    public Party battle(List<Party> challengers) {
        return null;
    }
}
