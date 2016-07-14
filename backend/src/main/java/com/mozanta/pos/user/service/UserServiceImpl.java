package com.mozanta.pos.user.service;

import com.mozanta.pos.spring.security.PosUserDetails;
import com.mozanta.pos.user.entity.PosUser;
import com.mozanta.pos.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        PosUser user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }else{
            UserDetails details = new PosUserDetails(user);
            return details;
        }
    }

    @Override
    public PosUser getSessionUser() {
        final PosUserDetails posUserDetails = (PosUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return posUserDetails.retrieveUser();
    }
}