package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.Todo;

public interface TodoService {
	List<Todo> getTodoList();
	int insertTodoList(Map<String, Object> todo);
	int chageStatus(Map<String, Object> status);
	int deleteTodoList(Map<String, Object> delete);
}
