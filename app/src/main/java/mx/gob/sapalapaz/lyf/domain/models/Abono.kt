package mx.gob.sapalapaz.lyf.domain.models

data class Abono(
    val id: Int,
    val id_cargo: Int,
    val id_origen: Int,
    val modelo_origen: String,
    val total_abonado: String
)
