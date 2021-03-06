package cn.youcredit.thread.common.service.zmApi.request;

import java.util.Map;

import cn.youcredit.thread.common.service.zmApi.ZhimaRequest;
import cn.youcredit.thread.common.service.zmApi.internal.util.ZhimaHashMap;
import cn.youcredit.thread.common.service.zmApi.response.ZhimaCustomerBorrowScanResponse;

/**
 * ALIPAY API: zhima.customer.borrow.scan request
 * 
 * @author auto create
 * @since 1.0, 2016-07-18 16:38:23
 */
public class ZhimaCustomerBorrowScanRequest implements ZhimaRequest<ZhimaCustomerBorrowScanResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 
	 */
	private String goodsId;

	/** 
	* 
	 */
	private String productCode;

	/** 
	* 
	 */
	private String scenceCode;

	/** 
	* 
	 */
	private String shopCode;

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsId() {
		return this.goodsId;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return this.productCode;
	}

	public void setScenceCode(String scenceCode) {
		this.scenceCode = scenceCode;
	}
	public String getScenceCode() {
		return this.scenceCode;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	public String getShopCode() {
		return this.shopCode;
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
		return "zhima.customer.borrow.scan";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("goods_id", this.goodsId);
		txtParams.put("product_code", this.productCode);
		txtParams.put("scence_code", this.scenceCode);
		txtParams.put("shop_code", this.shopCode);
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

	public Class<ZhimaCustomerBorrowScanResponse> getResponseClass() {
		return ZhimaCustomerBorrowScanResponse.class;
	}
}
