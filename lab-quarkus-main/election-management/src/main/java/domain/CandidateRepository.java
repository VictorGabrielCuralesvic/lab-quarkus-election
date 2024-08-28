package domain;

import javax.enterprise.context.ApplicationScoped;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@ApplicationScoped
public interface CandidateRepository {

    void save(List<Candidate> candidates);

    default void save(Candidate candidate) {
        save(List.of(candidate));
    }

    List<Candidate> findAll();

    //Optional<Candidate> findById(String id);
    List<Candidate> find(CandidateQuery query);

    default Optional<Candidate> findById(String id) {
        CandidateQuery query = new CandidateQuery.Builder().ids(Set.of(id)).build();
        return find(query).stream().findFirst();
    }
}
