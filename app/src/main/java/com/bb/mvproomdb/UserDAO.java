package com.bb.mvproomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface UserDAO {
    @Insert
    void addNewUser(UserEntity... newUser);

    @Delete
    void deleteUser(UserEntity deleteUser);

    @Query("SELECT * FROM Users WHERE userName = :userName AND userPassword = :password ")
    UserEntity loginSelect(String userName, String password);

    @Update
    void updateValue(UserEntity userEntity);
}
