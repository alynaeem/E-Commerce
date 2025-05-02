package com.e_commerce.store.mapper;

import com.e_commerce.store.model.Admin;
import com.e_commerce.store.dto.AdminDTO;
import org.mapstruct.Mapper;

@Mapper
public interface AdminMapper {

    AdminDTO adminToAdminDTO(Admin admin);

    Admin adminDTOToAdmin(AdminDTO adminDTO);
}