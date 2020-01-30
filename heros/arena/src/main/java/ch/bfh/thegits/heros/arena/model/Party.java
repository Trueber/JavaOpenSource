package ch.bfh.thegits.heros.arena.model;

import lombok.Data;
//import org.springframework.hateoas.ResourceSupport;

import java.util.List;

@Data
public class Party// extends ResourceSupport
{
    private String name;
    private List<Hero> members;
}
