package com.portfolio.map;

import com.portfolio.dto.ContactDTO;
import com.portfolio.model.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "cdi")
public interface ContactMapper {

    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);
    ContactDTO toDTO(Contact entity);
    Contact toEntity(ContactDTO dto);
}
