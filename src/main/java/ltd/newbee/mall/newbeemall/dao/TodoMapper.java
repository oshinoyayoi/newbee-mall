package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.Todo;

public interface TodoMapper {
	List<Todo> setAllTodoList();
	//增加
	int insertTodoList(Map<String, Object> todo);
    //找出最大的taskid，需要+1来新增task
	int findMaxTaskId();
	//修改status
	int chageStatus(Map<String, Object> status);
	//删除
	int deleteTodoList(int taskId);;
}
