package domain;

import infrastructure.repositories.SQLCandidateRepository;
import io.quarkus.test.junit.QuarkusTest;
import org.instancio.Instancio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.inject.Inject;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@QuarkusTest
class CandidateServiceTest {

    @InjectMocks
    CandidateService service;

    @Mock
    CandidateRepository repository;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void save() {
        Candidate candidate = Instancio.create(Candidate.class);

        service.save(candidate);

        verify(repository).save(candidate);
        verifyNoMoreInteractions(repository);
    }

    @Test
    void findAll() {
        service.findAll();

        verify(repository).findAll();
        verifyNoMoreInteractions(repository);
    }


}