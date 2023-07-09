package org.algorithmcontestdatacollect.crawlerendpoint2.Repositories;

import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.CfContestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CfContestRepository extends JpaRepository<CfContestEntity,Long> {
    public CfContestEntity getCfContestEntityByCid(Long cid);

}
