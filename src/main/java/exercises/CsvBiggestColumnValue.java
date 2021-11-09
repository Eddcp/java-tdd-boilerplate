package exercises;

import java.util.*;
import java.util.stream.Collectors;

public class CsvBiggestColumnValue {
    public int solution(String S, String C) {
        String[] lines = S.split("\n");
        String[] headers = lines[0].split(",");
        Map<String, List<String>> columns = new HashMap<>();

        for (String header : headers) {
            columns.put(header, new ArrayList<>());
        }

        //Improve exceptions and base cases
        //TODO O(N^2) PERFORMANCE -> NEEDS TO IMPROVE IT
        for (int i=1; i <lines.length; i++) {
            List<String> values = new ArrayList<>(Arrays.asList(lines[i].split(",")));
            if (values.size() == headers.length) {
                for(int j=0; j < values.size(); j++) {
                    var list = columns.get(headers[j]);
                    list.add(values.get(j));
                    columns.put(headers[j], list);
                }
            }
        }
        var column = columns.get(C);
        var listInteger = column.stream().map(Integer::parseInt).sorted().collect(Collectors.toList());

        var lastIndex = !listInteger.isEmpty() ? listInteger.size() - 1 : null;
        return Objects.nonNull(lastIndex) ? listInteger.get(lastIndex) : -1;
    }
}
