// package com.caramel.slingshot.db;

// import androidx.lifecycle.LiveData;
// import androidx.room.Dao;
// import androidx.room.Delete;
// import androidx.room.Insert;
// import androidx.room.Query;
// import androidx.room.Update;

// import com.caramel.slingshot.model.TaskEntity;

// import java.util.List;

// @Dao
// public interface TaskDao {

//     @Insert
//     void insert(TaskEntity task);

//     @Update
//     void update(TaskEntity task);

//     @Delete
//     void delete(TaskEntity task);

//     @Query("UPDATE `task-entity` SET isCompleted = :isCompleted WHERE id = :id")
//     void updateTaskStatus(int id, boolean isCompleted);

//     @Query("SELECT * FROM `task-entity`")
//     LiveData<List<TaskEntity>> getAllTasks();

// }
