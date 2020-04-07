package com.bb.mvproomdb;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(version = 1, entities = {UserEntity.class})
abstract class UsersDB extends RoomDatabase {

 public abstract UserDAO getUserDAO();
}
