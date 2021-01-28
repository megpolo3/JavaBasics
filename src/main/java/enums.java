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

    public static void main(String args[]){
        Color c = Color.RED;
        System.out.println(c);
    }

}
