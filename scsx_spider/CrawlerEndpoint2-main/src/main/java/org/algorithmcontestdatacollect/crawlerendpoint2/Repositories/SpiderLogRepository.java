package org.algorithmcontestdatacollect.crawlerendpoint2.Repositories;

import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.SpiderLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpiderLogRepository extends JpaRepository<SpiderLogEntity,Long> {
}
