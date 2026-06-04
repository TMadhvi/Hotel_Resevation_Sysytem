package hotel.Controller;

import java.time.LocalDateTime;
import java.util.List;

import hotel.Dao.CustomerDao;
import hotel.Entity.Customer;
import hotel.Entity.Payment;
import hotel.View.CustomerView;

public class CustomerController {
		
		private CustomerDao dao;
		private CustomerView view;
		public CustomerController(CustomerDao dao, CustomerView view) {
			this.dao = dao;
			this.view = view;
		}
		
		public void run() {
			while(true) {
				int choice = view.showMenu();
				switch(choice) {
				
				//add
				case 1: {
					
				String firstName = view.getCustomerFirstName();
				String lastName = view.getCustomerLastName();
				String gender = view.getCustomerGender();
				System.out.println(gender);
				String phone = view.getCustomerPhone();
				String email = view.getCustomerEmail();
				String IdProofType = view.getCustomerIdProofType();
				String IdProofNumber = view.getCustomerIdProofNumber();
				String address = view.getCustomerAddress();
					
			Customer ct = new Customer(firstName,lastName,gender,phone,email,IdProofType,IdProofNumber,address);		
			System.out.println(ct);

		    int i = dao.addCustomer(ct);

		    System.out.println(i != 0 ? "Customer Added Successfully" : "Customer Not Added");

				}
			break;
						
				case 2 :{
					// update
					int customerId = view.getCustomerId();
					String firstName = view.getCustomerFirstName();
					String lastName = view.getCustomerLastName();
					String gender = view.getCustomerGender();
					String phone = view.getCustomerPhone();
					String email = view.getCustomerEmail();
					String IdProofType = view.getCustomerIdProofType();
					String IdProofNumber = view.getCustomerIdProofNumber();
					String address = view.getCustomerAddress();
		           
					
					Customer customer = new Customer(customerId,firstName,lastName,gender,phone,email,IdProofType,IdProofNumber,address);
					       

					boolean check = dao.updateCustomer(customer);

					if (check) {
					    System.out.println("Customert Updated Successfully");
					} else {
					    System.out.println("Something went wrong....");
					}
				}
				break;
				//delete
				case 3 :{
					
					int customerId = view.getCustomerId();
					if(dao.deleteCustomer(customerId)) {
						System.out.println("Customer Deleted Successfully...");
					}else {
						System.out.println("Something went wrong...");
					}
					break;
				}
				// READ ALL
					
				case 4: {
					
					List<Customer> list = dao. getUpdate();
					
					for (Customer customer : list) {
						
						System.out.println(customer);
					}
				}
				
				break;
				
				case 5:
					System.out.println("ThankYou.....");
					return;
					
				default:
					System.out.println("Invalid Choice");
					
				}
			
			}
		}		
			
		}
		