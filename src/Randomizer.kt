import java.util.Random

class Randomizer {
    fun prepareRandomArray(): List<Int> {
        var resultList = mutableListOf<Int>()
        for (i in 1..10) {
            resultList.add(randomNumber(1, 180))
        }
        return resultList
    }

    fun randomNumber(from: Int, to: Int): Int {
        return (Random().nextInt(to - from) + from) * 100000
    }
}