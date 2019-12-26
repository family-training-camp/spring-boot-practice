package com.example.springbootpractice.repository;

import com.example.springbootpractice.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// Repository: 主要职责是操作数据库，跟数据库直接打交道； 关系： 向上，服务于service， 向下操作数据库
// 每一个repository对应数据库一张表
// TaskRepository专门负责Task这张表的操作
// JpaRepository默认提供了一些简单的增删改查的方法
@Repository
public interface TaskRepository extends JpaRepository<Task,String> {
    Task findByTaskName(String taskName);
}
