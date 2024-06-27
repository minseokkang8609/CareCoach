package com.carecoach.controller;


import com.carecoach.controller.action.*;
import com.carecoach.controller.action.LoginAction;

public class ActionFactory {

	private static ActionFactory instance = new ActionFactory();
	
	public ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory: " + command);
		//여기서부터 명령어에 해당되는 클래스들의 객체를 생성하여 action에 담습니다. 
		
		if(command == null || command.equals("index")) {
			action = new IndexAction();
		}else if(command.equals("login_form")) {
			action = new LoginFormAction();
		}else if(command.equals("login")) {
			action = new LoginAction();
		}
		
		return action;
	}
	
	
}

