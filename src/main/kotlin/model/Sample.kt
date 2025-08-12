package org.ye.serialization.benchmark.model

import kotlinx.serialization.Serializable

@Serializable
data class SampleA(val vInt: Int)

@Serializable
data class SampleB(val vDouble: Double)

@Serializable
data class SampleC(val word: String)

@Serializable
data class SampleD(val ints: List<Int>)

@Serializable
data class SampleE(val doubles: List<Double>)

@Serializable
data class ComposedSample(
    val sampleA: SampleA,
    val sampleB: SampleB,
    val sampleC: SampleC,
    val sampleD: SampleD,
    val sampleE: SampleE
)

@Serializable
data class NestedSampleA(
    val ref0: ComposedSample
)
@Serializable
data class NestedSampleB(
    val ref0: ComposedSample,
    val ref1: NestedSampleA
)
@Serializable
data class NestedSampleC(
    val ref0: NestedSampleB,
    val ref1: NestedSampleA,
    val ref2: ComposedSample
)
@Serializable
data class NestedSampleD(
    val ref0: NestedSampleC,
    val ref1: NestedSampleB,
    val ref2: NestedSampleA,
    val ref3: ComposedSample
)
@Serializable
data class NestedSampleE(
    val ref0: NestedSampleD,
    val ref1: NestedSampleC,
    val ref2: NestedSampleB,
    val ref3: NestedSampleA,
    val ref4: ComposedSample
)

@Serializable
data class DomainSample(
    val data: NestedSampleE
)