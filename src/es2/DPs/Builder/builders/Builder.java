package es2.DPs.Builder.builders;

import es2.DPs.Builder.cars.CarType;
import es2.DPs.Builder.components.Engine;
import es2.DPs.Builder.components.GPSNavigator;
import es2.DPs.Builder.components.Transmission;
import es2.DPs.Builder.components.TripComputer;

public interface Builder {

	void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
