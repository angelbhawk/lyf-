package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ColoniaEntity (
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val nombre: String
)