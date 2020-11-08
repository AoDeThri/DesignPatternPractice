package design.BusinessDelegate;

// entity services class
public class JMSService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service.");
    }
}
