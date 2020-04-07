package com.bb.mvproomdb;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.bb.mvproomdb.Presenter.Contract.Contract;
import com.bb.mvproomdb.Presenter.Contract.RoomPresenter;

public class MainActivity extends AppCompatActivity implements Contract {

    private UsersDB usersDB;
    private RoomPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new RoomPresenter(this);
        usersDB = Room.databaseBuilder(this,
               UsersDB.class, "database-name")
                .allowMainThreadQueries()
                .build();
//        usersDB.getUserDao().addNewUser(new UserEntity("Dalo", "happyPancake"));

        UserEntity userEntity = usersDB.getUserDAO().loginSelect("Dalo", "happyPancake");

        if(userEntity == null)
            Log.d("TAG_X", "User does not exist");
        else
            Log.d("TAG_X", "Login success");


    }

    @Override
    public void loginUser(String userName, String password) {

    }

    @Override
    public void signOutUser() {

    }

    @Override
    public UserEntity getUserInstance() {
        return null;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
