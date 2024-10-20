package com.nkwantabisa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nkwantabisa.ui.theme.TaskCompletedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskCompletedTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskLayout()
                }
            }
        }
    }
}

@Composable
fun TaskLayout (modifier : Modifier = Modifier){
    Column( verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp), ) {
        TaskImage()
        FirstText(firstText = "All Task completed")
        SecondText(secondText = "Nice work !")
    }
}

@Composable
fun TaskImage(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.ic_task_completed)
    Image(painter = image, contentDescription = stringResource(R.string.task_completed))
}

@Composable
fun FirstText (firstText : String, modifier: Modifier = Modifier){
        Text(text = firstText,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold)

    }



@Composable
fun SecondText(secondText: String){
        Text(text = secondText, fontSize = 16.sp, modifier = Modifier)
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun TaskPreview () {
    TaskCompletedTheme {
        TaskLayout()
    }
}

