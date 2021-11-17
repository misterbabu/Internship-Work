package com.student.ConvertJsonToMap;

import java.nio.file.Paths;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObectMapperMap {
	public static void main( String[] args )
	{
	try {
	    // create object mapper instance
	    ObjectMapper mapper = new ObjectMapper();

	    // convert JSON file to map
	    Map<?, ?> map = mapper.readValue(Paths.get("sample1.json").toFile(), Map.class);

	    // print map entries
	    for (Map.Entry<?, ?> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + "=" + entry.getValue());
	    }

	} catch (Exception ex) {
	    ex.printStackTrace();
	}

}
}