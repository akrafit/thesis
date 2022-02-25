package main.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "post_votes")
public class PostVote {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, columnDefinition = "DATETIME")
    private String time;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private String value;
}
