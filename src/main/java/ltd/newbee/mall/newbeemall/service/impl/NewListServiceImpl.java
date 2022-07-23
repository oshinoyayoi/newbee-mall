package ltd.newbee.mall.newbeemall.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.NewListMapper;
import ltd.newbee.mall.newbeemall.dao.TodoMapper;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.entity.Todo;
import ltd.newbee.mall.newbeemall.service.NewListService;
import ltd.newbee.mall.newbeemall.service.TodoService;
import ltd.newbee.mall.newbeemall.vo.TodoVo;

@Service
public class NewListServiceImpl implements NewListService {

	@Resource
	NewListMapper newListMapper;
    
	//抽取整个列表
	@Override
	public List<TbNewbeeMallGoodsInfo> getNewList() {
		List<TbNewbeeMallGoodsInfo> list = newListMapper.setNewList();
		return list;
	}

}
