package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CargoConveniadoEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int
)
