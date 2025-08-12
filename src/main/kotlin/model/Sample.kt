package org.ye.serialization.benchmark.model

import kotlinx.serialization.Serializable
import com.fasterxml.jackson.annotation.JsonProperty

@Serializable
data class SampleA(@JsonProperty("v0") val v0: Int)

@Serializable
data class SampleB(@JsonProperty("v0") val v0: Double)

@Serializable
data class SampleC(@JsonProperty("word") val word: String)

@Serializable
data class SampleD(@JsonProperty("ints") val ints: List<Int>)

@Serializable
data class SampleE(@JsonProperty("doubles") val doubles: List<Double>)

@Serializable
data class ComposedSample(
    @JsonProperty("a") val a: SampleA,
    @JsonProperty("b") val b: SampleB,
    @JsonProperty("c") val c: SampleC,
    @JsonProperty("d") val d: SampleD,
    @JsonProperty("e") val e: SampleE
)

@Serializable
data class NestedA(
    @JsonProperty("ref0") val ref0: ComposedSample
)

@Serializable
data class NestedSampleB(
    @JsonProperty("ref0") val ref0: ComposedSample,
    @JsonProperty("ref1") val ref1: NestedA
)

@Serializable
data class NestedSampleC(
    @JsonProperty("ref0") val ref0: NestedSampleB,
    @JsonProperty("ref1") val ref1: NestedA,
    @JsonProperty("ref2") val ref2: ComposedSample
)

@Serializable
data class NestedSampleD(
    @JsonProperty("ref0") val ref0: NestedSampleC,
    @JsonProperty("ref1") val ref1: NestedSampleB,
    @JsonProperty("ref2") val ref2: NestedA,
    @JsonProperty("ref3") val ref3: ComposedSample
)

@Serializable
data class NestedSampleE(
    @JsonProperty("ref0") val ref0: NestedSampleD,
    @JsonProperty("ref1") val ref1: NestedSampleC,
    @JsonProperty("ref2") val ref2: NestedSampleB,
    @JsonProperty("ref3") val ref3: NestedA,
    @JsonProperty("ref4") val ref4: ComposedSample
)

@Serializable
data class DomainSample(
    @JsonProperty("data") val data: NestedSampleE
)