package com.github.fandfisf.rheastteos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by Prashant S Khanwale @ Suveda LLC  on 7/16/16.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "painters")
public class Painter {
    /**
     * Created by Prashant S Khanwale @ Suveda LLC  on 7/16/16.
     */
    @Id
    @Column(name = "painter_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "PSEUDONYM")
    private String pseudonym;
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Column(name = "date_of_death")
    @Temporal(TemporalType.DATE)
    private Date dateOfDeath;
    @Column(name = "picture")
    private String picture;
    @Column(name = "version")
    private int version;
}
