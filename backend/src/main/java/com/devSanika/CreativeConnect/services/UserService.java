package com.devSanika.CreativeConnect.services;

import com.devSanika.CreativeConnect.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
