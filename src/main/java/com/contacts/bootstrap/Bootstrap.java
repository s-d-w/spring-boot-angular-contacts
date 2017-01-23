package com.contacts.bootstrap;

import org.springframework.core.Ordered;

public interface Bootstrap extends Ordered {
    void bootstrap();
}

