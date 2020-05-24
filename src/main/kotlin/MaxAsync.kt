import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread

fun main() {
    execWithThreadsSum()
    execWithCoroutinesSum()
    Thread.sleep(1_500)
}

fun execWithThreadsSum() {
    val start = System.currentTimeMillis()
    val sum = AtomicInteger()
    for (i in 1..150_000) {
        thread(start = true) {
            sum.getAndIncrement()
        }
    }
    println("$sum, run on threads in: ${System.currentTimeMillis() - start} ms.")
}

fun execWithCoroutinesSum() {
    val start = System.currentTimeMillis()
    val sum = AtomicInteger()
    for (i in 1..1_500_000) {
        GlobalScope.launch {
            sum.getAndIncrement()
        }
    }
    println("$sum, run on coroutines in: ${System.currentTimeMillis() - start} ms.")
}