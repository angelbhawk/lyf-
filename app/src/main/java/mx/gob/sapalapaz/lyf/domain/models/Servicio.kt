package mx.gob.sapalapaz.lyf.domain.models

data class Servicio (
    val id: Int,
    val id_tarifa: Int,
    val id_tipo_toma: Int,
    val rango: Int,
    val agua: String,
    val alcantarillado: String,
    val saneamiento: String
)