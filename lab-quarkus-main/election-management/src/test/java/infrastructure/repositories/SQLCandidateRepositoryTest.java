//package infrastructure.repositories;

import domain.CandidateRepository;
import domain.CandidateRepositoryTest;
import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.AfterEach;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

//@QuarkusTest
//class SQLCandidateRepositoryTest extends CandidateRepositoryTest {

//    @Inject
//    SQLCandidateRepository repository;

//    @Inject
//    EntityManager entityManager;

//    @Override
//    public CandidateRepository repository() {
//        return repository;
//    }

//    @AfterEach
//    @TestTransaction
//    void tearDowm() {
//        entityManager.createNativeQuery("TRUNCATE TABLE Candidates").executeUpdate();
//    }
//}