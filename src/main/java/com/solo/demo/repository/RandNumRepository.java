package com.solo.demo.repository;

import com.solo.demo.entity.RandNumMessage;
import org.springframework.stereotype.Component;


@Component
public class RandNumRepository {

    public RandNumMessage getRandom() {
        return new RandNumMessage();
    }
}
