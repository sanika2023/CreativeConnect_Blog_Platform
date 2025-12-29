package com.devSanika.CreativeConnect.mappers;

import com.devSanika.CreativeConnect.domain.PostStatus;
import com.devSanika.CreativeConnect.domain.entities.Post;
import com.devSanika.CreativeConnect.domain.entities.Tag;
import com.devSanika.CreativeConnect.domain.dtos.TagDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.Set;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TagMapper {
    @Mapping(target = "postCount", source = "posts", qualifiedByName = "calculatePostCount")
    TagDto toTagResponse(Tag tag);

    @Named("calculatePostCount")
    default Integer calculatePostCount(Set<Post> posts){
        if(posts == null){
            return 0;
        }
        return (int) posts.stream()
                .filter(post -> PostStatus.PUBLISHED.equals(post.getStatus()))
                .count();

    }
}
