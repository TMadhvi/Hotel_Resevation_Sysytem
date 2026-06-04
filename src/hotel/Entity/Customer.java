package hotel.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
	  private int customerId;
	    private String firstName;
	    private String lastName;
	    private String gender;
	    private String phone;
	    private String email;
	    private String idProofType;
	    private String idProofNumber;
	    private String address;
		public Customer(String firstName, String lastName, String gender, String phone, String email,
				String idProofType, String idProofNumber, String address) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.phone = phone;
			this.email = email;
			this.idProofType = idProofType;
			this.idProofNumber = idProofNumber;
			this.address = address;
		}
	    
	    


}
