package mx.gob.sapalapaz.lyf.domain.models

data class Tarifa (
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val fecha: String,
    val estado: String,
    val servicio: List<Servicio>?
)