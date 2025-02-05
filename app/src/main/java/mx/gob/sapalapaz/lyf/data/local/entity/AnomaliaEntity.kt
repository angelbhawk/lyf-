package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AnomaliaEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val estado: String,
    val facturable: Int,
    val requiere_foto: Int?,
    val selecion_manual: Int?,
    val requiere_lectura: Int?
)
