public class Lab {

    public static void main(String[] args){

        StopLight nycLight = new StopLight("red");
        Car pinto = new Car("Brownish", "Ford", 60.33);


        for(int i = 1; i<=30; i++) {
            if (nycLight.isRed()) {
                pinto.stop();
                nycLight.setLightColor("yellow");
            }
            else if (nycLight.isYellow()) {
                pinto.slow();
                nycLight.setLightColor("green");
            }
            else if (nycLight.isGreen()) {
                pinto.go();
                nycLight.setLightColor("red");
            }
        }
    }

    public static class StopLight{
        String mLightColor;

        /*public StopLight(){
            this.mlightColor=null;

        } */
        public StopLight(String lc){
            mLightColor = lc;
        }

        public boolean isRed(){
            if(mLightColor.equalsIgnoreCase("Red"))
                return true;
            else return false;
        }

        public boolean isYellow(){
            if(mLightColor.equalsIgnoreCase("Yellow"))
                return true;
            else return false;
        }

        public boolean isGreen(){
            if(mLightColor.equalsIgnoreCase("Green"))
                return true;
            else return false;
        }

        public void setLightColor(String color){
            mLightColor = color;
        }

    }

    public static class Car{
        String mColor, mBrand;
        double mTopSpeed;

        public Car(String color, String brand, double topspd ){
            mColor = color;
            mBrand = brand;
            mTopSpeed = topspd;
        }
        public void go(){System.out.println("Speed up!");}

        public void stop(){System.out.println("STOP!");}

        public void slow(){System.out.println("Slow down...");}

        /** Setters & Getters **/

        public void setColor(String color){
            mColor = color;
        }

        public String getColor(){
            return mColor;
        }

        public void setBrand(String brand){
            mBrand = brand;
        }

        public String getBrand(){
            return mBrand;
        }

        public void setTopSpeed(double topspeed){
            mTopSpeed = topspeed;
        }

        public double getTopSpeed(){
            return mTopSpeed;
        }
    }
}
