package com.zero.triptalk.like.entity;

import com.zero.triptalk.planner.entity.Planner;
import com.zero.triptalk.user.entity.UserEntity;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@EntityListeners(value = {AuditingEntityListener.class})
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLikeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userLikeId;

    @ManyToOne
    @JoinColumn(name = "planner_id")
    private Planner planner;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private LocalDateTime likeDt;
}
