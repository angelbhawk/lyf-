package mx.gob.sapalapaz.lyf.domain.models

data class Posicion (
    val idToma: Int,
    val type: String,
    val coordinates: List<Double>
)