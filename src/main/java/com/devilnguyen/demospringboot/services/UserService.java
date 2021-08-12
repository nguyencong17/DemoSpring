package com.devilnguyen.demospringboot.services;

import com.devilnguyen.demospringboot.Helper.Helper;
import com.devilnguyen.demospringboot.model.Users;
import com.devilnguyen.demospringboot.repository.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserJpa userJpa;


    // doc du lieu dung pageable de phan trang
    public Page<Users> getUserList(Pageable pageable) {
        return userJpa.findAll(pageable);
    }

    public long total() {
        return userJpa.getTotalUser();
    }

//    public List<Users> getUserList(){
//        Iterable<Users> read =  userJpa.findAll();
//        List<Users> users = new ArrayList<>();
//        for (Users user: read) {
//            users.add(user);
//        }
//        return users;
//    }

    // SAVE DATA TO DB IN ADD_USER
    public boolean save(Users user) {
        try {
            user.setPassword(Helper.getMd5(user.getPassword()));
            userJpa.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return true;
    }

    // truy van db theo id
    public Users getUserById(Long id) {
        return userJpa.findById(id).get();
    }

    //xoa data theo id
    public boolean delete(Long id) {
        try {
            userJpa.deleteById(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
