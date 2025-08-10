package com.datastream.intellicore_api.service;

import com.datastream.intellicore_api.entity.User;
import com.datastream.intellicore_api.repository.userRespository;
import com.datastream.intellicore_api.util.MaskingId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    private userRespository userrespository;


//    private MaskingId maskingId;

    public User Storeuser(User user) {
        if (userrespository.findByEmail(user.getEmail()).isPresent()) {
            return null;
        }
        return userrespository.save(user);
    }
    public List<User> Getall() {
        List<User> users = userrespository.findAll();
        users.forEach(user -> {
            String id=user.getId();
            String alteid= MaskingId.MaskingIdUtility(id);
            user.setId(alteid);

        });
        return users;
    }
}

