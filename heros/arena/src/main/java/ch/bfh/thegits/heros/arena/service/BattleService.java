package ch.bfh.thegits.heros.arena.service;


import ch.bfh.thegits.heros.arena.model.Party;

public interface BattleService
{
    public String battle( Party challengeeParty, Party challengerParty );
}
