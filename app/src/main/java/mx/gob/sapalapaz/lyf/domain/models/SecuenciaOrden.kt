package mx.gob.sapalapaz.lyf.domain.models

data class SecuenciaOrden(
    val id: Int,
    val idSecuencia: Int,
    val idToma: Int,
    var numeroSecuencia: Int,
    val deletedAt: String?,
    val createdAt: String?,
    val updatedAt: String?,
    val toma: Toma?,
    val tieneLectura: Boolean?
)