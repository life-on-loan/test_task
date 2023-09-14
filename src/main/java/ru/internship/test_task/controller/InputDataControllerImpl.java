package ru.internship.test_task.controller;


import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.internship.test_task.dto.InputDto;
import ru.internship.test_task.dto.OutputDto;
import ru.internship.test_task.service.InputDataServiceImpl;

import static org.slf4j.LoggerFactory.getLogger;


@RestController
public class InputDataControllerImpl implements InputDataController {
    private static final Logger LOGGER = getLogger(InputDataControllerImpl.class);
    private final InputDataServiceImpl inputDataServiceImpl;

    public InputDataControllerImpl(InputDataServiceImpl inputDataServiceImpl) {
        this.inputDataServiceImpl = inputDataServiceImpl;
    }

    @Override
    public ResponseEntity<OutputDto> count(InputDto str) {
        LOGGER.info("Get input: {}", str.getInput());
        final OutputDto output = inputDataServiceImpl.countLetters(str.getInput());
        return new ResponseEntity<>(output, HttpStatus.OK);
    }
}
