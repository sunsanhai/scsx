package org.algorithmcontestdatacollect.crawlerendpoint2.Repositories;

import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.AcSubmitcodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcSubmitCodeRepository extends JpaRepository<AcSubmitcodeEntity, Long> {
    boolean existsAcSubmitCodeEntityBySid(Long sid);
}
