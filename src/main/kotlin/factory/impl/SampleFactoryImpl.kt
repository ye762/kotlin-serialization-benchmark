package org.ye.serialization.benchmark.factory.impl

import org.ye.serialization.benchmark.factory.ComposedSampleFactory
import org.ye.serialization.benchmark.factory.NestedSampleFactory
import org.ye.serialization.benchmark.factory.util.FactoryUtil
import org.ye.serialization.benchmark.model.NestedSample
import org.ye.serialization.benchmark.model.SampleA
import org.ye.serialization.benchmark.model.SampleB
import org.ye.serialization.benchmark.model.SampleC
import org.ye.serialization.benchmark.model.ComposedSample
import org.ye.serialization.benchmark.model.SampleD
import org.ye.serialization.benchmark.model.SampleE

class ComposedSampleFactoryImpl : ComposedSampleFactory() {
    override fun produceLightSample(): ComposedSample =
        ComposedSample(
            sampleA = SampleA(
                vInt = 13
            ),
            sampleB = SampleB(
                vDouble = 0.88
            ),
            sampleC = SampleC(
                word = FactoryUtil.generateMultipleStrings("small-word-about-human-design", 50)
            ),
            sampleD = SampleD(
                ints = FactoryUtil.generateMultipleIntegers(13, 50)
            ),
            sampleE = SampleE(
                doubles = FactoryUtil.generateMultipleDouble(0.88, 50)
            )
        )

    override fun produceMediumSample(): ComposedSample =
        ComposedSample(
            sampleA = SampleA(
                vInt = 13
            ),
            sampleB = SampleB(
                vDouble = 0.88
            ),
            sampleC = SampleC(
                word = FactoryUtil.generateMultipleStrings("small-word-about-human-design", 500)
            ),
            sampleD = SampleD(
                ints = FactoryUtil.generateMultipleIntegers(13, 500)
            ),
            sampleE = SampleE(
                doubles = FactoryUtil.generateMultipleDouble(0.88, 500)
            )
        )

    override fun produceHeavySample(): ComposedSample =
        ComposedSample(
            sampleA = SampleA(
                vInt = 13
            ),
            sampleB = SampleB(
                vDouble = 0.88
            ),
            sampleC = SampleC(
                word = FactoryUtil.generateMultipleStrings("small-word-about-human-design", 5000)
            ),
            sampleD = SampleD(
                ints = FactoryUtil.generateMultipleIntegers(13, 5000)
            ),
            sampleE = SampleE(
                doubles = FactoryUtil.generateMultipleDouble(0.88, 5000)
            )
        )
}

class NestedSampleFactoryImpl(private val composedSampleFactory: ComposedSampleFactory) : NestedSampleFactory() {
    override fun produceLightSample(): NestedSample {
        return composedSampleFactory.produceLightSample().let {
            FactoryUtil.generateNestedSample(it)
        }
    }

    override fun produceMediumSample(): NestedSample {
        return composedSampleFactory.produceMediumSample().let { FactoryUtil.generateNestedSample(it) }
    }

    override fun produceHeavySample(): NestedSample {
        return composedSampleFactory.produceHeavySample().let { FactoryUtil.generateNestedSample(it) }
    }
}