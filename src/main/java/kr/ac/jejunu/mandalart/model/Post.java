package kr.ac.jejunu.mandalart.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Integer postId;
    @Column(name = "post_number")
    private Integer postNumber;
    @Column(name = "purpose")
    private String purpose;

}
