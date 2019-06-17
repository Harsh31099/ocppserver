package ocpp.service;

import org.springframework.stereotype.Service;

import ocpp.essential.Status;

@Service
public class CancelReservationService {
	public Status.Reservation cancelReservation(int reservationId)
	{
		return Status.Reservation.Accepted;
	}
	
}
