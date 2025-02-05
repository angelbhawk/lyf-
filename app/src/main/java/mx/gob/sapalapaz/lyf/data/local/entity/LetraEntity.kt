package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LetraEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val id_convenio: Int,
    val estado: String,
    val monto: Double,
    val vigencia: String,
    val numero_letra: Int,
    val tipo_letra: String,
    val periodo: String
)
