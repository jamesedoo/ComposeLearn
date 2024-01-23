package com.example.superheroapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class HeroesScreen {
    @Composable
    fun HeroItem(modifier: Modifier = Modifier) {
        Card(modifier = modifier) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(id = R.dimen.padding_medium)),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(text = "fdlkafna")
                    Text(text = "dfklaja")
                }
                Image(
                    painter = painterResource(id = R.drawable.android_superhero1),
                    contentDescription = stringResource(
                        id = R.string.description1,
                    ),
                    modifier = Modifier
                        .size(dimensionResource(id = R.dimen.image_size))
                        .clip(MaterialTheme.shapes.small)

                )
            }
        }
    }

    @Preview()
    @Composable
    fun HeroItemPreview() {
        HeroItem()
    }
}