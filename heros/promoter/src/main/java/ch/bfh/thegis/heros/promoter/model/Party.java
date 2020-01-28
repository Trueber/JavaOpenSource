package ch.bfh.thegis.heros.promoter.model;

import lombok.Data;

import java.util.List;

//import org.springframework.hateoas.ResourceSupport;

@Data
public class Party// extends ResourceSupport
{
    private String name;
    private List<Hero> members;
}
