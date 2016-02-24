package com.dls.common;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.UnknownHandler;
import com.opensymphony.xwork2.XWorkException;
import com.opensymphony.xwork2.config.entities.ActionConfig;

public class MyUnknownHandler implements UnknownHandler{

	@Override
	public ActionConfig handleUnknownAction(String arg0, String arg1)
			throws XWorkException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object handleUnknownActionMethod(Object arg0, String arg1)
			throws NoSuchMethodException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result handleUnknownResult(ActionContext arg0, String arg1,
			ActionConfig arg2, String arg3) throws XWorkException {
		// TODO Auto-generated method stub
		return null;
	}

}
