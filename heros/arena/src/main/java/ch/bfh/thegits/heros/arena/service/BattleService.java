package ch.bfh.thegits.heros.arena.service;

import ch.bfh.thegits.heros.camp.model.Party;

public interface BattleService
{
    public String battle( Party challengeeParty, Party challengerParty );
}
