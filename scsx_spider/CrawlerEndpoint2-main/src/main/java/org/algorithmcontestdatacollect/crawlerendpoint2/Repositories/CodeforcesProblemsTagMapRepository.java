package org.algorithmcontestdatacollect.crawlerendpoint2.Repositories;

import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.CodeforcesProblemsTagMapEntity;
import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.CodeforcesProblemsTagMapEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeforcesProblemsTagMapRepository extends JpaRepository<CodeforcesProblemsTagMapEntity, CodeforcesProblemsTagMapEntityPK> {
}
