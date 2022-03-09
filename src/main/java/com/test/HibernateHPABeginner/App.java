package com.test.HibernateHPABeginner;

import com.test.controllers.CreateUser;

public class App {
    public static void main(String[] args) {
        CreateUser c = new CreateUser();
        c.populateDB();
    }
}
