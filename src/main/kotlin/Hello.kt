import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Thread.sleep
import kotlin.concurrent.thread

fun main() {
    execWithThreads()
    sleep(1_000)
    execWithCoroutines()
}

fun execWithThreads() {
    thread {
        sleep(1_000)
        println("World!")
    }
    print("T:Hello, ")
}

fun execWithCoroutines() {
    GlobalScope.launch {
        delay(1_000)
        println("World!")
    }
    print("C:Hello, ")
    sleep(1_500)
}