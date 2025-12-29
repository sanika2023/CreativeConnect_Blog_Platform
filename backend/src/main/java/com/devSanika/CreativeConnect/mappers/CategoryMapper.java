package com.devSanika.CreativeConnect.mappers;

import com.devSanika.CreativeConnect.domain.PostStatus;
import com.devSanika.CreativeConnect.domain.dtos.CategoryDto;
import com.devSanika.CreativeConnect.domain.dtos.CreateCategoryRequest;
import com.devSanika.CreativeConnect.domain.entities.Category;
import com.devSanika.CreativeConnect.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {

    @Mapping(target = "postCount", source= "posts", qualifiedByName = "calculatePostCount")
    CategoryDto toDto(Category category);

    Category toEntity(CreateCategoryRequest createCategoryRequest);

    //mapstruct will implement this interface for us
    @Named("calculatePostCount")
    default long calculatePostCount(List<Post> posts){
        if(null == posts){
            return 0;
        }
        //filters posts to public and return count
        return posts.stream()
                .filter(post -> PostStatus.PUBLISHED.equals(post.getStatus()))
                .count();
    }
}
