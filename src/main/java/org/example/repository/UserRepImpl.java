package org.example.repository;

import org.example.user.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepImpl implements UserRep{
    private static int counter = 1;
    private Map<Integer, User> users = new HashMap<>();

    @Override
    public int saveUser(User user) {
        int userID = counter;
        user.setID(userID);
        users.put(userID, user);
        counter++;
        return userID;
    }
}
