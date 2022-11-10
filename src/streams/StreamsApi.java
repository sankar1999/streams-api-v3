package streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class StreamsApi {

    public static void main(String[] args) {

        System.out.println(atomicBreak());
    }

    public static boolean atomicBreak() {

        List<String> countries = Arrays.asList("India", "America", "Dubai");

        AtomicBoolean breakFound = new AtomicBoolean(false);

        AtomicInteger countryMatchCount = new AtomicInteger();

        countries.stream()
                .filter(country -> country.endsWith("i"))
                .forEach(country -> countryMatchCount.getAndIncrement());
        System.out.println(countryMatchCount.incrementAndGet());
        return !breakFound.get();

    }


}
