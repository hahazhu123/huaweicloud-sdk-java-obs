/**
 * Copyright 2019 Huawei Technologies Co.,Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.obs.services.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReadAheadResult extends HeaderResponse {
	@JsonProperty(value = "bucket")
	private String bucketName;

	@JsonProperty(value = "prefix")
	private String prefix;
    
    @JsonProperty(value = "taskID")
	private String taskId;
    
    public ReadAheadResult() {
    	
    }
    
    public ReadAheadResult(String bucketName, String prefix, String taskId) {
    	this.bucketName = bucketName;
    	this.prefix = prefix;
    	this.taskId = taskId;
    }
    
    public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	@Override
	public String toString() {
		return "ReadAheadResult [bucketName=" + bucketName + ", prefix=" + prefix 
				+", taskId=" + taskId +  "]";
	}
}
