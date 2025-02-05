package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AbonoEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val id_cargo: Int,
    val id_origen: Int,
    val modelo_origen: String,
    val total_abonado: String
)
