package Strategy;


public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stubd
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());//changing bevaior on the go 
		//using setters.
		model.performFly();
	}

}
