package org.algorithmcontestdatacollect.crawlerendpoint2.Repositories;

import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.CodeforcesProblemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeforcesProblemRepository extends JpaRepository<CodeforcesProblemsEntity,Integer> {
    boolean existsByCidAndQindex(Long cid,String qindex);
    CodeforcesProblemsEntity getByCidAndQindex(Long cid,String qindex);
}
