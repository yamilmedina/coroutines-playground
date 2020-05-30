import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        repeat(1000) {
            if(isActive) return@launch
            print(".")
            Thread.sleep(1)
        }

    }

    delay(100)
    // Call this for caller to wait for another coroutines to finish
    job.cancelAndJoin()
    print("done")
}

