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
import org.ye.serialization.benchmark.factory.ComposedSampleFactory
import org.ye.serialization.benchmark.factory.NestedSampleFactory
import org.ye.serialization.benchmark.factory.impl.ComposedSampleFactoryImpl
import org.ye.serialization.benchmark.factory.impl.NestedSampleFactoryImpl
import org.ye.serialization.benchmark.model.NestedSample
import java.util.concurrent.TimeUnit

@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Mode.AverageTime)
open class KotlinxBenchmark {
    private val composedSampleFactory: ComposedSampleFactory = ComposedSampleFactoryImpl()
    private val nestedSampleFactory: NestedSampleFactory = NestedSampleFactoryImpl(composedSampleFactory)

    private lateinit var lightSample: NestedSample
    private lateinit var mediumSample: NestedSample
    private lateinit var heavySample: NestedSample

    @Setup
    fun setup(){
        lightSample = nestedSampleFactory.produceLightSample()
        mediumSample = nestedSampleFactory.produceMediumSample()
        heavySample = nestedSampleFactory.produceHeavySample()
    }

    @Benchmark
    fun lightSampleBenchmark(): NestedSample {
        val lightSampleSerialized = Json.Default.encodeToString(value = lightSample)
        val sampleDeserialized = Json.Default.decodeFromString<NestedSample>(lightSampleSerialized)
        return sampleDeserialized
    }

    @Benchmark
    fun mediumSampleBenchmark(): NestedSample {
        val mediumSampleSerialized = Json.Default.encodeToString(value = mediumSample)
        val sampleDeserialized = Json.Default.decodeFromString<NestedSample>(mediumSampleSerialized)
        return sampleDeserialized
    }

    @Benchmark
    fun heavySampleBenchmark(): NestedSample {
        val heavySampleSerialized = Json.Default.encodeToString(value = heavySample)
        val sampleDeserialized = Json.Default.decodeFromString<NestedSample>(heavySampleSerialized)
        return sampleDeserialized
    }
}