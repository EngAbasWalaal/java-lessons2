class trafficLight{
    public class TrafficLight{
        private String color;
        private int duration;
        public TraficLight(String color, int duration){
            this.color=color;
            this.duration=duration;

        }
        public void changeColor(String color){
             this.color=color;

        }
        public String getColor(){
            return this.color;
        }
    }
    public static void main(String[] args){
        TrafficLight traffic=new TrafficLight("red", 30);

        //change the traffic light to green
        traffic.changeColor("green");

        //get the current light of traffic color
        String currentColor=traffic.getColor();
        System.out.println("The current color of traffic light is "+currentColor);
    }
}