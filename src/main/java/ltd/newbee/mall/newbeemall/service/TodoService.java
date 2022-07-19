package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.Todo;

public interface TodoService {
	List<Todo> getTodoList();
	List<Todo> insertTodoList(Map<String, Object> todo);
	List<Todo> chageStatus(int taskId);
	List<Todo> deleteTodoList(int taskId);
}
