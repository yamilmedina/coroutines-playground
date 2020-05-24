import junit.framework.Assert.assertTrue
import kotlinx.coroutines.runBlocking
import org.junit.Test

class CoroutinesBuildersAndContextKtTest {

    @Test
    fun firstTest() {
        assertTrue(true)
    }

    @Test
    fun secondTest() = runBlocking {
        doWork()
        assertTrue(true)
    }
}