package concert;

import org.springframework.stereotype.Component;

@Component
public class Sing implements Performance{

	@Override
	public void perform() {
		System.out.println("hehe");
	}

}
