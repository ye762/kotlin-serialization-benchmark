package org.ye.serializtion.benchmark

import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options.OptionsBuilder
import org.ye.serializtion.benchmark.benchmark.UserModelBenchmark

// You can place this main function in any file,
// for example, in `src/test/kotlin/BenchmarkRunner.kt`
fun main() {
    val opt = OptionsBuilder()
        // Specify the benchmark class to run
        .include(UserModelBenchmark::class.java.simpleName)
        // Set up benchmark parameters
        .forks(1)
        .warmupIterations(5)
        .measurementIterations(5)
        .build()

    Runner(opt).run()
}
