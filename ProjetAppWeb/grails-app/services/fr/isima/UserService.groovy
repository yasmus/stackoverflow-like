package fr.isima




class UserService {

	public User getUser(String email,String password){
		
		return User.findByEmailAndPassword(email,password);
	}

	boolean connect(String email,String password){
		User user = getUser(email, password);
		println();
		if(user != null){
			println("true");
			return true
		}
		else{
			println("false");
			return false
		}
	}
}