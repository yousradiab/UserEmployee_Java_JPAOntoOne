package org.example.useremployee.repository;

import org.example.useremployee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//vil have et Interface der nedarver fra User. I koden bliver der brugt typen User og Integer, som er typen på primary key.
public interface UserRepository extends JpaRepository <User, Integer> {
}
