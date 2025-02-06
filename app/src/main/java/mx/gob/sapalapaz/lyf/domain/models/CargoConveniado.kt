package mx.gob.sapalapaz.lyf.domain.models

data class CargoConveniado(
    val id: String,
    val idCargo: String,
    val idConvenio: String,
    val montoOriginalPendiente: String,
    val montoFinalPendiente: String,
    val porcentajeConveniado: String,
    val montoConveniado: String
)
