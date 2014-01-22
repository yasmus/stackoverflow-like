package fr.isima




class UserService {

	public User getUser(String email,String password){
		
		return User.findByEmailAndPassword(email,password);
	}

	boolean connect(String email,String password){
		User user = getUser(email, password);
		
		if(user != null){
			if(!user.email.equals(null) && user.email.length() != 0){
			   
				return true
			}
			else{
				
				return false
			}
		}
		else{
			
			return false
		}
	}
}