package hotel.Controller;

import java.time.LocalDateTime;
import java.util.List;

import hotel.Dao.PaymentDao;
import hotel.Entity.Payment;
import hotel.Entity.Room;
import hotel.View.PaymentView;

public class PaymentController {
	
	private PaymentDao dao;
	private PaymentView view;
	public PaymentController(PaymentDao dao, PaymentView view) {
		this.dao = dao;
		this.view = view;
	}
	
	public void run() {
        while (true) {
      	int choice = view.showMenu();

		switch (choice) {

		// ADD
		case 1: {

			int bookingId = view.getBookingId();
			double paymentAmount = view.getPaymentAmount();
			String paymentMode = view.getPaymentMode();
			String transcationId = view.getTranscationId();
			String paymentStatus = view.getPaymentStatus();
			LocalDateTime paymentDate = view.getPaymentDate();
			
			Payment pm = new Payment( bookingId, paymentAmount,  paymentMode,transcationId, paymentStatus, paymentDate);			
			
			System.out.println(pm);


		    int i = dao.addPayment(pm);
			}
			break;
		
		case 2: {    // update
			int paymentId = view.getPaymentId();
            int bookingId = view.getBookingId();
			double paymentamount = view.getPaymentAmount();
			String paymentmode = view.getPaymentMode();
			String transcationid = view.getTranscationId();
			String paymentStatus = view.getPaymentStatus();
			LocalDateTime paymentDate = view.getPaymentDate();
			
			Payment payment = new Payment(
			        bookingId,
			        paymentamount,
			        paymentmode,
			        transcationid,
			        paymentStatus,
			        paymentDate
			);

			payment.setPaymentId(paymentId);

			boolean check = dao.updatePayment(payment);

			if (check) {
			    System.out.println("Payment Updated Successfully");
			} else {
			    System.out.println("Something went wrong....");
			}
		}
		break;
		//delete
		case 3 :{
			
			int paymentId = view.getPaymentId();
			if(dao.deletePayment(paymentId)) {
				System.out.println("Payment Deleted Successfully...");
			}else {
				System.out.println("Something went wrong...");
			}
			break;
		}
		// READ ALL
			
		case 4: {
			
			List<Payment> list = dao. getUpdate();
			
			for (Payment payment : list) {
				
				System.out.println(payment);
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

