package com.dollop.app.entity.payload.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminLeavesStatus {

	private Integer todayPresent;
	
	private Integer totalEmployees;
	
	private Integer plannedLeaves;
	
	private Integer totalAbsents;
	
	private Integer pendingRequests;
}
