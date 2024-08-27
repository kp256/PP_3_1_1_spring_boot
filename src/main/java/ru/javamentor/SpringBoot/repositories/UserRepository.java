package ru.javamentor.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javamentor.SpringBoot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
