package ch.bfh.thegits.heros.camp;

import ch.bfh.thegits.heros.camp.config.ServiceConfiguration;
import ch.bfh.thegits.heros.camp.service.IHeroService;
import ch.bfh.thegits.heros.camp.service.IPartyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        /*
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.scan( "ch.bfh.thegits.heros.camp.service" );
        annotationConfigApplicationContext.refresh();

        IPartyService partyService = annotationConfigApplicationContext.getBean( IPartyService.class );
        partyService.createParty( "First Party" );
        annotationConfigApplicationContext.close();
         */

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
                ServiceConfiguration.class
        );

        IPartyService partyService = annotationConfigApplicationContext.getBean( IPartyService.class );
        partyService.createParty( "Second Party" );

        annotationConfigApplicationContext.close();
    }
}
