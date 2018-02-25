
class NumberDecoder {
    companion object {
        val alphabet: HashMap<Int, String> = hashMapOf(
                0 to "0",
                1 to "1",
                2 to "2",
                3 to "3",
                4 to "4",
                5 to "5",
                6 to "6",
                7 to "7",
                8 to "8",
                9 to "9",
                10 to "A",
                11 to "B",
                12 to "C",
                13 to "D",
                14 to "E",
                15 to "F",
                16 to "G",
                17 to "H",
                18 to "I",
                19 to "J",
                20 to "K",
                21 to "L",
                22 to "M",
                23 to "N",
                24 to "O",
                25 to "P",
                26 to "Q",
                27 to "R",
                28 to "S",
                29 to "T",
                30 to "U",
                31 to "V",
                32 to "W",
                33 to "X",
                34 to "Y",
                35 to "Z",
                36 to "a",
                37 to "b",
                38 to "c",
                39 to "d",
                40 to "e",
                41 to "f",
                42 to "g",
                43 to "h",
                44 to "i",
                45 to "j",
                46 to "k",
                47 to "l",
                48 to "m",
                49 to "n",
                50 to "o",
                51 to "p",
                52 to "q",
                53 to "r",
                54 to "s",
                55 to "t",
                56 to "u",
                57 to "v",
                58 to "w",
                59 to "x",
                60 to "y",
                61 to "z"
        )
    }

    fun decode(number: Int, base: Int): String {
        var number = number
        var result = ""
        while (number >= base) {
            val currentSymbol = number % base
            number /= base
            result = alphabet[currentSymbol] + result
        }
        result = alphabet[number] + result

        return result
    }
}
