package cn.youcredit.thread.common.service.zmApi.response;

import cn.youcredit.thread.common.service.zmApi.ZhimaResponse;
import cn.youcredit.thread.common.service.zmApi.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.merchant.enterprise.apply response.
 * 
 * @author auto create
 * @since 1.0, 2017-05-27 10:05:51
 */
public class ZhimaMerchantEnterpriseApplyResponse extends ZhimaResponse {

	private static final long serialVersionUID = 7752131119814745389L;

	/** 
	 * 二级商户标识
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
	}
	public String getLinkedMerchantId( ) {
		return this.linkedMerchantId;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

}
