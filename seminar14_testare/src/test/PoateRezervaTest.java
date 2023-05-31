package test;

import dubluri.StubPersoanaMajora;
import dubluri.StubPersoanaMinora;
import model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PoateRezervaTest {

    @Test
    void minorNuPoateRezerva() {
        StubPersoanaMinora stubPersoanaMinora = new StubPersoanaMinora();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoanaMinora, "", 150.0);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    void majorPoateRezerva() {
        StubPersoanaMajora stubPersoanaMajora = new StubPersoanaMajora();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoanaMajora,"",150.0);
        assertTrue(pachetTuristic.poateRezerva());
    }
}