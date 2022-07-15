package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.TodoMapper;
import ltd.newbee.mall.newbeemall.entity.Todo;
import ltd.newbee.mall.newbeemall.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {

	@Resource
	TodoMapper todoMapper;

	@Override
	public List<Todo> getTodoList() {
		List<Todo> list = todoMapper.setAllTodoList();
		return list;
	}

}
