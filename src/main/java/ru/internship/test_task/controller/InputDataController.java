package ru.internship.test_task.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.internship.test_task.dto.InputDto;
import ru.internship.test_task.dto.OutputDto;

import static ru.internship.test_task.ApiParams.STRING_COMPRESSOR_PATH;

public interface InputDataController {
    /**
     * Подсчет количества вхождений каждого символа в строку
     * @param input - входная строка
     * @return отсортированное по убыванию количества соотношение <символ> : <кол-во>
     */
    @PostMapping(STRING_COMPRESSOR_PATH)
    ResponseEntity<OutputDto> count (@RequestBody InputDto input);
}
