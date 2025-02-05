package mx.gob.oomsapaslapaz.LyF.lectura_y_facturacion.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SecuenciaOrdenEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val id_secuencia: Int,
    val id_toma: Int,
    val numero_secuencia: Int,
    val deleted_at: String?,
    val created_at: String?,
    val updated_at: String?
)