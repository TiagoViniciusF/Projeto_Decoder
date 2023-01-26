package com.ead.course.dto;

import javax.validation.constraints.NotBlank;

public class LessonDto {

    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private String videoUrl;


}
