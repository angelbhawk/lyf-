package mx.gob.sapalapaz.lyf.domain.models

import android.graphics.Bitmap

data class Lectura(
    val id: Int?,
    val id_operador: Int?,
    val id_toma: Int,
    val id_origen: Int?,
    val modelo_origen: String?,
    val id_anomalia: Int?,
    val lectura: Double?,
    val comentario: String?,
    val foto: Bitmap?
)
