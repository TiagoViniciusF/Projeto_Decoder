package com.ead.course.repository;

import com.ead.course.model.ModuleModel;
//import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ModuleRepository extends JpaRepository<ModuleModel, UUID> {

    @Query(value="select * from tb_modules where course_course_id = :courseId", nativeQuery = true)
    List<ModuleModel> findAllModulesCourse(@Param("courseId") UUID courseId);

    //@EntityGraph = Traz atributo que está setado com FetchType.LAZY, como FetchType.EAGER
//    @EntityGraph(attributePaths = {"course"})
//    ModuleModel findByTitle(String title);


}
