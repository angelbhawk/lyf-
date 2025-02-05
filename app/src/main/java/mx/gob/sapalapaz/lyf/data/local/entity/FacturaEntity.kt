package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FacturaEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val id_periodo: Int,
    val id_toma: Int,
    val id_consumo: Int?,
    val id_tarifa_servicio: Int,
    val monto: Double,
    val fecha: String
)
