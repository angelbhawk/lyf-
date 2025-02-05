package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CargaDeTrabajoEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val id_libro: Int,
    val id_operador_encargado: Int,
    val id_periodo: Int,
    val id_operador_asigno: Int,
    val estado: String,
    val fecha_concluida: String?,
    val fecha_asignacion: String,
    val tipo_carga: String,
    val deleted_at: String?,
    val created_at: String?,
    val updated_at: String?
)