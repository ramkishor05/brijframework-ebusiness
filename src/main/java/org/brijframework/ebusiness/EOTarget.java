package org.brijframework.ebusiness;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(Include.NON_EMPTY)
public class EOTarget {

	@JsonProperty("target_id")
	private String targetId;

	@JsonProperty("value")
	private String value;

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static void main(String[] args) {
		
		Map<String, List<EOTarget>> listMapper = new HashMap<String, List<EOTarget>>();
		
		List<EOTarget> titleList=new ArrayList<EOTarget>();
		EOTarget titleTarget=new EOTarget();
		titleTarget.setValue( "Test Notify" );
		titleList.add(titleTarget);
		
		listMapper.put( "title" , titleList );
		
		List<EOTarget> typeList=new ArrayList<EOTarget>();
		
		EOTarget typeTarget=new EOTarget();
		typeTarget.setTargetId( "Notification" );
		typeList.add(typeTarget);
		
		listMapper.put( "type" , typeList );
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			mapper.writeValueAsString(listMapper);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
