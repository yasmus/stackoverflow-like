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
	static constraints = {
		email size: 5..15, blank: false, unique: true
	}
	public void create(User user){
		user.save()
	}
	
	
}