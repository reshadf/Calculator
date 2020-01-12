package nl.reshadfarid.calculator

import android.os.Bundle
import android.view.Surface
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.ButtonStyle
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.text.TextStyle
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
fun Greeting(name: String) {
    Text(
            text = "Hello $name!",
            style = (+MaterialTheme.typography()).subtitle1.copy(
                    color = Color(0xFFFD0000)
            )
    )
}

@Composable
fun Bye(name: String) {
    Text(
            text = "Bye $name", style = (+MaterialTheme.typography()).caption.copy(
            color = Color(0xFF000000)
    )
    )
}

enum class Keys {

    ZERO {
        override fun sign(): String = "0"

        override fun color(): Color = Color.DarkGray
    },
    ONE {
        override fun sign(): String = "1"

        override fun color(): Color = Color.DarkGray
    },
    TWO {
        override fun sign(): String = "2"

        override fun color(): Color = Color.DarkGray
    },
    THREE {
        override fun sign(): String = "3"

        override fun color(): Color = Color.DarkGray
    },
    FOUR {
        override fun sign(): String = "4"

        override fun color(): Color = Color.DarkGray
    },
    FIVE {
        override fun sign(): String = "5"

        override fun color(): Color = Color.DarkGray
    },
    SIX {
        override fun sign(): String = "6"

        override fun color(): Color = Color.DarkGray
    },
    SEVEN {
        override fun sign(): String = "7"

        override fun color(): Color = Color.DarkGray
    },
    EIGHT {
        override fun sign(): String = "8"

        override fun color(): Color = Color.DarkGray
    },
    NINE {
        override fun sign(): String = "9"

        override fun color(): Color = Color.DarkGray
    },
    DECIMAL {
        override fun sign(): String = "."

        override fun color(): Color = Color.DarkGray
    },
    ADD {
        override fun sign(): String = "+"

        override fun color(): Color = Color(0xFFFF5722)
    },
    MIN {
        override fun sign(): String = "-"

        override fun color(): Color = Color(0xFFFF5722)
    },
    MULTIPLY {
        override fun sign(): String = "x"

        override fun color(): Color = Color(0xFFFF5722)
    },
    DIVIDE {
        override fun sign(): String = "÷"

        override fun color(): Color = Color(0xFFFF5722)
    },
    EQUALS {
        override fun sign(): String = "="

        override fun color(): Color = Color(0xFFFF5722)

    },
    PLUSMINUS {
        override fun sign(): String = "±"

        override fun color(): Color = Color.LightGray
    },
    AC {
        override fun sign(): String = "AC"

        override fun color(): Color = Color.LightGray
    },
    PERCENTAGE {
        override fun sign(): String = "%"

        override fun color(): Color = Color.LightGray
    };

    abstract fun sign(): String
    abstract fun color(): Color
}

@Composable
fun keyButton(button: Keys) {

    Padding(padding = 8.dp) {

        Button(
                button.sign(),
                style = ButtonStyle(
                        color = button.color(),
                        shape = (+MaterialTheme.shapes()).button,
                        textStyle = TextStyle(Color(0xFFFFFFFF))
                )
        )
    }

}

@Preview
@Composable
fun DefaultPreview() {

    Calculator()
}

@Composable
private fun Calculator() {
    val keypad = arrayListOf(
            arrayListOf(Keys.AC, Keys.PLUSMINUS, Keys.PERCENTAGE, Keys.DIVIDE),
            arrayListOf(Keys.SEVEN, Keys.EIGHT, Keys.NINE, Keys.MULTIPLY),
            arrayListOf(Keys.FOUR, Keys.FIVE, Keys.SIX, Keys.MIN),
            arrayListOf(Keys.ONE, Keys.TWO, Keys.THREE, Keys.ADD),
            arrayListOf(Keys.ZERO, Keys.DECIMAL, Keys.EQUALS)
    )

    MaterialTheme() {
        Surface(color = Color.Black) {

            Container(alignment = Alignment.BottomCenter) {
                Column() {
                    FlexRow() {
                        Text("42", style = TextStyle(color = Color.White, fontSize = 48.sp))
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
