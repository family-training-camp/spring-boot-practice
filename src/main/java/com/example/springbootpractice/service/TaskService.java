package com.example.springbootpractice.service;

import com.example.springbootpractice.dto.TaskDTO;
import com.example.springbootpractice.repository.TaskRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// service： 是用来描述业务逻辑的,做一些业务操作
@Service // 表示这个类是一个service
public class TaskService {
    @Resource private TaskRepository taskRepository;
    // 新增一个任务
    public void addNewTask(TaskDTO taskDTO){
        // 1. 先判断数据库有没有相同的任务存在了
        // 2. 存 or 不存
        // 3. 返回结果
        taskRepository.findAll();
    }
}
