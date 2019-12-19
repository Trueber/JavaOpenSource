package ch.bfh.thegis.heros.promoter.client.impl;

import ch.bfh.thegis.heros.promoter.client.ArenaClient;
import ch.bfh.thegits.heros.camp.model.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class DefaultArenaClient implements ArenaClient
{
    @Autowired
    private Environment env;


    @Override
    public String battle( List<Party> challangers )
    {
        ResponseEntity<String> response = new RestTemplate().exchange(
                env.getProperty( "arena.url" ) + "/battle",
                HttpMethod.POST,
                new HttpEntity<>( challangers ),
                String.class );
        return response.getBody();
    }
}
