package Controllers;


import java.util.ArrayList;

import Models.User;
import Views.UserView;

public class UserController {
	private UserView view;
	private User model;
	
	public UserController(){
		
		view = new UserView();
		model = new User();
	}
	
	public void showUser() {
		ArrayList<User> users = model.get();
		view.userCont(users);
	}
}
