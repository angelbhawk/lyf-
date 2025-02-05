package mx.gob.oomsapaslapaz.LyF.lectura_y_facturacion.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PeriodoEntity (
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val nombre: String
)