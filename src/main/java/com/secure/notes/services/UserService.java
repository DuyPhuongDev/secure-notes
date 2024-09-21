package com.secure.notes.services;

import com.secure.notes.dtos.UserDTO;
import com.secure.notes.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);

    void updateAccountLockStatus(Long userId, boolean lockStatus);

    void updateExpiryStatus(Long userId, boolean expiryStatus);

    void updateEnabledStatus(Long userId, boolean enabledStatus);

    void updateCredentialsStatus(Long userId, boolean credentialsStatus);

    void updatePassword(Long userId, String newPassword);

    void generatePasswordResetToken(String email);

    void resetPassword(String token, String newPassword);

    Optional<User> findByEmail(String email);

    User registerUser(User user);
}
