package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) {
                yield()
                print(".")
                Thread.sleep(10)
            }
        } catch (e: CancellationException) {
            println("cancelled")
        } finally {
            println("finally")
        }
    }

    delay(100)
    // Call this for caller to wait for another coroutines to finish
    job.cancelAndJoin()
    print("done")
}

