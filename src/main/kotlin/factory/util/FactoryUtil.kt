package org.ye.serialization.benchmark.factory.util

import org.ye.serialization.benchmark.model.NestedSampleA
import org.ye.serialization.benchmark.model.NestedSampleB
import org.ye.serialization.benchmark.model.NestedSampleC
import org.ye.serialization.benchmark.model.NestedSampleD
import org.ye.serialization.benchmark.model.NestedSample
import org.ye.serialization.benchmark.model.ComposedSample

@Suppress("UNCHECKED_CAST")
class FactoryUtil {
    companion object {
        fun generateMultipleStrings(base: String, times: Int): String {
            assert(times > 0)
            val builder = StringBuilder()
            for (i in 1 .. times) builder.append(base)
            return builder.toString()
        }

        fun generateMultipleIntegers(base: Int, times: Int): List<Int> =
            generateMultipleNumbers(base, times) as List<Int>

        fun generateMultipleDouble(base: Double, times: Int): List<Double> =
            generateMultipleNumbers(base, times) as List<Double>


        private fun generateMultipleNumbers(base: Number, times: Int): List<Number> {
            assert(times > 0)
            val list = ArrayList<Number>(times)
            for (i in 1 .. times ) {
                list.add(base)
            }
            return list
        }

        fun generateNestedSample(composedSample: ComposedSample): NestedSample {
            return NestedSample(
                ref0 = NestedSampleD(
                    ref0 = NestedSampleC(
                        ref0 = NestedSampleB(
                            ref0 = composedSample,
                            ref1 = NestedSampleA(
                                ref0 = composedSample
                            )
                        ),
                        ref1 = NestedSampleA(
                            ref0 = composedSample
                        ),
                        ref2 = composedSample
                    ),
                    ref1 = NestedSampleB(
                        ref0 = composedSample,
                        ref1 = NestedSampleA(
                            ref0 = composedSample
                        )
                    ),
                    ref2 = NestedSampleA(
                        ref0 = composedSample
                    ),
                    ref3 = composedSample
                ),
                ref1 = NestedSampleC(
                    ref0 = NestedSampleB(
                        ref0 = composedSample,
                        ref1 = NestedSampleA(
                            ref0 = composedSample
                        )
                    ),
                    ref1 = NestedSampleA(
                        ref0 = composedSample
                    ),
                    ref2 = composedSample
                ),
                ref2 = NestedSampleB(
                    ref0 = composedSample,
                    ref1 = NestedSampleA(
                        ref0 = composedSample
                    )
                ),
                ref3 = NestedSampleA(
                    ref0 = composedSample
                ),
                ref4 = composedSample
            )
        }
    }
}