/**
 * Copyright &copy; 2015-2020 <a href="http://www.hleast.com/">hleast</a> All rights reserved.
 */
package com.hlframe.modules.dc.task.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

import com.hlframe.common.persistence.DataEntity;
import com.hlframe.common.utils.excel.annotation.ExcelField;

/**
 * 调度子任务执行情况Entity
 * @author hladmin
 * @version 2016-11-27
 */
public class DcTaskLogRun extends DataEntity<DcTaskLogRun> {
	
	private static final long serialVersionUID = 1L;
	private String taskid;		// 调度主键
	private String runid;		// 调度任务主键
	private Date startdate;		// 开始时间
	private Date enddate;		// 结束时间
	private String status;		// 状态
	
	public DcTaskLogRun() {
		super();
	}

	public DcTaskLogRun(String id){
		super(id);
	}

	@ExcelField(title="调度主键", align=2, sort=1)
	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	
	@ExcelField(title="调度任务主键", align=2, sort=2)
	public String getRunid() {
		return runid;
	}

	public void setRunid(String runid) {
		this.runid = runid;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="开始时间不能为空")
	@ExcelField(title="开始时间", align=2, sort=3)
	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="结束时间不能为空")
	@ExcelField(title="结束时间", align=2, sort=4)
	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	@ExcelField(title="状态", align=2, sort=5)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}