package com.xworkz.Repository;

import com.xworkz.Dto.SignInDto;

public interface SignInRepo {

    boolean save(SignInDto signInDto);

    public interface SignaWebRepository {
        boolean save(SignInDto signInDto);
    }
}
