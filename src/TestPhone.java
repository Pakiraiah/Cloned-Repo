
public class TestPhone {

	public static void main(String[] args) {
	
		Phone p = new Phone();
		MobilePhone m = new MobilePhone();
		SmartPhone s = new SmartPhone();
		
		p.call();
		p.voiceText();
		m.call();
		m.voiceText();
		m.roamfree();
		s.call();
	

	}

}
