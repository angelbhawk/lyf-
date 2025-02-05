package mx.gob.oomsapaslapaz.LyF.lectura_y_facturacion.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import mx.gob.oomsapaslapaz.LyF.lectura_y_facturacion.data.remote.dto.RutaDto

@Entity
data class LibroEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val nombre: String,
    val id_ruta: Int,
)
