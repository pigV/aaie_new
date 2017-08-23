package com.persistence.model;

/**
 * 一经接口ETL过程监控
 */
public class EtlProgress {

	private String jobId; // 任务ID
	private String jobName;// 任务名称
	private String runFreq;// 运行周期
	private String dateArgs;// 数据批次
	private String taskState;// 状态
	private String agentCode;// 调度任务
	private String execTime;// 执行时间
	private String endTime;// 结束时间
	private String useTime;// 运行时长

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getRunFreq() {
		return runFreq;
	}

	public void setRunFreq(String runFreq) {
		this.runFreq = runFreq;
	}

	public String getDateArgs() {
		return dateArgs;
	}

	public void setDateArgs(String dateArgs) {
		this.dateArgs = dateArgs;
	}

	public String getTaskState() {
		return taskState;
	}

	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getExecTime() {
		return execTime;
	}

	public void setExecTime(String execTime) {
		this.execTime = execTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

}
