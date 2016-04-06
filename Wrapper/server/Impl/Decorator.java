package server.Impl;

import server.Component;

public class Decorator implements Component {
	private Component component;
	
    public Decorator(Component component){
        this.component = component;
    }
    
	@Override
	public void dosomting() {
	    // 委派给构件
		component.dosomting();

	}

}
