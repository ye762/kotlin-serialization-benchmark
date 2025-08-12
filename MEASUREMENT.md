```
/home/ye34/.sdkman/candidates/java/21.0.2-amzn/bin/java -javaagent:/home/ye34/.local/share/JetBrains/Toolbox/apps/intellij-idea-community-edition/lib/idea_rt.jar=29845 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/ye34/.local/IdeaProjects/ye-serialization-benchmark/build/classes/kotlin/main:/home/ye34/.local/IdeaProjects/ye-serialization-benchmark/build/classes/java/main:/home/ye34/.local/IdeaProjects/ye-serialization-benchmark/build/tmp/kapt3/classes/main:/home/ye34/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.module/jackson-module-kotlin/2.15.0/8a0d8abf0efc4c9bdeb54d0049078ffec1a2f35f/jackson-module-kotlin-2.15.0.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/2.1.21/97a0975aa19d925e109537af60eb46902920015c/kotlin-stdlib-2.1.21.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/org.openjdk.jmh/jmh-core/1.37/896f27e49105b35ea1964319c83d12082e7a79ef/jmh-core-1.37.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.13.1/853ce06c11316b33a8eae5e9095da096a9528b8f/gson-2.13.1.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/kotlinx-serialization-json-jvm/1.6.3/2241746853abf04073e3ab0dcd9e6729d363b313/kotlinx-serialization-json-jvm-1.6.3.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-databind/2.15.0/d41caa3a4e9f85382702a059a65c512f85ac230/jackson-databind-2.15.0.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-annotations/2.15.0/89b0fd554928425a776a6e97ed010034312af21d/jackson-annotations-2.15.0.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-reflect/1.5.32/fb7f979b963e5ba051c6753fbbe80a1b6c6f745/kotlin-reflect-1.5.32.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/net.sf.jopt-simple/jopt-simple/5.0.4/4fdac2fbe92dfad86aa6e9301736f6b4342a3f5c/jopt-simple-5.0.4.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-math3/3.6.1/e4ba98f1d4b3c80ec46392f25e094a6a2e58fcbf/commons-math3-3.6.1.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/com.google.errorprone/error_prone_annotations/2.38.0/fc0ae991433e8590ba51cd558421478318a74c8c/error_prone_annotations-2.38.0.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-core/2.15.0/12f334a1dc9c6d2854c43ae314024dde8b3ad572/jackson-core-2.15.0.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/kotlinx-serialization-core-jvm/1.6.3/6b6c17d0312ba7192893adea9d52959941d0119b/kotlinx-serialization-core-jvm-1.6.3.jar:/home/ye34/.gradle/caches/modules-2/files-2.1/ch.randelshofer/fastdoubleparser/0.8.0/85c25540369921659556ead85e02c99ef0d24280/fastdoubleparser-0.8.0.jar org.ye.serialization.benchmark.MainKt
# JMH version: 1.37
# VM version: JDK 21.0.2, OpenJDK 64-Bit Server VM, 21.0.2+13-LTS
# VM invoker: /home/ye34/.sdkman/candidates/java/21.0.2-amzn/bin/java
# VM options: -javaagent:/home/ye34/.local/share/JetBrains/Toolbox/apps/intellij-idea-community-edition/lib/idea_rt.jar=29845 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 10 iterations, 10 s each
# Measurement: 10 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.ye.serialization.benchmark.GsonBenchmark.heavySampleBenchmark

# Run progress: 0.00% complete, ETA 00:30:00
# Fork: 1 of 1
# Warmup Iteration   1: 28.994 ms/op
# Warmup Iteration   2: 27.900 ms/op
# Warmup Iteration   3: 27.903 ms/op
# Warmup Iteration   4: 28.851 ms/op
# Warmup Iteration   5: 29.485 ms/op
# Warmup Iteration   6: 31.627 ms/op
# Warmup Iteration   7: 31.209 ms/op
# Warmup Iteration   8: 30.624 ms/op
# Warmup Iteration   9: 30.039 ms/op
# Warmup Iteration  10: 29.797 ms/op
Iteration   1: 28.045 ms/op
Iteration   2: 27.477 ms/op
Iteration   3: 27.415 ms/op
Iteration   4: 27.359 ms/op
Iteration   5: 27.414 ms/op
Iteration   6: 28.221 ms/op
Iteration   7: 28.321 ms/op
Iteration   8: 27.446 ms/op
Iteration   9: 27.407 ms/op
Iteration  10: 27.316 ms/op


Result "org.ye.serialization.benchmark.GsonBenchmark.heavySampleBenchmark":
27.642 ±(99.9%) 0.590 ms/op [Average]
(min, avg, max) = (27.316, 27.642, 28.321), stdev = 0.390
CI (99.9%): [27.052, 28.232] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.2, OpenJDK 64-Bit Server VM, 21.0.2+13-LTS
# VM invoker: /home/ye34/.sdkman/candidates/java/21.0.2-amzn/bin/java
# VM options: -javaagent:/home/ye34/.local/share/JetBrains/Toolbox/apps/intellij-idea-community-edition/lib/idea_rt.jar=29845 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 10 iterations, 10 s each
# Measurement: 10 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.ye.serialization.benchmark.GsonBenchmark.lightSampleBenchmark

# Run progress: 11.11% complete, ETA 00:26:48
# Fork: 1 of 1
# Warmup Iteration   1: 0.576 ms/op
# Warmup Iteration   2: 0.558 ms/op
# Warmup Iteration   3: 0.554 ms/op
# Warmup Iteration   4: 0.557 ms/op
# Warmup Iteration   5: 0.568 ms/op
# Warmup Iteration   6: 0.554 ms/op
# Warmup Iteration   7: 0.554 ms/op
# Warmup Iteration   8: 0.557 ms/op
# Warmup Iteration   9: 0.557 ms/op
# Warmup Iteration  10: 0.557 ms/op
Iteration   1: 0.554 ms/op
Iteration   2: 0.555 ms/op
Iteration   3: 0.555 ms/op
Iteration   4: 0.558 ms/op
Iteration   5: 0.574 ms/op
Iteration   6: 0.559 ms/op
Iteration   7: 0.567 ms/op
Iteration   8: 0.557 ms/op
Iteration   9: 0.556 ms/op
Iteration  10: 0.557 ms/op


Result "org.ye.serialization.benchmark.GsonBenchmark.lightSampleBenchmark":
0.559 ±(99.9%) 0.010 ms/op [Average]
(min, avg, max) = (0.554, 0.559, 0.574), stdev = 0.006
CI (99.9%): [0.550, 0.569] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.2, OpenJDK 64-Bit Server VM, 21.0.2+13-LTS
# VM invoker: /home/ye34/.sdkman/candidates/java/21.0.2-amzn/bin/java
# VM options: -javaagent:/home/ye34/.local/share/JetBrains/Toolbox/apps/intellij-idea-community-edition/lib/idea_rt.jar=29845 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 10 iterations, 10 s each
# Measurement: 10 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.ye.serialization.benchmark.GsonBenchmark.mediumSampleBenchmark

# Run progress: 22.22% complete, ETA 00:23:25
# Fork: 1 of 1
# Warmup Iteration   1: 5.959 ms/op
# Warmup Iteration   2: 5.845 ms/op
# Warmup Iteration   3: 5.516 ms/op
# Warmup Iteration   4: 5.498 ms/op
# Warmup Iteration   5: 5.479 ms/op
# Warmup Iteration   6: 5.479 ms/op
# Warmup Iteration   7: 5.492 ms/op
# Warmup Iteration   8: 5.471 ms/op
# Warmup Iteration   9: 5.631 ms/op
# Warmup Iteration  10: 5.579 ms/op
Iteration   1: 5.551 ms/op
Iteration   2: 5.492 ms/op
Iteration   3: 5.492 ms/op
Iteration   4: 5.453 ms/op
Iteration   5: 5.468 ms/op
Iteration   6: 5.502 ms/op
Iteration   7: 5.455 ms/op
Iteration   8: 5.474 ms/op
Iteration   9: 5.441 ms/op
Iteration  10: 5.489 ms/op


Result "org.ye.serialization.benchmark.GsonBenchmark.mediumSampleBenchmark":
5.482 ±(99.9%) 0.047 ms/op [Average]
(min, avg, max) = (5.441, 5.482, 5.551), stdev = 0.031
CI (99.9%): [5.434, 5.529] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.2, OpenJDK 64-Bit Server VM, 21.0.2+13-LTS
# VM invoker: /home/ye34/.sdkman/candidates/java/21.0.2-amzn/bin/java
# VM options: -javaagent:/home/ye34/.local/share/JetBrains/Toolbox/apps/intellij-idea-community-edition/lib/idea_rt.jar=29845 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 10 iterations, 10 s each
# Measurement: 10 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.ye.serialization.benchmark.JacksonBenchmark.heavySampleBenchmark

# Run progress: 33.33% complete, ETA 00:20:04
# Fork: 1 of 1
# Warmup Iteration   1: 29.385 ms/op
# Warmup Iteration   2: 26.820 ms/op
# Warmup Iteration   3: 28.550 ms/op
# Warmup Iteration   4: 27.114 ms/op
# Warmup Iteration   5: 26.902 ms/op
# Warmup Iteration   6: 26.788 ms/op
# Warmup Iteration   7: 26.947 ms/op
# Warmup Iteration   8: 26.736 ms/op
# Warmup Iteration   9: 26.874 ms/op
# Warmup Iteration  10: 26.743 ms/op
Iteration   1: 26.759 ms/op
Iteration   2: 26.715 ms/op
Iteration   3: 26.764 ms/op
Iteration   4: 27.329 ms/op
Iteration   5: 28.439 ms/op
Iteration   6: 28.240 ms/op
Iteration   7: 26.854 ms/op
Iteration   8: 26.773 ms/op
Iteration   9: 27.291 ms/op
Iteration  10: 31.149 ms/op


Result "org.ye.serialization.benchmark.JacksonBenchmark.heavySampleBenchmark":
27.631 ±(99.9%) 2.096 ms/op [Average]
(min, avg, max) = (26.715, 27.631, 31.149), stdev = 1.386
CI (99.9%): [25.535, 29.727] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.2, OpenJDK 64-Bit Server VM, 21.0.2+13-LTS
# VM invoker: /home/ye34/.sdkman/candidates/java/21.0.2-amzn/bin/java
# VM options: -javaagent:/home/ye34/.local/share/JetBrains/Toolbox/apps/intellij-idea-community-edition/lib/idea_rt.jar=29845 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 10 iterations, 10 s each
# Measurement: 10 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.ye.serialization.benchmark.JacksonBenchmark.lightSampleBenchmark

# Run progress: 44.44% complete, ETA 00:16:44
# Fork: 1 of 1
# Warmup Iteration   1: 0.467 ms/op
# Warmup Iteration   2: 0.408 ms/op
# Warmup Iteration   3: 0.428 ms/op
# Warmup Iteration   4: 0.420 ms/op
# Warmup Iteration   5: 0.405 ms/op
# Warmup Iteration   6: 0.460 ms/op
# Warmup Iteration   7: 0.442 ms/op
# Warmup Iteration   8: 0.439 ms/op
# Warmup Iteration   9: 0.448 ms/op
# Warmup Iteration  10: 0.414 ms/op
Iteration   1: 0.456 ms/op
Iteration   2: 0.438 ms/op
Iteration   3: 0.435 ms/op
Iteration   4: 0.426 ms/op
Iteration   5: 0.432 ms/op
Iteration   6: 0.423 ms/op
Iteration   7: 0.412 ms/op
Iteration   8: 0.413 ms/op
Iteration   9: 0.410 ms/op
Iteration  10: 0.433 ms/op


Result "org.ye.serialization.benchmark.JacksonBenchmark.lightSampleBenchmark":
0.428 ±(99.9%) 0.021 ms/op [Average]
(min, avg, max) = (0.410, 0.428, 0.456), stdev = 0.014
CI (99.9%): [0.407, 0.449] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.2, OpenJDK 64-Bit Server VM, 21.0.2+13-LTS
# VM invoker: /home/ye34/.sdkman/candidates/java/21.0.2-amzn/bin/java
# VM options: -javaagent:/home/ye34/.local/share/JetBrains/Toolbox/apps/intellij-idea-community-edition/lib/idea_rt.jar=29845 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 10 iterations, 10 s each
# Measurement: 10 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.ye.serialization.benchmark.JacksonBenchmark.mediumSampleBenchmark

# Run progress: 55.56% complete, ETA 00:13:23
# Fork: 1 of 1
# Warmup Iteration   1: 5.627 ms/op
# Warmup Iteration   2: 5.216 ms/op
# Warmup Iteration   3: 5.117 ms/op
# Warmup Iteration   4: 5.053 ms/op
# Warmup Iteration   5: 5.126 ms/op
# Warmup Iteration   6: 5.116 ms/op
# Warmup Iteration   7: 5.189 ms/op
# Warmup Iteration   8: 5.483 ms/op
# Warmup Iteration   9: 5.244 ms/op
# Warmup Iteration  10: 5.484 ms/op
Iteration   1: 5.230 ms/op
Iteration   2: 5.257 ms/op
Iteration   3: 5.182 ms/op
Iteration   4: 5.148 ms/op
Iteration   5: 5.744 ms/op
Iteration   6: 5.367 ms/op
Iteration   7: 5.488 ms/op
Iteration   8: 5.465 ms/op
Iteration   9: 5.243 ms/op
Iteration  10: 5.414 ms/op


Result "org.ye.serialization.benchmark.JacksonBenchmark.mediumSampleBenchmark":
5.354 ±(99.9%) 0.274 ms/op [Average]
(min, avg, max) = (5.148, 5.354, 5.744), stdev = 0.181
CI (99.9%): [5.080, 5.628] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.2, OpenJDK 64-Bit Server VM, 21.0.2+13-LTS
# VM invoker: /home/ye34/.sdkman/candidates/java/21.0.2-amzn/bin/java
# VM options: -javaagent:/home/ye34/.local/share/JetBrains/Toolbox/apps/intellij-idea-community-edition/lib/idea_rt.jar=29845 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 10 iterations, 10 s each
# Measurement: 10 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.ye.serialization.benchmark.KotlinxBenchmark.heavySampleBenchmark

# Run progress: 66.67% complete, ETA 00:10:02
# Fork: 1 of 1
# Warmup Iteration   1: 22.156 ms/op
# Warmup Iteration   2: 20.690 ms/op
# Warmup Iteration   3: 21.714 ms/op
# Warmup Iteration   4: 20.698 ms/op
# Warmup Iteration   5: 19.796 ms/op
# Warmup Iteration   6: 20.220 ms/op
# Warmup Iteration   7: 20.793 ms/op
# Warmup Iteration   8: 20.818 ms/op
# Warmup Iteration   9: 20.228 ms/op
# Warmup Iteration  10: 19.666 ms/op
Iteration   1: 19.665 ms/op
Iteration   2: 19.767 ms/op
Iteration   3: 20.085 ms/op
Iteration   4: 19.336 ms/op
Iteration   5: 19.748 ms/op
Iteration   6: 20.127 ms/op
Iteration   7: 19.596 ms/op
Iteration   8: 20.183 ms/op
Iteration   9: 20.134 ms/op
Iteration  10: 20.134 ms/op


Result "org.ye.serialization.benchmark.KotlinxBenchmark.heavySampleBenchmark":
19.877 ±(99.9%) 0.444 ms/op [Average]
(min, avg, max) = (19.336, 19.877, 20.183), stdev = 0.294
CI (99.9%): [19.433, 20.321] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.2, OpenJDK 64-Bit Server VM, 21.0.2+13-LTS
# VM invoker: /home/ye34/.sdkman/candidates/java/21.0.2-amzn/bin/java
# VM options: -javaagent:/home/ye34/.local/share/JetBrains/Toolbox/apps/intellij-idea-community-edition/lib/idea_rt.jar=29845 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 10 iterations, 10 s each
# Measurement: 10 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.ye.serialization.benchmark.KotlinxBenchmark.lightSampleBenchmark

# Run progress: 77.78% complete, ETA 00:06:41
# Fork: 1 of 1
# Warmup Iteration   1: 0.399 ms/op
# Warmup Iteration   2: 0.370 ms/op
# Warmup Iteration   3: 0.378 ms/op
# Warmup Iteration   4: 0.445 ms/op
# Warmup Iteration   5: 0.472 ms/op
# Warmup Iteration   6: 0.484 ms/op
# Warmup Iteration   7: 0.472 ms/op
# Warmup Iteration   8: 0.480 ms/op
# Warmup Iteration   9: 0.437 ms/op
# Warmup Iteration  10: 0.443 ms/op
Iteration   1: 0.441 ms/op
Iteration   2: 0.438 ms/op
Iteration   3: 0.448 ms/op
Iteration   4: 0.442 ms/op
Iteration   5: 0.448 ms/op
Iteration   6: 0.450 ms/op
Iteration   7: 0.443 ms/op
Iteration   8: 0.442 ms/op
Iteration   9: 0.452 ms/op
Iteration  10: 0.452 ms/op


Result "org.ye.serialization.benchmark.KotlinxBenchmark.lightSampleBenchmark":
0.446 ±(99.9%) 0.008 ms/op [Average]
(min, avg, max) = (0.438, 0.446, 0.452), stdev = 0.005
CI (99.9%): [0.438, 0.453] (assumes normal distribution)


# JMH version: 1.37
# VM version: JDK 21.0.2, OpenJDK 64-Bit Server VM, 21.0.2+13-LTS
# VM invoker: /home/ye34/.sdkman/candidates/java/21.0.2-amzn/bin/java
# VM options: -javaagent:/home/ye34/.local/share/JetBrains/Toolbox/apps/intellij-idea-community-edition/lib/idea_rt.jar=29845 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 10 iterations, 10 s each
# Measurement: 10 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.ye.serialization.benchmark.KotlinxBenchmark.mediumSampleBenchmark

# Run progress: 88.89% complete, ETA 00:03:20
# Fork: 1 of 1
# Warmup Iteration   1: 4.524 ms/op
# Warmup Iteration   2: 4.469 ms/op
# Warmup Iteration   3: 4.433 ms/op
# Warmup Iteration   4: 4.412 ms/op
# Warmup Iteration   5: 4.296 ms/op
# Warmup Iteration   6: 4.362 ms/op
# Warmup Iteration   7: 4.449 ms/op
# Warmup Iteration   8: 4.395 ms/op
# Warmup Iteration   9: 4.333 ms/op
# Warmup Iteration  10: 4.329 ms/op
Iteration   1: 4.176 ms/op
Iteration   2: 4.233 ms/op
Iteration   3: 4.237 ms/op
Iteration   4: 4.185 ms/op
Iteration   5: 4.245 ms/op
Iteration   6: 4.215 ms/op
Iteration   7: 4.255 ms/op
Iteration   8: 4.285 ms/op
Iteration   9: 4.216 ms/op
Iteration  10: 4.049 ms/op


Result "org.ye.serialization.benchmark.KotlinxBenchmark.mediumSampleBenchmark":
4.210 ±(99.9%) 0.098 ms/op [Average]
(min, avg, max) = (4.049, 4.210, 4.285), stdev = 0.065
CI (99.9%): [4.112, 4.308] (assumes normal distribution)


# Run complete. Total time: 00:30:07

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                               Mode  Cnt   Score   Error  Units
GsonBenchmark.heavySampleBenchmark      avgt   10  27.642 ± 0.590  ms/op
GsonBenchmark.lightSampleBenchmark      avgt   10   0.559 ± 0.010  ms/op
GsonBenchmark.mediumSampleBenchmark     avgt   10   5.482 ± 0.047  ms/op
JacksonBenchmark.heavySampleBenchmark   avgt   10  27.631 ± 2.096  ms/op
JacksonBenchmark.lightSampleBenchmark   avgt   10   0.428 ± 0.021  ms/op
JacksonBenchmark.mediumSampleBenchmark  avgt   10   5.354 ± 0.274  ms/op
KotlinxBenchmark.heavySampleBenchmark   avgt   10  19.877 ± 0.444  ms/op
KotlinxBenchmark.lightSampleBenchmark   avgt   10   0.446 ± 0.008  ms/op
KotlinxBenchmark.mediumSampleBenchmark  avgt   10   4.210 ± 0.098  ms/op

Process finished with exit code 0
```