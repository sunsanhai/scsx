package org.algorithmcontestdatacollect.crawlerendpoint2.Repositories;

import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.CfSubmitcodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CfSubmitCodeRepository extends JpaRepository<CfSubmitcodeEntity,Long> {
    public boolean existsCfSubmitcodeEntityBySid(Long sid);
}
