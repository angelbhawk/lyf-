package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TarifaServicioEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val id_tarifa: Int,
    val id_tipo_toma: Int,
    val rango: Int,
    val agua: String,
    val alcantarillado: String,
    val saneamiento: String
)