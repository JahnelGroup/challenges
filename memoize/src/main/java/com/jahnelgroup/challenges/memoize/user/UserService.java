package com.jahnelgroup.challenges.memoize.user;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Provides an API to retrieve users from a data source.
 */
@Service
@RequiredArgsConstructor
public class UserService {

    @NonNull UserRepository userRepository;

    public User findById(Long id){
        return userRepository.findById(id);
    }

    public User findByName(String name){
        return userRepository.findByName(name);
    }

}
