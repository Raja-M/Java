package com.tgnews.tgnews;

import com.tgnews.tgnews.repository.TgnContentRepository;
import com.tgnews.tgnews.service.impl.TgnContentServiceImpl;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class TgnContentServiceTest {

    @Mock
    private TgnContentRepository tgnContentRepository;

    @InjectMocks
    private TgnContentServiceImpl tgnContentServiceImpl;

}
