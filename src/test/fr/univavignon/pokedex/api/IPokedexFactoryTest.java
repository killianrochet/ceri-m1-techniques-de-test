package fr.univavignon.pokedex.api;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokedexFactoryTest{

    IPokedexFactory pokedex = mock(IPokedexFactory.class);
    IPokemonMetadataProvider metaData = mock(IPokemonMetadataProvider.class);
    IPokemonFactory pokemonFact = mock(IPokemonFactory.class);
    IPokedex poke = mock(IPokedex.class);

    @Before
    public void init(){
        when(pokedex.createPokedex(metaData, pokemonFact)).thenReturn(poke);
    }

    @Test
    public void testPokedex() {
        assertNotNull(pokedex.createPokedex(metaData,pokemonFact));
    }

}
