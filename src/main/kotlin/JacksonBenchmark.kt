package org.ye.serialization.benchmark

import com.fasterxml.jackson.databind.ObjectMapper
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
open class JacksonBenchmark {
    private val composedSampleFactory: ComposedSampleFactory = ComposedSampleFactoryImpl()
    private val domainSampleFactory: DomainSampleFactory = DomainSampleFactoryImpl(composedSampleFactory)

    private val jacksonObjectMapper: ObjectMapper = com.fasterxml.jackson.module.kotlin.jacksonObjectMapper()

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
        val serialized = jacksonObjectMapper.writeValueAsString(sample)
        val sampleDeserialized = jacksonObjectMapper.readValue(serialized, sample.javaClass)
        return sampleDeserialized
    }
}