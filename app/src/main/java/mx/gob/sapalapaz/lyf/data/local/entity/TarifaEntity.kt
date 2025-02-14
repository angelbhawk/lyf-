package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TarifaEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val fecha: String,
    val estado: String
)