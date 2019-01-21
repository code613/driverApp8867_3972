package com.example.user.driverapp8867_3972.model.model.backend;

import com.example.ben.android5778_3972_8867__01.model.datasource.Firebase_DBManager;


public class BackendFactory {

    static Backend DB = null;


    public static Backend getDB() {

//        return new List_DBManager();
        if (DB == null)
            //DB = new List_DBManager();
            DB= new Firebase_DBManager();


        return DB;
    }

    public static int t() {
        return 1;
    }
}