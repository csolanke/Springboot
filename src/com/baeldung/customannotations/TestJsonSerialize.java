package com.baeldung.customannotations;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJsonSerialize {
	
	@Test
	public void givenObjectSerializedThenTrueReturned() throws JsonSerializationException {
	    Person person = new Person("soufiane", "cheouati", "34");
	    ObjectToJsonConverter serializer = new ObjectToJsonConverter();
	    String jsonString = serializer.convertToJson(person);
	    
	    assertEquals(
	      "{\"firstName\":\"Soufiane\",\"lastName\":\"Cheouati\",\"age\":\"34\"}",
	      jsonString);
	}

}
