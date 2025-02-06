package mx.gob.sapalapaz.lyf.domain.models

data class Toma (
    val id: Int,
    val idUsuario: Int,
    val idGiroComercial: Int?,
    val idLibro: Int,
    val codigoToma: String,
    val idTipoToma: Int,
    val claveCatastral: String,
    val estatus: String,
    val calle: Int?,
    val entreCalle1: Int?,
    val entreCalle2: Int?,
    val colonia: Int?,
    val codigoPostal: String?,
    val numeroCasa: String?,
    val localidad: String,
    val diametroTomas: String?,
    val direccionNotificacion: String,
    val tipoServicio: String,
    val cAgua: Int?,
    val cAlc: Int?,
    val cSan: Int?,
    val tipo_contratacion: String,
    val fecha_instalacion: String?,
    val deleted_at: String?,
    val created_at: String?,
    val updated_at: String?,
    val oCalle: Calle?,
    val oEntreCalle1: Calle?,
    val oEntreCalle2: Calle?,
    val oColonia: Colonia?,
    val medidor: Medidor?
)