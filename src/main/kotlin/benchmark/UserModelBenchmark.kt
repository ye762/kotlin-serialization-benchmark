package org.ye.serialization.benchmark.benchmark

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.Setup
import org.openjdk.jmh.annotations.State

import org.ye.serialization.benchmark.model.User
import java.util.concurrent.TimeUnit

@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Mode.AverageTime)
open class UserModelBenchmark {

    private lateinit var user: User
    private lateinit var userJson: String

    @Setup
    fun setup() {
        user = User(1, "John Doe", "john.doe@example.com")
        userJson = Json.Default.encodeToString(user)
    }

    @Benchmark
    fun serialize(): String {
        return Json.Default.encodeToString(user)
    }

    @Benchmark
    fun deserialize(): User {
        return Json.Default.decodeFromString<User>(userJson)
    }
}
