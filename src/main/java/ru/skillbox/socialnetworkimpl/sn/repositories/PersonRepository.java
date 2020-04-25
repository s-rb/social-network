package ru.skillbox.socialnetworkimpl.sn.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import ru.skillbox.socialnetworkimpl.sn.domain.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
}
