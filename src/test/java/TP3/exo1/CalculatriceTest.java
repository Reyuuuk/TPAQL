package TP3.exo1;

import org.example.TP2.exo1.Calculatrice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatriceTest {

    @Test
    public void testAdditionner() {
        Calculatrice calculatrice = mock(Calculatrice.class);

        when(calculatrice.additionner(2, 3)).thenReturn(5);

        int resultat = calculatrice.additionner(2, 3);

        assertEquals(5, resultat);
        verify(calculatrice).additionner(2, 3);
        verifyNoMoreInteractions(calculatrice);
    }
}
