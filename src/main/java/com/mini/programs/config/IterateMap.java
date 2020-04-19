package com.mini.programs.config;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {
public static void main(String[] args) {
	Map<Integer,String> strMap= new HashMap();
	strMap.put(1, "abc");
	strMap.put(2, "cde");
	strMap.put(3, "efg");
	strMap.put(4, "hji");
	strMap.forEach((k,v) -> {
		System.err.println("key "+k +" value "+v );
	});
}
}
