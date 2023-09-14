package ru.internship.test_task.service;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import ru.internship.test_task.dto.SymbolDto;
import ru.internship.test_task.dto.OutputDto;

import java.util.*;

import static org.slf4j.LoggerFactory.getLogger;


@Service
public class InputDataServiceImpl implements InputDataService {
    private static final Logger LOGGER = getLogger(InputDataServiceImpl.class);

    @Override
    public OutputDto countLetters(String str) {
        String curSymbol;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            curSymbol = String.valueOf(str.charAt(i));
            if (map.containsKey(curSymbol)) {
                map.put(curSymbol, map.get(curSymbol) + 1);
            } else {
                map.put(curSymbol, 1);
            }
        }
        LOGGER.info("Get result in map: {}", map);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        LOGGER.info("Get result in sortedMap: {}", sortedMap);

        List<SymbolDto> symbolDtoList = new ArrayList<>();
        for (String key : sortedMap.keySet()) {
            SymbolDto symbolDto = new SymbolDto();
            symbolDto.setSymbol(key);
            symbolDto.setAmount(sortedMap.get(key));
            symbolDtoList.add(symbolDto);
        }
        OutputDto outputDto = new OutputDto();
        outputDto.setResult(symbolDtoList);
        return outputDto;
    }
}
