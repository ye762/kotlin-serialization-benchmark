# kotlin-serialization-benchmark using JMH

## Introduction
| Feature               | Gson                                    | Jackson                                             | Kotlinx Serialization                                   |
|-----------------------|-----------------------------------------|-----------------------------------------------------|---------------------------------------------------------|
| **Ease of Use**       | Simple and straightforward              | More complex but powerful                           | Very easy for Kotlin users                              |
| **Performance**       | Good for small to medium data           | Generally faster for large data                     | Optimized for Kotlin, good performance                  |
| **Flexibility**       | Limited customization options           | Highly configurable with annotations                | Flexible with built-in support for Kotlin types         |
| **Data Formats**      | JSON only                               | Supports multiple formats (JSON, XML, etc.)         | Primarily JSON, but supports other formats with plugins |
| **Community Support** | Strong, but less extensive than Jackson | Very strong, widely used in enterprise applications | Growing community, especially                           |

## Purpose

Show that actual performance meets hypothesis from `Introduction` raw. 

## Hardware setup

```
Operating System: Fedora Linux 42
Kernel Version: 6.15
Processors: 8 × Intel® Core™ i7-4770 CPU @ 3.40GHz
Memory: 16 GiB of RAM (14.5 GiB usable)
```

## Dataset
See ``

## Measurement

See `MEASUREMENT.md`

## Result

```
Benchmark                               Mode  Cnt   Score   Error  Units

GsonBenchmark.heavySampleBenchmark      avgt   10  27.642 ± 0.590  ms/op
JacksonBenchmark.heavySampleBenchmark   avgt   10  27.631 ± 2.096  ms/op
KotlinxBenchmark.heavySampleBenchmark   avgt   10  19.877 ± 0.444  ms/op


GsonBenchmark.mediumSampleBenchmark     avgt   10   5.482 ± 0.047  ms/op
JacksonBenchmark.mediumSampleBenchmark  avgt   10   5.354 ± 0.274  ms/op
KotlinxBenchmark.mediumSampleBenchmark  avgt   10   4.210 ± 0.098  ms/op

GsonBenchmark.lightSampleBenchmark      avgt   10   0.559 ± 0.010  ms/op
JacksonBenchmark.lightSampleBenchmark   avgt   10   0.428 ± 0.021  ms/op
KotlinxBenchmark.lightSampleBenchmark   avgt   10   0.446 ± 0.008  ms/op
```

## Conclusion

### Gson
Gson shows worst performance on all datasets.
### Jackson
Jackson shows same or better performance than Gson and much worse than kotlinx. Also, here is some error in measurement in case of Jackson, which could be dataset problem.
### Kotlinx
Kotlinx shows better or same performance on all datasets.

So, we did prove that Gson is good for smaller data, but still kotlinx is faster in all measurements.
Also we did not prove that Jackson is better for large dataset. But we assume that there is a problem in medium and heavy datasets. Good point for further analysis is to increase size of datasets which probably will make good distinction between Gson and Jackson in measurements.
