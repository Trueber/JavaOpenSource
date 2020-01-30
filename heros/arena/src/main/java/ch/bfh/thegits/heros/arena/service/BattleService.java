package ch.bfh.thegits.heros.arena.service;


import ch.bfh.thegits.heros.arena.model.Party;

public interface BattleService
{
    String battle( Party challengeeParty, Party challengerParty );
}
