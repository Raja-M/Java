package com.tgnews.tgnews.service.impl;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.tgnews.tgnews.entity.TgnContent;
import com.tgnews.tgnews.repository.TgnContentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.Optional;

public class TgnContentServiceImplTest {

    @Mock
    private TgnContentRepository tgnContentRepository;;

    @InjectMocks
    private TgnContentServiceImpl tgnContentServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    void testFetchContent(){
         Long contentID = 1L;

        TgnContent tgnContent = new TgnContent();

        tgnContent.setContentid(contentID);

       // when(tgnContentRepository.findById(contentID)).thenReturn(Mono.just(tgnContent));
       // when(Mockito.<Mono<TgnContent>>when(tgnContentRepository.findById(contentID)))
             //   .thenReturn((OngoingStubbing<Mono<TgnContent>>) Mono.just(tgnContent));

       // when(tgnContentRepository.findById(contentID)).thenReturn(tgnContent);


    }

}
