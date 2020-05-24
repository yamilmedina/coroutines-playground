import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        delay(1_000)
        println("World!")
    }

    print("Hello, ")
    //we must call this inside a coroutines context
    //so we use runBlocking context builder to be able to call.
    doWork()
}

/**
 * Using suspend for func.
 * Now we can run in this func, all coroutines context things.
 */
suspend fun doWork() {
    delay(1_500)
}