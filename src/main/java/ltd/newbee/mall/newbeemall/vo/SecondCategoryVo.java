package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

public class SecondCategoryVo {
   private List<SubECGoodsCategoryVo> countAndParentId;
   
   private List<SkuCategoryVo> voList;
   
   private Integer countCategoryNumsInteger;

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
   
}
