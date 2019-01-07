package com.coderbuff.service.impl.read;

import com.coderbuff.dao.RepoDao;
import com.coderbuff.domain.Repository;
import com.coderbuff.sdk.domain.RepoRequst;
import com.coderbuff.sdk.dto.RepoDTO;
import com.coderbuff.sdk.service.read.RepoReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 仓库读操作实现类
 * Created by OKevin on 2019-01-07 23:53
 */
@Component
public class RepoReadServiceImpl implements RepoReadService {

    @Autowired
    private RepoDao repoDao;

    @Override
    public List<RepoDTO> findRepoByName(RepoRequst repoRequst) {
        List<Repository> repositories = repoDao.findRepoByName(repoRequst.getName());
        System.out.println("repositories: " + repositories);
        return null;
    }
}
