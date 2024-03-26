package cloud2.shopingmall.user.mapstruct;

import cloud2.shopingmall.common.mapper.EntityReqMapper;
import cloud2.shopingmall.user.dto.UserDTO;
import cloud2.shopingmall.user.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserReqMapper extends EntityReqMapper<UserDTO,UserEntity> {

}
