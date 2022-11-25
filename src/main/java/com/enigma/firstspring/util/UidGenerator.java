package com.enigma.firstspring.util;

import java.util.UUID;

public class UidGenerator implements IRandomStringGenerator{
    @Override
    public String random() {
        return UUID.randomUUID().toString();
    }
}
