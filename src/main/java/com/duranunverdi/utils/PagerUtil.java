package com.duranunverdi.utils;

import lombok.experimental.UtilityClass;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@UtilityClass
public class PagerUtil {
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
}
    public static Pageable toPageAble (RestPageableRequest restPageableRequest) {
       if (!isNullOrEmpty(restPageableRequest.getColumnName())) {
           Sort sortBy = restPageableRequest.isAsc() ? Sort.by(Sort.Direction.ASC, restPageableRequest.getColumnName()) : Sort.by(Sort.Direction.DESC, restPageableRequest.getColumnName());
          return PageRequest.of(restPageableRequest.getPageNumber(), restPageableRequest.getPageSize(), sortBy);
       }
       return PageRequest.of(restPageableRequest.getPageNumber(), restPageableRequest.getPageSize());
    }
    public static <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<T> content) {

        return new RestPageableEntity<>(
                content,
                page.getNumber(),
                page.getSize(),
                page.getTotalElements()
        );
    }
}
