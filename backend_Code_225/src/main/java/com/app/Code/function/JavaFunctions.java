package com.app.Code.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.Code.repository.VerficationRepository;
import com.app.Code.repository.PaymentRepository;
import com.app.Code.repository.CustomerRepository;
import com.app.Code.repository.InsuranceRepository;
import com.app.Code.repository.ServiceCrewRepository;
import com.app.Code.repository.ReturnRentedBikeRepository;
import com.app.Code.repository.BookingRepository;
import com.app.Code.repository.RoadsideAssistanceRepository;
import com.app.Code.repository.ExtendBookingRepository;
import com.app.Code.repository.RentalCompanyRepository;
import com.app.Code.repository.ReturnBikeInspectionRepository;
import com.app.Code.repository.BikeRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
