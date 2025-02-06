package mx.gob.sapalapaz.lyf.domain.models

data class Consumo(
    val id: Int?,
    val id_toma: Int,
    val id_periodo: Int,
    val id_lectura_anterior: Int?,
    val id_lectura_actual: Int?,
    val tipo: String,
    val estado: String,
    val consumo: Int,
    val lectura_actual: Lectura?,
    val lectura_anterior: Lectura?
)
