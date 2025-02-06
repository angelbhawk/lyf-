package mx.gob.sapalapaz.lyf.domain.models

data class Pago(
    val id: String,
    val folio: String,
    val idCaja: String,
    val idDueno: String,
    val modeloDueno: String,
    val totalPagado: String,
    val estado: String
)
