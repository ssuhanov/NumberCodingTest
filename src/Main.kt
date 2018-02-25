fun main(args: Array<String>) {
    var result36: String
    var result62: String
    var numbersArray: List<Int>
    val numberDecoder = NumberDecoder()
    val randomizer = Randomizer()

    var stringSize36 = 0
    var stringSize62 = 0


    for (i in 1..100000) {
        result36 = ""
        result62 = ""
        numbersArray = randomizer.prepareRandomArray()
        numbersArray.forEach { result36 += ";${numberDecoder.decode(it, 36)}" }
        numbersArray.forEach { result62 += ";${numberDecoder.decode(it, 62)}" }
        stringSize36 += result36.length
        stringSize62 += result62.length
        println("36: $stringSize36; 62: $stringSize62")
        println(result36)
        println(result62)
    }

    println("profit: ${100 - stringSize62*100/stringSize36}")
}
