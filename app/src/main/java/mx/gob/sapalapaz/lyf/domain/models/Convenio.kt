package mx.gob.sapalapaz.lyf.domain.models

data class Convenio(
    val id: Int,
    val id_convenio_catalogo: Int,
    val folio: String,
    val id_modelo: Int,
    val modelo_origen: String,
    val monto_conveniado: Double?,
    val monto_total: Double?,
    val periodicidad: String,
    val cantidad_letras: Int,
    val estado: String?,
    val comentario: String?,
    val motivo_cancelacion: String?,
    val pago_inicial: Double?,
    val letras: List<Letra>?
)
