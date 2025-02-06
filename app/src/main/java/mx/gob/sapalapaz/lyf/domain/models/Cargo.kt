package mx.gob.sapalapaz.lyf.domain.models

data class Cargo(
    val id: Int,
    val id_concepto: Int,
    val nombre: String,
    val id_origen: Int,
    val modelo_origen: String,
    val id_dueno: Int,
    val modelo_dueno: String,
    val monto: String,
    val iva: String,
    val estado: String,
    val id_convenio: Int?,
    val fecha_cargo: String,
    val fecha_liquidacion: String?,
    val concepto: Concepto?,
    val abonos: List<Abono>?
)