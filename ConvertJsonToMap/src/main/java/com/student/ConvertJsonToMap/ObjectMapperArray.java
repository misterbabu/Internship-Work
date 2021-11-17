package com.student.ConvertJsonToMap;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperArray {
	public static void main( String[] args )
	{
		try {
			
			byte[] mapData = Files.readAllBytes(Paths.get("sample.json"));

			ObjectMapper objectMapper=new ObjectMapper(); 
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);    

			List<Map<String, Object>> myObjects = 
			          objectMapper.readValue(mapData , new TypeReference<List<Map<String, Object>>>(){});
	        myObjects.stream().flatMap(m->m.entrySet().stream()).forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));
			
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
	}



}
