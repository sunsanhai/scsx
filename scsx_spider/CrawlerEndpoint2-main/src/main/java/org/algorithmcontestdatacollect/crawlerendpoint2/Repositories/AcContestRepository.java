package org.algorithmcontestdatacollect.crawlerendpoint2.Repositories;

import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.AcContestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AcContestRepository extends JpaRepository<AcContestEntity,Long> {
    public AcContestEntity getAcContestEntityById(Long id);
    public AcContestEntity getAcContestEntityByNickname(String nickname);
    boolean existsAcContestEntityByNickname(String nickname);
    boolean existsAcContestEntityByNicknameAndStartTimeStamp(String nickname,Long startTimeStamp);

    @Query(value = "SELECT `acc`.* FROM ( `ac_contest` `acc` LEFT JOIN `ac_stucontest` `acsc` ON ( ( `acc`.`id` = `acsc`.`cid` ) ) ) WHERE acc.end_time_stamp < unix_timestamp(now()) GROUP BY `acc`.`id` HAVING COUNT(`acsc`.`acid`) > 0 ORDER BY RAND() LIMIT :limit ",nativeQuery = true)
    public List<AcContestEntity> getAcContestEntitiesRandom(@Param("limit") int limit);

    @Query(value = "SELECT `acc`.* FROM ( `ac_contest` `acc` LEFT JOIN `ac_stucontest` `acsc` ON ( ( `acc`.`id` = `acsc`.`cid` ) ) ) WHERE acc.end_time_stamp < unix_timestamp(now()) and acc.id not in (SELECT DISTINCT(cid) FROM `ac_submit`) GROUP BY `acc`.`id` HAVING COUNT(`acsc`.`acid`) > 0 ORDER BY RAND() LIMIT 5",nativeQuery = true)
    List<AcContestEntity> getNoSubmitRecordContestEntities(@Param("limit") int limit);

}
