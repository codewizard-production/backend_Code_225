package com.app.Code.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.Code.model.RoadsideAssistance;
import com.app.Code.model.Verfication;
import com.app.Code.model.Payment;
import com.app.Code.model.ServiceCrew;
import com.app.Code.model.Insurance;
import com.app.Code.model.ExtendBooking;
import com.app.Code.model.Booking;
import com.app.Code.model.RentalCompany;
import com.app.Code.model.ReturnBikeInspection;
import com.app.Code.model.Customer;
import com.app.Code.model.Bike;
import com.app.Code.model.ReturnRentedBike;
import com.app.Code.enums.IDTypes;
import com.app.Code.converter.IDTypesConverter;

@Entity(name = "CustomerExtendRental")
@Table(schema = "\"code\"", name = "\"CustomerExtendRental\"")
@Data
public class CustomerExtendRental{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CustomerID\"")
	private Integer customerID;

    
    @Column(name = "\"BookingID\"")
    private Integer bookingID;
 
}