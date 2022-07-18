package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Todo {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2641359+09:00", comments="Source field: todo.task_id")
    private Integer taskId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2651326+09:00", comments="Source field: todo.task")
    private String task;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2661301+09:00", comments="Source field: todo.date")
    private String date;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2661301+09:00", comments="Source field: todo.status")
    private Integer status;
    


    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2651326+09:00", comments="Source field: todo.task_id")
    public Integer getTaskId() {
        return taskId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2651326+09:00", comments="Source field: todo.task_id")
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2651326+09:00", comments="Source field: todo.task")
    public String getTask() {
        return task;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2651326+09:00", comments="Source field: todo.task")
    public void setTask(String task) {
        this.task = task == null ? null : task.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2661301+09:00", comments="Source field: todo.date")
    public String getDate() {
        return date;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2661301+09:00", comments="Source field: todo.date")
    public void setDate(String date) {
        this.date = date;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2661301+09:00", comments="Source field: todo.status")
    public Integer getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-15T19:26:29.2661301+09:00", comments="Source field: todo.status")
    public void setStatus(Integer status) {
        this.status = status;
    }

}