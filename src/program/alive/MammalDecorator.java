//package program.alive;
//
//import program.inanimate.Route;
//
//public abstract class MammalDecorator implements Mammal {
//    protected Mammal mammal;
//    protected Route route;
//    protected String name;
//    public MammalDecorator(Mammal mammal, String name) {
//        this.mammal = mammal;
//        this.route = new Route();
//        this.name = name;
//
//    }
//    public String getPreviousLocation(){
//        return this.name + " дошёл до " + this.route.getPreviousLocation().getLocation();
//    }
//
//    public String getCurrentLocation(){
//        return this.name + " идёт по " + this.route.getCurrentLocation().getLocation();
//    }
//    public void go(){
//        this.route.go();
//    }
//}
