package cn.youcredit.thread.common.service.zmApi.response;

import cn.youcredit.thread.common.service.zmApi.ZhimaResponse;
import cn.youcredit.thread.common.service.zmApi.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.merchant.single.data.upload response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-10 21:31:09
 */
public class ZhimaMerchantSingleDataUploadResponse extends ZhimaResponse {

	private static final long serialVersionUID = 3186941718583914373L;

	/** 
	 * 公用回传参数，这个字段由商户传入，系统透传给商户
	 */
	@ApiField("biz_ext_params")
	private String bizExtParams;

	/** 
	 * 每次上传都会生成一个任务号
	 */
	@ApiField("task_id")
	private String taskId;

	public void setBizExtParams(String bizExtParams) {
		this.bizExtParams = bizExtParams;
	}
	public String getBizExtParams( ) {
		return this.bizExtParams;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
