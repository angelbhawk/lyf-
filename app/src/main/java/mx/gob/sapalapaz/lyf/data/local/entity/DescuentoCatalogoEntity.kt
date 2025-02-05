package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DescuentoCatalogoEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val nombre: String?,
    val descripcion: String?,
    val estado: String?
)
