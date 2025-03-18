package com.example.demo.Mapper;

import com.example.demo.Entity.Comment;
import com.example.demo.dto.CommentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mapping(target = "userId",source = "user.id")
    CommentDTO toDTO(Comment comment);
    @Mapping(target = "user.id" ,source = "userId")
    @Mapping(target = "product",ignore = true)
    Comment toEntity (CommentDTO commentDTO);
}
