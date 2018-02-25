import org.junit.Test
import org.junit.Assert
import org.junit.Before

class RandomizerTests {
    lateinit var instance: Randomizer

    @Before
    fun setUp() {
        instance = Randomizer()
    }

    @Test
    fun testCorrectNumberGenerated() {
        val result = instance.randomNumber(1, 180)
        Assert.assertTrue("result should be greater or equal to 100000", result >= 100000)
        Assert.assertTrue("result should be greater or equal to 18000000", result <= 18000000)
    }

    @Test
    fun testCorrectArraySizeGenerated() {
        val correctArraySize = 10
        val result = instance.prepareRandomArray()
        Assert.assertEquals("size of array should be $correctArraySize", correctArraySize, result.size)
    }
}