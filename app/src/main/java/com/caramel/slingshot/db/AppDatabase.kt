// package com.caramel.slingshot.db;

// import android.content.Context;

// import androidx.room.Database;
// import androidx.room.Room;
// import androidx.room.RoomDatabase;

// import com.caramel.slingshot.model.TaskEntity;

// @Database(entities = {TaskEntity.class}, version = 1, exportSchema = false)
// public abstract class TaskDatabase extends RoomDatabase {

//     private static volatile TaskDatabase INSTANCE;

//     public abstract TaskDao taskDao();

//     public static TaskDatabase getInstance(final Context context) {
//         if(INSTANCE == null) {
//             synchronized (TaskDatabase.class) {
//                 INSTANCE = Room.databaseBuilder(context.getApplicationContext(), TaskDatabase.class, "task-db").build();
//             }
//         }
//         return INSTANCE;
//     }


// }
