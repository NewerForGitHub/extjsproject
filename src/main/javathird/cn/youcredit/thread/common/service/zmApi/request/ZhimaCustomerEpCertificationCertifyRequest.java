package cn.youcredit.thread.common.service.zmApi.request;

import java.util.Map;

import cn.youcredit.thread.common.service.zmApi.ZhimaRequest;
import cn.youcredit.thread.common.service.zmApi.internal.util.ZhimaHashMap;
import cn.youcredit.thread.common.service.zmApi.response.ZhimaCustomerEpCertificationCertifyResponse;

/**
 * ALIPAY API: zhima.customer.ep.certification.certify request
 * 
 * @author auto create
 * @since 1.0, 2017-07-27 20:19:48
 */
public class ZhimaCustomerEpCertificationCertifyRequest implements ZhimaRequest<ZhimaCustomerEpCertificationCertifyResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 一次认证的唯一标识，在完成芝麻认证初始化后可以获取
	 */
	private String bizNo;

	/** 
	* 商户回调地址，在用户完成认证后会调转回商户地址
	 */
	private String returnUrl;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo() {
		return this.bizNo;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	public String getReturnUrl() {
		return this.returnUrl;
	}
	private String channel;
	private String platform;	
	private String scene;
	private String extParams;

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setChannel(String channel){
		this.channel=channel;
	}

    public String getChannel(){
    	return this.channel;
    }

	public void setPlatform(String platform){
		this.platform=platform;
	}

    public String getPlatform(){
    	return this.platform;
    }
    
    public void setScene(String scene){
		this.scene=scene;
	}

    public String getScene(){
    	return this.scene;
    }
    
    public void setExtParams(String extParams){
		this.extParams=extParams;
	}

    public String getExtParams(){
    	return this.extParams;
    }
    
	public String getApiMethodName() {
		return "zhima.customer.ep.certification.certify";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("biz_no", this.bizNo);
		txtParams.put("return_url", this.returnUrl);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new ZhimaHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<ZhimaCustomerEpCertificationCertifyResponse> getResponseClass() {
		return ZhimaCustomerEpCertificationCertifyResponse.class;
	}
}
