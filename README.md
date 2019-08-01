# perf-flamegraph-java

## Steps

1. Install `perf`
2. Install `flamegraph` <https://github.com/brendangregg/FlameGraph>
3. Install `perf-map-agent` <https://github.com/jvm-profiling-tools/perf-map-agent>
4. Run App.java
5. Run `perf-java-top <PID>`
5. Run `perf-java-flamegraph <PID>`