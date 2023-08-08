package com.juris.search.entity;

import com.juris.search.model.SearchGeneralDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "tbl-search", schema = "search")
public class SearchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hashCode;

    private LocalDateTime inclusion;

    private String userName;

   public SearchEntity getEntity(SearchGeneralDTO dto){
        this.userName = dto.getUserName();
        this.inclusion = LocalDateTime.now();
        return this;
    }
}
