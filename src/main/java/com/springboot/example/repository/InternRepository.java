package com.springboot.example.repository;


import com.springboot.example.entity.Intership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InternRepository extends JpaRepository<Intership, Integer> {

    Optional<Intership> getIntershipByEmail(String email);

    Optional<Intership> getIntershipByPhone(String phone);

    Optional<Intership> getIntershipByAddress(String address);

    Optional<Intership> getIntershipByCity(String city);

    Optional<Intership> getIntershipByName(String name);


}
