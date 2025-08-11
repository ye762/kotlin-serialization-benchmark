package org.ye.serialization.benchmark

import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options.OptionsBuilder
import org.ye.serialization.benchmark.benchmark.UserModelBenchmark

fun main() {
    val opt = OptionsBuilder()
        .include(UserModelBenchmark::class.java.simpleName)
        .forks(1)
        .warmupIterations(5)
        .measurementIterations(5)
        .build()
    Runner(opt).run()
}