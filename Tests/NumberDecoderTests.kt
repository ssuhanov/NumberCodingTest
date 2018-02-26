import org.junit.Test
import org.junit.Assert
import org.junit.Before

class NumberDecoderTests {
    lateinit var instance: NumberDecoder

    @Before
    fun setUp() {
        instance = NumberDecoder()
    }

    @Test
    fun test2BaseDecode() {
        val correctResult = "1000100101010100010000000"
        val result = instance.decode(18000000, 2)
        Assert.assertEquals("result should be $correctResult", correctResult, result)
    }

    @Test
    fun test10BaseDecode() {
        val correctResult = "18000000"
        val result = instance.decode(18000000, 10)
        Assert.assertEquals("result should be $correctResult", correctResult, result)
    }

    @Test
    fun test16BaseDecode() {
        val correctResult = "112A880"
        val result = instance.decode(18000000, 16)
        Assert.assertEquals("result should be $correctResult", correctResult, result)
    }

    @Test
    fun test17BaseDecode() {
        val correctResult = "CB8CC9"
        val result = instance.decode(18000000, 17)
        Assert.assertEquals("result should be $correctResult", correctResult, result)
    }

    @Test
    fun test36BaseDecode() {
        val correctResult = "APSW0"
        val result = instance.decode(18000000, 36)
        Assert.assertEquals("result should be $correctResult", correctResult, result)
    }

    @Test
    fun test62BaseDecode() {
        val correctResult = "1DWca"
        val result = instance.decode(18000000, 62)
        Assert.assertEquals("result should be $correctResult", correctResult, result)
    }
}
