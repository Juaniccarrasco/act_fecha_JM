import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class FechaTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun valida() {
        val fecha = Fecha(15, 13, 2023)
        assertTrue (fecha.fechaEsValida())
    }


    @Test
    fun fechaInvalidaDia() {
        val fecha = Fecha(32, 5, 2022)
        assertFalse (fecha.fechaEsValida())
    }

    @Test
    fun fechaInvalidaMes() {
        val fecha = Fecha(12, 13, 2021)
        // Assert.assertFalse(fecha.valida())
        assertFalse (fecha.fechaEsValida())
    }

    @Test
    fun fechaInvalidaFebreroBisiesto() {
        val fecha = Fecha(29, 2, 2021)
        assertFalse (fecha.fechaEsValida())
        println("Fecha invalida")
        println(fecha.fechaEsValida())
    }

    @Test
    fun fechaValidaFebreroBisiesto() {
        val fecha = Fecha(29, 2, 2024)
        assertTrue (fecha.fechaEsValida())
        println("Fecha valida Bisiesto")
        println(fecha.fechaEsValida())
    }
}