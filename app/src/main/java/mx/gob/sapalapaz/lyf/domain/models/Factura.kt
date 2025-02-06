package mx.gob.sapalapaz.lyf.domain.models

data class Factura(
    val estado: Boolean,
    val cargos: List<Cargo>
)
