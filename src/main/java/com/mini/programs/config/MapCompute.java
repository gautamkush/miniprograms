package com.mini.programs.config;

import java.util.HashMap;
import java.util.Map;

public class MapCompute {
public static void main(String[] args) {
	Map<Integer,String> strMap= new HashMap();
	strMap.put(1, "abc");
	strMap.put(2, "cde");
	strMap.put(3, "tgb");
	System.out.println();
	strMap.compute(Integer.valueOf(1), (k,v) -> v.concat("-abc"));
	System.out.println(strMap);
	for (Integer inte : strMap.keySet()) {
		strMap.compute(inte, (key,val) -> val.concat("-kush") );
	}
	System.out.println(strMap);
}
}
