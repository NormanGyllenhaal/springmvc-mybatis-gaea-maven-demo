package site.lovecode.service.service;

import com.bj58.spat.gaea.server.contract.annotation.OperationContract;
import com.bj58.spat.gaea.server.contract.annotation.ServiceContract;
import site.lovecode.service.entity.User;

/**
 * Created by admin on 2016/6/24.
 */
@ServiceContract
public interface IUserService {

    @OperationContract
    User getOneUser(Integer id);

}
