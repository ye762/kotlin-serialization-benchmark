package org.ye.serializtion.benchmark.benchmark

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.Setup
import org.openjdk.jmh.annotations.State
import org.ye.serializtion.benchmark.model.User
import java.util.concurrent.TimeUnit

// Defines the scope of the state object. `Benchmark` means one instance per benchmark run.
@State(Scope.Benchmark)
// Sets the default time unit for the results.
@OutputTimeUnit(TimeUnit.MILLISECONDS)
// Configures the benchmark mode to average time per operation.
@BenchmarkMode(Mode.AverageTime)
open class UserModelBenchmark {

    // The data object we will be serializing.
    // It's initialized once in the @Setup method.
    private lateinit var user: User

    // The serialized JSON string.
    private lateinit var userJson: String

    @Setup
    fun setup() {
        // Prepare the data before the benchmark runs.
        // This setup time is NOT included in the benchmark results.
        user = User(1, "John Doe", "john.doe@example.com")
        userJson = Json.Default.encodeToString(user)
    }

    @Benchmark
    fun serialize(): String {
        // This is the operation we are measuring.
        return Json.Default.encodeToString(user)
    }

    @Benchmark
    fun deserialize(): User {
        // This is the other operation we are measuring.
        return Json.Default.decodeFromString<User>(userJson)
    }
}