package mx.gob.sapalapaz.lyf.domain.models

data class ConvenioCatalogo(
    val id: String,
    val nombre: String,
    val descripcion: String,
    val estado: String,
    val pagoInicial: String,
    val tipoCancelacion: String
)
