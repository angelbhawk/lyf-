package mx.gob.sapalapaz.lyf.presentation.componentes

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ErrorDialog(errorMessage: String, onRetry: () -> Unit) {
    AlertDialog(
        onDismissRequest = {},
        title = { Text(text = "Permiso Requerido") },
        text = { Text(text = errorMessage) },
        confirmButton = {
            Button(onClick = onRetry) {
                Text("Solicitar Permiso")
            }
        }
    )
}