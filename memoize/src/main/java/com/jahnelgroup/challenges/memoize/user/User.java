package com.jahnelgroup.challenges.memoize.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {

    @NonNull private Long id;
    @NonNull private String name;

}
