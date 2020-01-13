package nl.reshadfarid.calculator

import androidx.ui.graphics.Color

enum class Keys {

    ZERO {
        override fun sign(): String = "0"

        override fun color(): Color =
            Color.DarkGray
    },
    ONE {
        override fun sign(): String = "1"

        override fun color(): Color =
            Color.DarkGray
    },
    TWO {
        override fun sign(): String = "2"

        override fun color(): Color =
            Color.DarkGray
    },
    THREE {
        override fun sign(): String = "3"

        override fun color(): Color =
            Color.DarkGray
    },
    FOUR {
        override fun sign(): String = "4"

        override fun color(): Color =
            Color.DarkGray
    },
    FIVE {
        override fun sign(): String = "5"

        override fun color(): Color =
            Color.DarkGray
    },
    SIX {
        override fun sign(): String = "6"

        override fun color(): Color =
            Color.DarkGray
    },
    SEVEN {
        override fun sign(): String = "7"

        override fun color(): Color =
            Color.DarkGray
    },
    EIGHT {
        override fun sign(): String = "8"

        override fun color(): Color =
            Color.DarkGray
    },
    NINE {
        override fun sign(): String = "9"

        override fun color(): Color =
            Color.DarkGray
    },
    DECIMAL {
        override fun sign(): String = "."

        override fun color(): Color =
            Color.DarkGray
    },
    ADD {
        override fun sign(): String = "+"

        override fun color(): Color =
            Color(0xFFFF5722)
    },
    MIN {
        override fun sign(): String = "-"

        override fun color(): Color =
            Color(0xFFFF5722)
    },
    MULTIPLY {
        override fun sign(): String = "x"

        override fun color(): Color =
            Color(0xFFFF5722)
    },
    DIVIDE {
        override fun sign(): String = "÷"

        override fun color(): Color =
            Color(0xFFFF5722)
    },
    EQUALS {
        override fun sign(): String = "="

        override fun color(): Color =
            Color(0xFFFF5722)

    },
    PLUSMINUS {
        override fun sign(): String = "±"

        override fun color(): Color =
            Color.LightGray
    },
    AC {
        override fun sign(): String = "AC"

        override fun color(): Color =
            Color.LightGray
    },
    PERCENTAGE {
        override fun sign(): String = "%"

        override fun color(): Color =
            Color.LightGray
    };

    abstract fun sign(): String
    abstract fun color(): Color
}