package org.algorithmcontestdatacollect.crawlerendpoint2.Repositories;

import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.NoRecommendContest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface NoRecommendContestRepository extends JpaRepository<NoRecommendContest, String>, JpaSpecificationExecutor<NoRecommendContest> {

}