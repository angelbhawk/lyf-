package mx.gob.sapalapaz.lyf.domain.models

data class Anomalia(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val estado: String,
    val facturable: Int,
    val requiere_foto: Int?,
    val selecion_manual: Int?,
    val requiere_lectura: Int?
)
