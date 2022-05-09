package fr.univavignon.pokedex.api;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonTrainerFactoryTest extends TestCase {

    IPokemonTrainerFactory mockPokemonTrainerFactory=mock(IPokemonTrainerFactory.class);
    IPokedexFactory mockPokedexFactory = mock(IPokedexFactory.class);
    IPokedex mockPokedex = mock(IPokedex.class);
    PokemonTrainer trainer = new PokemonTrainer("Killian",Team.INSTINCT, mockPokedex);

    @Before
    public void setUp(){
        when(mockPokemonTrainerFactory.createTrainer("Killian",Team.INSTINCT, mockPokedexFactory)).thenReturn(trainer);
    }

    @Test
    public void testCreateTrainer() {
        assertEquals("Killian", mockPokemonTrainerFactory.createTrainer("Killian",Team.INSTINCT, mockPokedexFactory).getName());
    }

    @Test
    public void testCreateTrainerGetTeam() {
        assertEquals(Team.INSTINCT, mockPokemonTrainerFactory.createTrainer("Killian",Team.INSTINCT, mockPokedexFactory).getTeam());
    }

    @Test
    public void testCreateTrainerGetPokedex() {
        assertNotNull(mockPokemonTrainerFactory.createTrainer("Killian",Team.INSTINCT, mockPokedexFactory).getPokedex());
    }
}
