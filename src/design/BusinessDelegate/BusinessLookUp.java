package design.BusinessDelegate;

/**
 * LookUp Service
 * responsible for acquiring relevant business implementations
 * provide business object access to business representative objects.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
