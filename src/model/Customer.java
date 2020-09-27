package model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Customer {
	
	private String id;
	private String password;
	private String name;
	private String gender;
	private String email;

	public Customer() { super(); }

}
