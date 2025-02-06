package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TomaEntity (
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val id_usuario: Int,
    val id_giro_comercial: Int?,
    val id_libro: Int,
    val codigo_toma: String,
    val id_tipo_toma: Int,
    val clave_catastral: String,
    val estatus: String,
    val calle: Int?,
    val entre_calle_1: Int?,
    val entre_calle_2: Int?,
    val colonia: Int?,
    val codigo_postal: String?,
    val numero_casa: String?,
    val localidad: String,
    val diametro_tomas: String?,
    val direccion_notificacion: String,
    val tipo_servicio: String,
    val c_agua: Int?,
    val c_alc: Int?,
    val c_san: Int?,
    val tipo_contratacion: String,
    val fecha_instalacion: String?,
    val deleted_at: String?,
    val created_at: String?,
    val updated_at: String?,
)