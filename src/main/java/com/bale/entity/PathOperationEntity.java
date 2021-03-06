package com.bale.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PathOperationEntity {

    private String methodName;

    private List<PathParamsEntity> params;

    private String responseType;

    private String urlPath;
}