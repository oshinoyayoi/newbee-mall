package ltd.newbee.mall.newbeemall.service.impl;


import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.NewListMapper;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.service.NewListService;


@Service
public class NewListServiceImpl implements NewListService {

	@Resource
	NewListMapper newListMapper;

	// 抽取整个列表
	@Override
	public List<TbNewbeeMallGoodsInfo> getNewList() {
		List<TbNewbeeMallGoodsInfo> list = newListMapper.setNewList();
		return list;
	}

	public List<TbNewbeeMallGoodsInfo> getNewLists(Long goodsCategoryId) {
		List<TbNewbeeMallGoodsInfo> list = newListMapper.setNewLists(goodsCategoryId);
		return list;
	}

}
