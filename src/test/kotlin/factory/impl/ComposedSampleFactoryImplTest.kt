package factory.impl

import factory.impl.TestHelper.SampleType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.ye.serialization.benchmark.factory.ComposedSampleFactory
import org.ye.serialization.benchmark.factory.SampleFactory
import org.ye.serialization.benchmark.factory.impl.ComposedSampleFactoryImpl
import org.ye.serialization.benchmark.factory.impl.DomainSampleFactoryImpl


class ComposedSampleFactoryImplTest {
    private lateinit var composedSampleFactory: ComposedSampleFactory

    // Under test
    private lateinit var sampleFactory: SampleFactory

    @BeforeEach
    fun setup() {
        composedSampleFactory = ComposedSampleFactoryImpl()
        sampleFactory = DomainSampleFactoryImpl(composedSampleFactory)
    }



    @Test
    fun whenLightSampleThenOk() {
        // given
        val expectedSample = TestHelper.produceDomainSample(SampleType.Light)
        // when
        val actualSample = sampleFactory.produceLightSample()
        // then
        assertThat(actualSample).usingRecursiveAssertion().isEqualTo(expectedSample)
    }

    @Test
    fun whenMediumSampleThenOk() {
        // given
        val expectedSample = TestHelper.produceDomainSample(SampleType.Medium)
        // when
        val actualSample = sampleFactory.produceMediumSample()
        // then
        assertThat(actualSample).usingRecursiveAssertion().isEqualTo(expectedSample)
    }

    @Test
    fun whenHeavySampleThenOk() {
        // given
        val expectedSample = TestHelper.produceDomainSample(SampleType.Heavy)
        // when
        val actualSample = sampleFactory.produceHeavySample()
        // then
        assertThat(actualSample).usingRecursiveAssertion().isEqualTo(expectedSample)
    }
}