package org.ye.serialization.benchmark

import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options.OptionsBuilder
import org.ye.serialization.benchmark.benchmark.KotlinxBenchmark

fun main() {
    val opt = OptionsBuilder()
        .include(KotlinxBenchmark::class.java.simpleName)
        .forks(1)
        .warmupIterations(10)
        .measurementIterations(10)
        .build()
    Runner(opt).run()
}