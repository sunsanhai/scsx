package org.algorithmcontestdatacollect.crawlerendpoint2.Repositories;

import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.CfStucontestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CfStucontestRepository extends JpaRepository<CfStucontestEntity,Long> {
    public List<CfStucontestEntity> getCfStucontestEntitiesByCfid(Long cfid);
    public boolean existsCfStucontestEntityByCfidAndCid(Long cfid,Long cid);
}
