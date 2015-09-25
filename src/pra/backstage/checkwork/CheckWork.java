package pra.backstage.checkwork;


import java.util.*;

import pra.backstage.getmac.*;

public class CheckWork {

	String ip1 = "192.168.1.";
	int ip2 = 100;
	int ip2Max = 130;
	String MacDefualt = "a8-15-4d-d9-e2-ee";

	public CheckWork() {
		
	}
	
	public List<String> Check(){
		for (int i = ip2; i < ip2Max; i++) {
			List<String> res = new ArrayList<String>();
			String mac=GetMac.getMacAddress(ip1 + i);
			if(!mac.equals(MacDefualt)){
				
				res.add(mac);
			}
			
		}
		return null;
	}
	public static void main(String[] args) {
		new CheckWork();
	}
}
