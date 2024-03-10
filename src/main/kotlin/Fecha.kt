/**
 * Fecha sirve para decirte si la fecha de cualquier mes es válida
 *
 * @property dias
 * @property mes
 * @property a
 * @constructor Create empty Fecha
 */
class Fecha(private val dias: Int, private val mes: Int, private val a: Int) {


    /**
     * Valida te dice si el día y el mes introducidos se encuentran en un rango existente del año
     *
     * @return devuelve un boleano diciendo si esa fecha existe o no
     */
    fun valida(): Boolean {

        if (dias < 1 || dias > 31) return false
        if (mes < 1 || mes > 12) return false

        // determinamos la cantidad de días del mes:
        return diasdelMes()
    } // … más métodos

    private fun diasdelMes(): Boolean {
        var diasMes = 0
        when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> diasMes = if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) 29 else 28
        }
        return if (
            dias > diasMes) false else true
    }
}
