package cn.youcredit.thread.common.service.zmApi.response;

import cn.youcredit.thread.common.service.zmApi.ZhimaResponse;
import cn.youcredit.thread.common.service.zmApi.domain.TaxOweList;
import cn.youcredit.thread.common.service.zmApi.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.credit.ep.tax.owe.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-12 17:33:26
 */
public class ZhimaCreditEpTaxOweGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 7428499777883123917L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 欠税信息
	 */
	@ApiField("user_tax_owe_info")
	private TaxOweList userTaxOweInfo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setUserTaxOweInfo(TaxOweList userTaxOweInfo) {
		this.userTaxOweInfo = userTaxOweInfo;
	}
	public TaxOweList getUserTaxOweInfo( ) {
		return this.userTaxOweInfo;
	}

}
