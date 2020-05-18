package ru.skillbox.socialnetworkimpl.sn.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "post")
public class PostComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private int id;

    @Column(name = "time", nullable = false)
    private LocalDateTime time;

    @Column(name = "post_id", nullable = false, length = 11)
    private int postId;

    @Column(name = "parent_id", nullable = false, length = 11)
    private int parentId;

    @Column(name = "author_id", nullable = false, length = 11)
    private int authorId;

    @Column(name = "comment_text", nullable = false)
    private String commentText;

    @Column(name = "is_blocked", nullable = false, columnDefinition = "BIT")
    private byte isBlocked;

}