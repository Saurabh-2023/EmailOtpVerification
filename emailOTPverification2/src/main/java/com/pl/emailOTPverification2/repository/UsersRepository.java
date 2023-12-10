package com.pl.emailOTPverification2.repository;

import com.pl.emailOTPverification2.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long>
{

    Users findByEmail(String email);
}
