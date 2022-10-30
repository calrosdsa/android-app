package com.teclu.soporte.common.compose.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Update
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.teclu.enums.Roles
import com.teclu.soporte.common.compose.LocalUtilApp
import com.teclu.soporte.entities.CasoEntity

@Composable
fun CasoItem(
    caso:CasoEntity,
    rol:Roles,
    getEstado:(Int,Roles)->String,
    getPrioridad:(Int)->String,
    navigateToCasoDetail:(String)->Unit
) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .clickable {
            navigateToCasoDetail(caso.idCaso.toString())
        }
        .padding(horizontal = 10.dp, vertical = 5.dp)
    ) {
        Text(
            text = caso.titulo, style = MaterialTheme.typography.titleMedium.copy(
                color = MaterialTheme.colorScheme.primary
            ), maxLines = 1
        )
        VerticalGrid() {
            Text(text = "Estado: ${getEstado(caso.estado, rol)}", maxLines = 1)
            Text(text = "Prioridad: ${getPrioridad(caso.prioridad)}", maxLines = 1)
            Text(text = "Cliente: ${caso.clienteName}", maxLines = 1)
            Text(text = "Funcionario: ${caso.funcionarioName}", maxLines = 1)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.Update,modifier = Modifier.size(20.dp),
                    contentDescription = caso.created)
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = caso.created.substring(0, 19), maxLines = 1)
            }
                Icon(imageVector = Icons.Default.Menu, contentDescription = caso.idCaso.toString())
        }
    }
}