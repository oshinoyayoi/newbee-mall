package ltd.newbee.mall.newbeemall.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.TodoMapper;
import ltd.newbee.mall.newbeemall.entity.Todo;
import ltd.newbee.mall.newbeemall.service.TodoService;
import ltd.newbee.mall.newbeemall.vo.TodoVo;

@Service
public class TodoServiceImpl implements TodoService {

	@Resource
	TodoMapper todoMapper;
    
	//抽取整个列表
	@Override
	public List<Todo> getTodoList() {
		List<Todo> list = todoMapper.setAllTodoList();
		return list;
	}
	//增加todo
	@Override
	public List<Todo> insertTodoList(Map<String, Object> todo) {
		int newTaskId=todoMapper.findMaxTaskId()+1;
		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		todo.replace("taskId", newTaskId);
		todoMapper.insertTodoList(todo);
		return todoMapper.setAllTodoList();
	}
	
	//修改完成状态（status）
	@Override 
	public List<Todo> chageStatus(Map<String, Object> status) {
		List<Todo> list=todoMapper.setAllTodoList();
		int taskId=0;
		int status1=1;
		for (int i = 0; i < list.size(); i++) {
			taskId=list.get(i).getTaskId();
			if (taskId==list.get(i).getTaskId()) {
				status1=0;
			} 
		}
		todoMapper.chageStatus(status);
		return todoMapper.setAllTodoList();
	}
	
	//删除taskId及其对应内容
	@Override
	public List<Todo> deleteTodoList(int taskId) {
		todoMapper.deleteTodoList(taskId);
		return todoMapper.setAllTodoList();
	}
}
