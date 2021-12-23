package com.seed.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DutyUpdateVO implements Serializable {
    private static final long serialVersionUID = 7965508869481806174L;

    @NonNull
    private String id;

    private String name;
}
