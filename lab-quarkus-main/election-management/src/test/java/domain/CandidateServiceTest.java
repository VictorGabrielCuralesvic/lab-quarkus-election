package domain;

import infrastructure.repositories.SQLCandidateRepository;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import javax.inject.Inject;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@QuarkusTest
class CandidateServiceTest {

    @Inject
    CandidateService service;

    @InjectMocks
    CandidateRepository repository;

    @Test
    void save() {
        Candidate candidate = new Candidate("", Optional.empty(),"", "", "", Optional.empty(), Optional.empty());

        service.save(candidate);

        //verify(repository).save(candidate);
    }

}