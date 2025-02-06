package mx.gob.sapalapaz.lyf.domain.models

data class Secuencia(
    val id: Int,
    val idEmpleado: Int?,
    val idSecuenciaPadre: Int?,
    val idLibro: Int,
    val tipoSecuencias: String
)
