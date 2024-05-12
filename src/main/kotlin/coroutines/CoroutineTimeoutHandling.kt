package coroutines

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import kotlinx.coroutines.yield

fun main() = runBlocking {
    val job = withTimeoutOrNull(100) {
        repeat(1000) {
            print(".")
            yield()
            Thread.sleep(1000)
        }

    }

    if(job == null) println("timed out")
    print("done")
}

