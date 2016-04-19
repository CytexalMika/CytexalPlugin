package com.cytexal.log;

import java.util.Map;
import java.util.Map.Entry;

public class ContainsFilter implements Filter{
	String tx;
	
	public ContainsFilter(String t) {
		tx=t;
	}

	@Override
	public boolean filter(String text) {
		if(text.contains(text))
			return true;
		else 
			return false;
	}

}
