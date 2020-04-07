package com.bb.mvproomdb.Presenter.Contract;

import androidx.room.Room;

import com.bb.mvproomdb.MainActivity;
import com.bb.mvproomdb.UserEntity;
import com.bb.mvproomdb.UsersDB;

public class RoomPresenter {

        private Contract.View mainView;
        private UsersDB userDB;
        private UserEntity currentUser = null;

        public RoomPresenter(MainActivity mainView){
            this.mainView = mainView;

            userDB = Room
                    .databaseBuilder((MainActivity)mainView).getApplicationContext(),
                        UsersDB.class,
                        "users.db")
                        .allowMainThreadQueries()
                        .build();
            )
        }
        public void loginUser(String userName, String password){
            currentUser = usersDB.getUserDAO().loginSelect(userName, password);
            if(currentUser = null)
                mainView.userLoginFailed();
            else
                mainView.userLoginSuccess();
        }
        public void signOutUser(){
            currentUser = null;
            mainView.userLoggedOut();
        }

        public UserEntity getUserInstance(){
            return currentUser;
        }
        public void getGitResults(){
            //TODO: MAKE API CALL TO GIT
        }

        public void signInUser(){}
}