package com.student.ConvertJsonToMap;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ObjectMapperDemo {
	public static void main( String[] args )
	{
		try {
		    // create object mapper instance
		    //ObjectMapper mapper = new ObjectMapper();

		    // convert JSON array to list of books
		    //List<Student> books = Arrays.asList(mapper.readValue(Paths.get("sample.json").toFile(), Student[].class));
			
			byte[] mapData = Files.readAllBytes(Paths.get("sample.json"));

			ObjectMapper objectMapper=new ObjectMapper(); 
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);    

			List<Map<String, Object>> myObjects = 
			          objectMapper.readValue(mapData , new TypeReference<List<Map<String, Object>>>(){});
	        myObjects.stream().flatMap(m->m.entrySet().stream()).forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));
			
		    // print books
		    /*myObjects.forEach(System.out::println);*/

		} catch (Exception ex) {
		    ex.printStackTrace();
		}
	}

}
