package io.hedwig.jrefactoring.extractFactoryClass;

/**
 * Created by patrick on 15/10/29.
 */
public class PolicyCarController {

    public static PolicyCar create(String serviceRequired
            ,String mileAge){
        return new PolicyCar(serviceRequired,mileAge);
    }

    public static class PolicyCar{
        private String serviceRequired;
        private String mileAge;

        public PolicyCar(String serviceRequired, String mileAge) {
            this.serviceRequired = serviceRequired;
            this.mileAge = mileAge;
        }

        public String getServiceRequired() {
            return serviceRequired;
        }

        public void setServiceRequired(String serviceRequired) {
            this.serviceRequired = serviceRequired;
        }

        public String getMileAge() {
            return mileAge;
        }

        public void setMileAge(String mileAge) {
            this.mileAge = mileAge;
        }
    }
}
