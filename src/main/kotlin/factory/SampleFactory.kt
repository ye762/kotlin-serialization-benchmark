package org.ye.serialization.benchmark.factory

import org.ye.serialization.benchmark.model.NestedSample
import org.ye.serialization.benchmark.model.ComposedSample

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

abstract class NestedSampleFactory : SampleFactory {
    abstract override fun produceLightSample(): NestedSample
    abstract override fun produceMediumSample(): NestedSample
    abstract override fun produceHeavySample(): NestedSample
}
