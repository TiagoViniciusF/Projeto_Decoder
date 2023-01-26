package com.ead.course.service;

import com.ead.course.model.LessonModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LessonService {
    LessonModel save(LessonModel lessonModel);

    Optional<LessonModel> findLessonIntoModel(UUID moduleId, UUID lessonId);

    void delete(LessonModel lessonModel);

    List<LessonModel> findAllByModule(UUID moduleId);
}
