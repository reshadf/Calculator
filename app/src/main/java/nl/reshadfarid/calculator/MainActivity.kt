package nl.reshadfarid.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.*
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.ButtonStyle
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.text.ParagraphStyle
import androidx.ui.text.TextStyle
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculator()
        }
    }
}

@Composable
fun keyButton(button: Keys) {

    Padding(padding = 8.dp) {

        var height = 32.dp
        var width = 64.dp

        if (button == Keys.ZERO) {
            width = 128.dp + 16.dp
        }

        Container(width = width, height = height) {

            Surface(color = Color.Red) {

                Column(modifier = ExpandedWidth) {
                    Button(
                            button.sign(),
                            style = ButtonStyle(
                                    color = button.color(),
                                    shape = RoundedCornerShape(50),
                                    textStyle = TextStyle(Color(0xFFFFFFFF))
                            )
                    )
                }
            }
        }
    }

}

@Preview
@Composable
fun DefaultPreview() {

    Calculator()
}

@Composable
private fun Calculator() {
    val keypad: ArrayList<ArrayList<Keys>> = arrayListOf(
            arrayListOf(Keys.AC, Keys.PLUSMINUS, Keys.PERCENTAGE, Keys.DIVIDE),
            arrayListOf(Keys.SEVEN, Keys.EIGHT, Keys.NINE, Keys.MULTIPLY),
            arrayListOf(Keys.FOUR, Keys.FIVE, Keys.SIX, Keys.MIN),
            arrayListOf(Keys.ONE, Keys.TWO, Keys.THREE, Keys.ADD),
            arrayListOf(Keys.ZERO, Keys.DECIMAL, Keys.EQUALS)
    )

    MaterialTheme() {

        Stack {

            Surface(color = Color.Black) {

                Container(alignment = Alignment.BottomCenter) {

                    Column(modifier = Spacing(12.dp)) {

                        Row() {
                            Padding(padding = 8.dp) {

                                Text(
                                        "42",
                                        style = TextStyle(
                                                color = Color.White,
                                                fontSize = 48.sp
                                        ),
                                        paragraphStyle = ParagraphStyle(textAlign = TextAlign.End),
                                        maxLines = null
                                )
                            }

                        }
                        keypad.forEach { row ->

                            Row() {
                                row.forEach { button ->
                                    keyButton(button = button)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
