package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonFactoryTest {

    IPokemonFactory pokemon = mock(IPokemonFactory.class);
    Pokemon bulbizarre = new Pokemon(0,"Bulbizarre",126,126,90,613,64,4000,4,56);
    Pokemon aquali = new Pokemon(133,"Aquali",186,168,260,2729,202,5000,4,100);

    @Before
    public void init(){
        when(pokemon.createPokemon(0,613, 64, 4000, 4)).thenReturn(bulbizarre);
        when(pokemon.createPokemon(133,2729, 202, 5000, 4)).thenReturn(aquali);
    }

    @Test
    public void testPokemon(){
        Pokemon p = pokemon.createPokemon(0,613, 64, 4000, 4);
        assertEquals(613, p.getCp());
        assertEquals(64, p.getHp());
        assertEquals(4000, p.getDust());
        assertEquals(4, p.getCandy());
        assertEquals(0, p.getIndex());
    }
}
