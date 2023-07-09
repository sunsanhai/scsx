package org.algorithmcontestdatacollect.crawlerendpoint2.Repositories;

import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.AcAccountWithUsernameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AcAccountWithUsernameRepository extends JpaRepository<AcAccountWithUsernameEntity,Long> {
    List<AcAccountWithUsernameEntity> getAcAccountWithUsernameEntitiesByYearAfter(Integer year);

}
