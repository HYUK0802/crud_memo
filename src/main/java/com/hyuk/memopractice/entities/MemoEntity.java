package com.hyuk.memopractice.entities;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class MemoEntity {
    private int index;
    private Date datetime;
    private String nickname;
    private String text;

    public MemoEntity(int index) {
        this.index = index;
    }
}
