package org.example.repository;

import org.example.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface BankRepository extends JpaRepository<BankAccount, Long> {

    BankAccount findByName(@PathVariable("name") String name);
}
