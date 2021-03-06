package com.kc1337.repositories;

import com.kc1337.models.*;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by student on 7/10/17.
 */
public interface ImageRepository extends CrudRepository<Image,Long> {
        public Iterable<Image> findAllByUser(User user);
}
