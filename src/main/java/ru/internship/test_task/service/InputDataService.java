package ru.internship.test_task.service;

import ru.internship.test_task.dto.OutputDto;

public interface InputDataService {
    /**
     * Подсчет количества вхождений каждого символа в строку
     * @param str - входная строка
     * @return количество вхождений для каждого символа
     */
    OutputDto countLetters (String str);
}
