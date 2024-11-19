import java.util.List;

public class  Group { 
  
  List<User> users;  
  List<Expense> expenses ;
  String id ; 
  String name ; 
public Group(List<User> users, String id , String name) {
	//super();
	this.users = users;
	this.id = id ; 
	this.name = name ; 
}
public List<User> getUsers() {
	return users;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void setUsers(List<User> users) {
	this.users = users;
}
public List<Expense> getExpenses() {
	return expenses;
}
public void setExpenses(List<Expense> expenses) {
	this.expenses = expenses;
} 
  
   
}