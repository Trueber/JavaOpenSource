package ch.bfh.thegits.heros.camp;

import ch.bfh.thegits.heros.camp.service.IPartyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.scan( "ch.bfh.thegits.heros.camp.service" );
        annotationConfigApplicationContext.refresh();

        IPartyService partyService = annotationConfigApplicationContext.getBean( IPartyService.class );
        partyService.createParty( "First Party" );
    }
}
