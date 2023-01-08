package com.securityacl.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name="system_message")
public class NoticeMessage {

    @Id
    @Column
    private Integer id;

    @Column
    private String content;
}
