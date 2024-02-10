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
public class Search {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String hashCode;

    private LocalDateTime inclusion;

    private String userName;

    private String search;

    private String document;

    @ManyToOne
    private Lawyer lawyer;

    public Search getEntity(SearchGeneralDTO dto) {
        this.inclusion = LocalDateTime.now();
        return this;
    }
}
