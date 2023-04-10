package kr.ac.sejong.sjgb1.service;

import kr.ac.sejong.sjgb1.domain.User;
import kr.ac.sejong.sjgb1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional @RequiredArgsConstructor
public class UserCreateService {

    final private UserRepository userRepository;


}
