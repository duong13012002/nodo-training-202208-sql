package com.example.nodo_training_webservice_10.impl;

import com.example.nodo_training_webservice_10.dao.UserDAO;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

@Component("userDAO")
public class UserDAOimpl implements UserDAO {
    private final static Logger LOGGER = Logger.getLogger(HomeController.class);
}
