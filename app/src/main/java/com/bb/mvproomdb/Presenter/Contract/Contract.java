package com.bb.mvproomdb.Presenter.Contract;

import com.bb.mvproomdb.UserEntity;

public interface Contract{

        void loginUser(String userName, String password);
        void signOutUser();
        UserEntity getUserInstance();
    }
    public interface View{
        void UserLoginSucess();
        void UserLoginFailed();
        void UserLoggedOut();
        void NotLoggedInMessage();
        void displayResults(/*TODO)
    }
});