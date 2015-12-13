package com.jiangjg.lib.ThingkingInJava.Th20;

@DBTable(name="MEMBER")
public class Member {
	@SQLString(value=30) String firstName;
	@SQLString(value=50) String lastName;
	@SQLInteger Integer age;
	@SQLString(value=30, constraints=@Constraints(primaryKey=true)) String handle;
	static int memberCount;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}
	public String toString(){
		return handle;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
