package com.example.demo.Mapper;

import com.example.demo.Entity.Comment;
import com.example.demo.Entity.Product;
import com.example.demo.dto.CommentDTO;
import com.example.demo.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
@Mapping(target = "image" ,source = "image")
 ProductDto toDTO(Product product);
@Mapping(target = "image" ,source = "image")
 Product toEntity(ProductDto productDto);

CommentDTO toDTO(Comment comment);
Comment toEntity(CommentDTO commentDTO);
}
