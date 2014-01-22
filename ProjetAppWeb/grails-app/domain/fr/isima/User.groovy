package fr.isima


class User {
	String email
	String password
	String name
	Date birthday
	//String about
	//String location
	//String website
	 List<Badge> badges
	
	public void create(User user){
		user.save()
	}
	
	
}