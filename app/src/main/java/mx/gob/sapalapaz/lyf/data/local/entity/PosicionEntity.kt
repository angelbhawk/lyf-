package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter

@Entity
class PosicionEntity (
    @PrimaryKey(autoGenerate = false)
    val id_toma: Int,
    val type: String,
    val coordinates: String
)