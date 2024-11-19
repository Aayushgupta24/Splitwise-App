public class Split { 
     
     String id  ; 
    double amount ; 
    User user ;
	public Split(String id, double amount, User user) {
		super();
		this.id = id;
		this.amount = amount;
		this.user = user;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	} 
  

  


}