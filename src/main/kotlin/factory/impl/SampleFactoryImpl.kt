package org.ye.serialization.benchmark.factory.impl

import org.ye.serialization.benchmark.factory.ComposedSampleFactory
import org.ye.serialization.benchmark.factory.DomainSampleFactory
import org.ye.serialization.benchmark.factory.util.FactoryUtil
import org.ye.serialization.benchmark.factory.util.FactoryUtil.Companion.generateNestedSample
import org.ye.serialization.benchmark.model.SampleA
import org.ye.serialization.benchmark.model.SampleB
import org.ye.serialization.benchmark.model.SampleC
import org.ye.serialization.benchmark.model.ComposedSample
import org.ye.serialization.benchmark.model.DomainSample
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
                ints = FactoryUtil.generateMultipleInts(13, 100)
            ),
            sampleE = SampleE(
                doubles = FactoryUtil.generateMultipleDoubles(0.88, 100)
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
                word = FactoryUtil.generateMultipleStrings("small-word-about-human-design", 1000)
            ),
            sampleD = SampleD(
                ints = FactoryUtil.generateMultipleInts(13, 1000)
            ),
            sampleE = SampleE(
                doubles = FactoryUtil.generateMultipleDoubles(0.88, 1000)
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
                ints = FactoryUtil.generateMultipleInts(13, 5000)
            ),
            sampleE = SampleE(
                doubles = FactoryUtil.generateMultipleDoubles(0.88, 5000)
            )
        )
}

class DomainSampleFactoryImpl(private val composedSampleFactory: ComposedSampleFactory) : DomainSampleFactory() {
    override fun produceLightSample(): DomainSample =
        DomainSample(
            data = generateNestedSample(
                composedSample = composedSampleFactory.produceLightSample()
            )
        )

    override fun produceMediumSample(): DomainSample =
        DomainSample(
            data = generateNestedSample(
                composedSample = composedSampleFactory.produceMediumSample()
            )
        )

    override fun produceHeavySample(): DomainSample =
        DomainSample(
            data = generateNestedSample(
                composedSample = composedSampleFactory.produceHeavySample()
            )
        )
}