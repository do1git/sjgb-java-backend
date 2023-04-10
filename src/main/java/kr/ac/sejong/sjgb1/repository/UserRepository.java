package kr.ac.sejong.sjgb1.repository;

import kr.ac.sejong.sjgb1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
}
