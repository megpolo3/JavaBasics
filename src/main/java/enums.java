public class enums {

    enum Color{

        RED, WHITE,BLUE;

        private Color()
        {
            System.out.println("Constructor called for : " +
                    this.toString());
        }

        public void colorInfo()
        {
            System.out.println("Universal Color");
        }

    }

    //parametrized constructor
    enum TrafficSignal
    {
        // This will call enum constructor with one
        // String argument
        RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

        // declaring private variable for getting values
        private String action;

        // getter method
        public String getAction()
        {
            return this.action;
        }

        // enum constructor - cannot be public or protected
        private TrafficSignal(String action)
        {
            this.action = action;
        }
    }

    public static void main(String args[]){
        Color c = Color.RED;
        System.out.println(c);

        TrafficSignal[] signals = TrafficSignal.values();

        for (TrafficSignal signal : signals)
        {
            // use getter method to get the value
            System.out.println("name : " + signal.name() +
                    " action: " + signal.getAction() );
        }
    }

}
