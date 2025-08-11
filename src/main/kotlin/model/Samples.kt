package org.ye.serialization.benchmark.model

data class SampleA(val vInt: Int)
data class SampleB(val vDouble: Double)
data class SampleC(val word: String)
data class SampleD(val arrI: List<Int>)
data class SampleE(val arrR: List<Double>)

data class SampleAB(val sampleA: SampleA, val sampleB: SampleB)
data class SampleCD(val sampleC: SampleC, val sampleD: SampleD)
data class SampleDE(val sampleD: SampleD, val sampleE: SampleE)

//data class SampleNestedA()

// Samples types:
//   type A - linear values in I space
//   type B - linear values in R space
//   type C - symbolic vectors(string)
//   type D - integer vectors
//   type E - rational vectors
// Combined samples:
//   type A + type B
//   type C + type D
//   type D + type E
// Nested samples:
//   type Nested - nested types ( e.g. data class A(val ref: B); data class B(val i: Int) )
//   NestedA - deepness 2 (e.g. typeA <- nestedA)
//   NestedB - deepness 3 (e.g. typeA <- nestedA <- nestedB)
//   NestedC - deepness 3, but two ways (e.g. typeA <- nestedA <- nestedB <- nestedC + typeB <- nestedA <- nestedB <- nestedC)