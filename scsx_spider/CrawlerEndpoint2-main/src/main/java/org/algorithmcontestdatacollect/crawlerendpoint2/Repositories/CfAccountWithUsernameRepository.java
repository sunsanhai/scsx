package org.algorithmcontestdatacollect.crawlerendpoint2.Repositories;

import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.CfAccountWithUsernameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CfAccountWithUsernameRepository extends JpaRepository<CfAccountWithUsernameEntity,Long> {
    List<CfAccountWithUsernameEntity> getCfAccountWithUsernameEntitiesByYearAfter(Integer year);
}
