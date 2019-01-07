package com.coderbuff.sdk.service.read;

import com.coderbuff.sdk.domain.RepoRequst;
import com.coderbuff.sdk.dto.RepoDTO;

import java.util.List;

/**
 * 推荐仓库读操作
 * Created by OKevin on 2019-01-07 23:49
 */
public interface RepoReadService {
    /**
     * 根据名字查询仓库
     * @param repoRequst 请求参数
     * @return 仓库
     */
    List<RepoDTO> findRepoByName(RepoRequst repoRequst);
}
