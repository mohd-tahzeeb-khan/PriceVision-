package com.datastream.intellicore_api.service;

import com.datastream.intellicore_api.entity.User;
import com.datastream.intellicore_api.repository.userRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class userService {
    @Autowired
    private userRespository userrespository;

    public User Storeuser(User user) {
        if (userrespository.findByEmail(user.getEmail()).isPresent()) {
            return null;
        }
        return userrespository.save(user);
    }
}

