package ch.bfh.thegits.heros.camp.config;

import ch.bfh.thegits.heros.camp.service.HeroService;
import ch.bfh.thegits.heros.camp.service.IHeroService;
import ch.bfh.thegits.heros.camp.service.IPartyService;
import ch.bfh.thegits.heros.camp.service.PartyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories( basePackages = "ch.bfh.thegits.heros.camp.repository" )
public class ServiceConfiguration
{
    @Bean
    public IPartyService partyService( IHeroService heroService )
    {
        return new PartyService( heroService );
    }

    @Bean
    public IHeroService heroService()
    {
        return new HeroService();
    }

    @Bean
    public DataSource dataSource()
    {
        return new EmbeddedDatabaseBuilder().setType( EmbeddedDatabaseType.H2 ).build();
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter()
    {
        HibernateJpaVendorAdapter bean = new HibernateJpaVendorAdapter();
        bean.setDatabase( Database.H2 );
        bean.setGenerateDdl( true );
        return bean;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory( DataSource dataSource, JpaVendorAdapter jpaVendorAdapter )
    {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource( dataSource );
        bean.setJpaVendorAdapter( jpaVendorAdapter );
        bean.setPackagesToScan( "ch.bfh.thegits.heros.camp.model" );
        return bean;
    }

    @Bean
    public JpaTransactionManager transactionManager( EntityManagerFactory emf )
    {
        return new JpaTransactionManager( emf );
    }
}
