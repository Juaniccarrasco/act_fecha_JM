/**
 * Fecha sirve para decirte si la fecha de cualquier día es valida
 *
 * @property diasIntroducido
 * @property mesIntroducido
 * @property annoIntroducido
 * @constructor Create empty Fecha
 */
class Fecha(private val diasIntroducido: Int, private val mesIntroducido: Int, private val annoIntroducido: Int) {

    /**
     * Valida te dice si el dia y el mes introducidos se encuentran en un rango existente del año
     *
     * @return devuelve un boleano diciendo si esa fecha existe o no
     */
    fun fechaEsValida(): Boolean {

        if (diasIntroducido < 1 || diasIntroducido > 31) return false
        if (mesIntroducido < 1 || mesIntroducido > 12) return false

        // determinamos la cantidad de días del mes:
        return devolverDiasDelMes()
    } // … más métodos

    private fun devolverDiasDelMes(): Boolean {
        var diasMes = 0
        when (mesIntroducido) {
            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> diasMes = if (annoIntroducido % 400 == 0 || annoIntroducido % 4 == 0 && annoIntroducido % 100 != 0) 29 else 28
        }
        return if (
            diasIntroducido > diasMes) false else true
    }
}
