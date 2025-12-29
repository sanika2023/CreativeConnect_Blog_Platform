package com.devSanika.CreativeConnect.mappers;

import com.devSanika.CreativeConnect.domain.CreatePostRequest;
import com.devSanika.CreativeConnect.domain.UpdatePostRequest;
import com.devSanika.CreativeConnect.domain.dtos.CreatePostRequestDto;
import com.devSanika.CreativeConnect.domain.dtos.PostDto;
import com.devSanika.CreativeConnect.domain.dtos.UpdatePostRequestDto;
import com.devSanika.CreativeConnect.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    @Mapping(target = "status", source = "status")
    PostDto toDto(Post post);
    
    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);

}
