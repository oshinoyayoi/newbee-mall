package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

public class CountSkuCategoryVo {


	private List<SkuCategoryVo> categoryVos;
	
	private Integer numberOfCategoryId;

	public Integer getnumberOfCategoryId() {
		return numberOfCategoryId;
	}

	public void setnumberOfCategoryId(Integer numberOfCategoryId) {
		this.numberOfCategoryId = numberOfCategoryId;
	}

	public List<SkuCategoryVo> getCategoryVos() {
		return categoryVos;

	}

	public void setCategoryVos(List<SkuCategoryVo> categoryVos) {
		this.categoryVos = categoryVos;
	}
	/*
	 * private List<SkuCategoryVo> subList;
	 * 
	 * public List<SkuCategoryVo> getSubList() { return subList; } public void
	 * setSubList(List<SkuCategoryVo> subList) { this.subList = subList; }
	 */
}
