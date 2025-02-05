package mx.gob.oomsapaslapaz.LyF.lectura_y_facturacion.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class OperadorEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val id_user: Int,
    val codigo_empleado: String,
    val nombre: String,
    val apellido_paterno: String?,
    val apellido_materno: String?,
    val curp: String?
)