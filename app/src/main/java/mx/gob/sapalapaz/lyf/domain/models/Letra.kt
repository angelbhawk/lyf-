package mx.gob.sapalapaz.lyf.domain.models

data class Letra(
    val id: Int,
    val id_convenio: Int,
    val estado: String,
    val monto: Double,
    val vigencia: String,
    val numero_letra: Int,
    val tipo_letra: String,
    val periodo: String
)
