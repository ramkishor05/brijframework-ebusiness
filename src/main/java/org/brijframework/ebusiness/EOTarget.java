package org.brijframework.ebusiness;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(Include.NON_EMPTY)
public class EOTarget {

	@JsonProperty("target_id")
	String targetId;

	@JsonProperty("value")
	String value;

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
		Map<String, List<EOTarget>> map=new HashMap<String, List<EOTarget>>();
		
		List<EOTarget> titlelist=new ArrayList<EOTarget>();
		EOTarget eoTitleTarget=new EOTarget();
		eoTitleTarget.setValue("test notify");
		titlelist.add(eoTitleTarget);
		map.put("title", titlelist);
		
		
		List<EOTarget> typelist=new ArrayList<EOTarget>();
		EOTarget eotypeTarget=new EOTarget();
		eotypeTarget.setTargetId("notification");
		typelist.add(eotypeTarget);
		map.put("type", typelist);
		
		ObjectMapper mapper=new ObjectMapper();
		try {
			String json=mapper.writeValueAsString(map);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			//e.printStackTrace();
		}
	}
	
	public void add(@RequestBody Map<String, List<EOTarget>> map) {
		
	}
}
