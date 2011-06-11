package data;

import Entity.User;

public interface IUserDataBase {
	
	public boolean insert(User user);
	
	public boolean update(User user);
		
	public User getByIdentifier(String identifier);
	
	public User getNext();


}
