package ch.bfh.thegis.heros.promoter.client;

import ch.bfh.thegits.heros.camp.model.Party;

import java.util.List;

public interface ArenaClient
{
    public String battle( List<Party> challangers );
}
