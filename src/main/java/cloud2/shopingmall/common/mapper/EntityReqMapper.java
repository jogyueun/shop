package cloud2.shopingmall.common.mapper;

import java.util.List;

public interface EntityReqMapper<E,D> {
    E toEntity(D dto);

    List<E> toEntity(List<D> dtos);
}
