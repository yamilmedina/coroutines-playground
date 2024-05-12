package flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import java.math.BigInteger

fun main() = runBlocking {
    val result = factorialOf(6)
    result.collect {
        println(it)
    }
    println("Collected: ${result.count()}")
}

fun factorialOf(number: Int): Flow<BigInteger> {
    return flow {
        var factorial = BigInteger.ONE
        for (step in 1..number) {
            delay(500)
            factorial = factorial.multiply(step.toBigInteger())
            emit(factorial)
        }
    }
}
