package org.ye.serialization.benchmark

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
import org.ye.serialization.benchmark.factory.DomainSampleFactory
import org.ye.serialization.benchmark.factory.impl.ComposedSampleFactoryImpl
import org.ye.serialization.benchmark.factory.impl.DomainSampleFactoryImpl
import org.ye.serialization.benchmark.model.DomainSample
import java.util.concurrent.TimeUnit

@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Mode.AverageTime)
open class KotlinxBenchmark {
    private val composedSampleFactory: ComposedSampleFactory = ComposedSampleFactoryImpl()
    private val domainSampleFactory: DomainSampleFactory = DomainSampleFactoryImpl(composedSampleFactory)

    private lateinit var lightSample: DomainSample
    private lateinit var mediumSample: DomainSample
    private lateinit var heavySample: DomainSample

    @Setup
    fun setup(){
        lightSample = domainSampleFactory.produceLightSample()
        mediumSample = domainSampleFactory.produceMediumSample()
        heavySample = domainSampleFactory.produceHeavySample()
    }

    @Benchmark
    fun lightSampleBenchmark(): DomainSample {
        return doSerializationFlow(lightSample)
    }

    @Benchmark
    fun mediumSampleBenchmark(): DomainSample {
        return doSerializationFlow(mediumSample)
    }

    @Benchmark
    fun heavySampleBenchmark(): DomainSample {
        return doSerializationFlow(heavySample)
    }

    private fun doSerializationFlow(sample: DomainSample): DomainSample {
        val serialized = Json.Default.encodeToString(sample)
        val sampleDeserialized = Json.Default.decodeFromString<DomainSample>(serialized)
        return sampleDeserialized
    }
}