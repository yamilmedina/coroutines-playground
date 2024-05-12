package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        delay(1_000)
        println("World!")
    }

    print("Hello, ")

    // Call this for caller to wait for another coroutines to finish
    job.join()
}

