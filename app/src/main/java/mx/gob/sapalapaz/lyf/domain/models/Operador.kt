package mx.gob.sapalapaz.lyf.domain.models

data class Operador (
    val id: Int,
    val idUser: Int,
    val codigoEmpleado: String,
    val nombre: String,
    val apellidoPaterno: String?,
    val apellidoMaterno: String?,
    val curp: String?
)