package factory.impl

import org.ye.serialization.benchmark.model.ComposedSample
import org.ye.serialization.benchmark.model.DomainSample
import org.ye.serialization.benchmark.model.NestedA
import org.ye.serialization.benchmark.model.NestedSampleB
import org.ye.serialization.benchmark.model.NestedSampleC
import org.ye.serialization.benchmark.model.NestedSampleD
import org.ye.serialization.benchmark.model.NestedSampleE
import org.ye.serialization.benchmark.model.SampleA
import org.ye.serialization.benchmark.model.SampleB
import org.ye.serialization.benchmark.model.SampleC
import org.ye.serialization.benchmark.model.SampleD
import org.ye.serialization.benchmark.model.SampleE

class TestHelper {
    enum class SampleType {
        Light,
        Medium,
        Heavy
    }

    companion object {
        private const val BASE_INT_VALUE = 13
        private const val BASE_DOUBLE_VALUE = 0.88
        private const val BASE_STRING_VALUE = "small-word-about-human-design"

        fun produceDomainSample(type: SampleType): DomainSample {
            val data: Triple<String, List<Int>, List<Double>> = when(type) {
                SampleType.Light -> {
                    val times = 100
                    val multipleStrings = BASE_STRING_VALUE.let {
                        val builder: StringBuilder = StringBuilder()
                        (1 .. times).forEach { i -> builder.append(it) }
                        builder.toString()
                    }
                    val multipleInts = BASE_INT_VALUE.let {
                        val list = ArrayList<Int>(times)
                        (1 .. times).forEach { i -> list.add(it) }
                        list
                    }
                    val multipleDoubles = BASE_DOUBLE_VALUE.let {
                        val list = ArrayList<Double>(times)
                        (1 .. times).forEach { i -> list.add(it) }
                        list
                    }
                    Triple(multipleStrings, multipleInts, multipleDoubles)
                }
                SampleType.Medium -> {
                    val times = 1000
                    val multipleStrings = BASE_STRING_VALUE.let {
                        val builder: StringBuilder = StringBuilder()
                        (1 .. times).forEach { i -> builder.append(it) }
                        builder.toString()
                    }
                    val multipleInts = BASE_INT_VALUE.let {
                        val list = ArrayList<Int>(100)
                        (1 .. times).forEach { i -> list.add(it) }
                        list
                    }
                    val multipleDoubles = BASE_DOUBLE_VALUE.let {
                        val list = ArrayList<Double>(100)
                        (1 .. times).forEach { i -> list.add(it) }
                        list
                    }
                    Triple(multipleStrings, multipleInts, multipleDoubles)
                }
                SampleType.Heavy -> {
                    val times = 5000
                    val multipleStrings = BASE_STRING_VALUE.let {
                        val builder: StringBuilder = StringBuilder()
                        (1 .. times).forEach { i -> builder.append(it) }
                        builder.toString()
                    }
                    val multipleInts = BASE_INT_VALUE.let {
                        val list = ArrayList<Int>(100)
                        (1 .. times).forEach { i -> list.add(it) }
                        list
                    }
                    val multipleDoubles = BASE_DOUBLE_VALUE.let {
                        val list = ArrayList<Double>(100)
                        (1 .. times).forEach { i -> list.add(it) }
                        list
                    }
                    Triple(multipleStrings, multipleInts, multipleDoubles)
                }
            }
            val composedSample = ComposedSample(
                a = SampleA(
                    v0 = 13
                ),
                b = SampleB(
                    v0 = 0.88
                ),
                c = SampleC(
                    word = data.first
                ),
                d = SampleD(
                    ints = data.second
                ),
                e = SampleE(
                    doubles = data.third
                )
            )
            return DomainSample(
                NestedSampleE(
                    ref0 = NestedSampleD(
                        ref0 = NestedSampleC(
                            ref0 = NestedSampleB(
                                ref0 = composedSample,
                                ref1 = NestedA(
                                    ref0 = composedSample
                                )
                            ),
                            ref1 = NestedA(
                                ref0 = composedSample
                            ),
                            ref2 = composedSample
                        ),
                        ref1 = NestedSampleB(
                            ref0 = composedSample,
                            ref1 = NestedA(
                                ref0 = composedSample
                            )
                        ),
                        ref2 = NestedA(
                            ref0 = composedSample
                        ),
                        ref3 = composedSample
                    ),
                    ref1 = NestedSampleC(
                        ref0 = NestedSampleB(
                            ref0 = composedSample,
                            ref1 = NestedA(
                                ref0 = composedSample
                            )
                        ),
                        ref1 = NestedA(
                            ref0 = composedSample
                        ),
                        ref2 = composedSample
                    ),
                    ref2 = NestedSampleB(
                        ref0 = composedSample,
                        ref1 = NestedA(
                            ref0 = composedSample
                        )
                    ),
                    ref3 = NestedA(
                        ref0 = composedSample
                    ),
                    ref4 = composedSample
                )
            )
        }
    }
}