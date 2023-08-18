package com.juris.search.service;

import com.juris.search.entity.LawyerEntity;

public interface SearchService<T> {
    String getHashCodeBySearch( T type);

}
