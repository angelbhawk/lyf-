package mx.gob.sapalapaz.lyf.domain.models

data class CargaDeTrabajo(
    val id: Int,
    val idLibro: Int,
    val idOperadorEncargado: Int,
    val idPeriodo: Int,
    val idOperadorAsigno: Int,
    val estado: String,
    val fechaConcluida: String?,
    val fechaAsignacion: String,
    val tipoCarga: String,
    val deleted_at: String?,
    val created_at: String?,
    val updated_at: String?,
    val libro: Libro?,
    val operador: Operador?
)
