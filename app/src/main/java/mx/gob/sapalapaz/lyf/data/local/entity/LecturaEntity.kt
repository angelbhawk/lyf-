package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LecturaEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int?,
    val id_operador: Int?,
    val id_toma: Int,
    val id_origen: Int?,
    val modelo_origen: String?,
    val id_anomalia: Int?,
    val lectura: Double?,
    val comentario: String?
)
