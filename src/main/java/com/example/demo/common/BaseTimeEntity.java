package com.example.demo.common;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
    @CreatedDate
    @Column(name = "createDateTime", columnDefinition = "datetime", updatable = false)
    private LocalDateTime createDateTime;
    @LastModifiedDate
    @Column(name = "modifyDateTime", columnDefinition = "datetime")
    private LocalDateTime modifyDateTime;
}
