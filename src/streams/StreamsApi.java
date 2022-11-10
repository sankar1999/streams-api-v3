package streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StreamsApi {

    public static void main(String[] args) {

        List<String> countries = Arrays.asList("India", "America", "Dubai");

        AtomicInteger countryMatchCount = new AtomicInteger();

        countries.stream()
                .filter(country -> country.endsWith("a"))
                .forEach(country -> countryMatchCount.getAndIncrement());

        System.out.println(countryMatchCount.get());
    }


}
