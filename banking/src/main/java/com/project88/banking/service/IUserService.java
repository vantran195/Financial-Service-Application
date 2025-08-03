package com.project88.banking.service;

import com.project88.banking.dto.*;

import java.io.IOException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.multipart.MultipartFile;

import com.project88.banking.dto.filter.UserFilter;
import com.project88.banking.entity.User;

public interface IUserService extends UserDetailsService {
    void registerUser(User user);

    // User getUserByCCCD(String cccd);
    //
    // User addBalance(String cccd, int amount);

    ProfileDTO getProfile(String name);

    String changeUserProfile(String username, MultipartFile file) throws IOException;

    void transfer(TransferDTO form);

    String findUserByCardNumber(int cardNumber);

    Page<GetAllUserDTO> findAllUsers(Pageable pageable, UserFilter filter, String username);

    User findUserById(Long id);

    void topUpBalance(TopUpDTO dto);

    User findUserByUsername(String username);

    boolean isEmailExists(String email);

    boolean isPhoneExists(String phone);

    boolean isUsernameExists(String username);

    boolean isCccdExists(String cccd);

    void editUserByEmployee(long userID, EditUserDTO dto);

}
