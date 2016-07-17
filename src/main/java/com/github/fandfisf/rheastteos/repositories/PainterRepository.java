package com.github.fandfisf.rheastteos.repositories;

import com.github.fandfisf.rheastteos.model.Painter;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Prashant S Khanwale @ Suveda LLC  on 7/16/16.
 */
public interface PainterRepository extends PagingAndSortingRepository<Painter, Long> {
    List<Painter> findByPseudonym(@Param("pseudonym") String pseudonym);
    List<Painter> findByLastName(@Param("lastName") String lastName);
}
