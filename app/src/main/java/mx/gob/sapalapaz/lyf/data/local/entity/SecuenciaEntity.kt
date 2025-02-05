package mx.gob.oomsapaslapaz.LyF.lectura_y_facturacion.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SecuenciaEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val id_empleado: Int?,
    val id_secuencia: Int?,
    val id_libro: Int,
    val tipo_secuencia: String
)
