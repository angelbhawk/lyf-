package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ConsumoEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int?,
    val id_toma: Int,
    val id_periodo: Int,
    val id_lectura_anterior: Int?,
    val id_lectura_actual: Int?,
    val tipo: String,
    val estado: String,
    val consumo: Int
)
