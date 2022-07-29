package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

public class SecondCategoryVo {
	private List<SubECGoodsCategoryVo> countAndParentId;

	private List<SkuCategoryVo> voList;

	private Integer countCategoryNumsInteger;

	private List<SkuCategoryVo> countSubCategory;

	private List<SubCategoryVo> colNameAndCountCol;

	private List<SkuCategoryVo> thirdLevelList;
	
	

	public List<SubECGoodsCategoryVo> getCountAndParentId() {
		return countAndParentId;
	}

	public void setCountAndParentId(List<SubECGoodsCategoryVo> countAndParentId) {
		this.countAndParentId = countAndParentId;
	}

	public List<SkuCategoryVo> getVoList() {
		return voList;
	}

	public void setVoList(List<SkuCategoryVo> voList) {
		this.voList = voList;
	}

	public Integer getCountCategoryNumsInteger() {
		return countCategoryNumsInteger;
	}

	public void setCountCategoryNumsInteger(Integer countCategoryNumsInteger) {
		this.countCategoryNumsInteger = countCategoryNumsInteger;
	}

	public List<SubCategoryVo> getColNameAndCountCol() {
		return colNameAndCountCol;
	}

	public void setColNameAndCountCol(List<SubCategoryVo> colNameAndCountCol) {
		this.colNameAndCountCol = colNameAndCountCol;
	}


	public List<SkuCategoryVo> getCountSubCategory() {
		return countSubCategory;
	}

	public void setCountSubCategory(List<SkuCategoryVo> countSubCategory) {
		this.countSubCategory = countSubCategory;
	}

	public List<SkuCategoryVo> getThirdLevelList() {
		return thirdLevelList;
	}

	public void setThirdLevelList(List<SkuCategoryVo> thirdLevelList) {
		this.thirdLevelList = thirdLevelList;
	}

	

	

}
