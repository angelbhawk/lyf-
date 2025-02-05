package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ConvenioCatalogoEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val estado: String,
    val pago_inicial: Double,
    val tipo_cancelacion: String?
)