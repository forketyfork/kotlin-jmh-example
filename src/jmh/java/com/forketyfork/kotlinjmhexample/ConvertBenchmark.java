package com.forketyfork.kotlinjmhexample;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

import static com.forketyfork.kotlinjmhexample.ConvertKt.convertSet;
import static com.forketyfork.kotlinjmhexample.ConvertKt.convertString;

@State(Scope.Benchmark)
public class ConvertBenchmark {
    @Benchmark
    public void convertStringBench(Blackhole bh) {
        bh.consume(convertString("abcdefghijklmnopqrstuvwxyz"));
    }

    @Benchmark
    public void convertSetBench(Blackhole bh) {
        bh.consume(convertSet("abcdefghijklmnopqrstuvwxyz"));
    }
}