package org.ye.serialization.benchmark.factory

import org.ye.serialization.benchmark.model.ComposedSample
import org.ye.serialization.benchmark.model.DomainSample

interface SampleFactory {
    fun produceLightSample(): Any
    fun produceMediumSample(): Any
    fun produceHeavySample(): Any
}

abstract class ComposedSampleFactory : SampleFactory {
    abstract override fun produceLightSample(): ComposedSample
    abstract override fun produceMediumSample(): ComposedSample
    abstract override fun produceHeavySample(): ComposedSample
}

abstract class DomainSampleFactory : SampleFactory {
    abstract override fun produceLightSample(): DomainSample
    abstract override fun produceMediumSample(): DomainSample
    abstract override fun produceHeavySample(): DomainSample
}
