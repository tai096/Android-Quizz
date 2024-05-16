package com.example.androidquizz.RoomPersistence;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface QuestionDao {
    @Insert
    void insert(QuestionEntity question);

    @Insert
    void insertAll(List<QuestionEntity> questions);

    @Query("SELECT * FROM QuestionEntity WHERE id = :questionId")
    QuestionEntity getById(int questionId);

    @Query("SELECT * FROM QuestionEntity")
    List<QuestionEntity> getAll();

    @Update
    void update(QuestionEntity question);

    @Delete
    void delete(QuestionEntity question);
}
