package io.metersphere.base.mapper;

import io.metersphere.base.domain.TestCaseReviewScenario;
import io.metersphere.base.domain.TestCaseReviewScenarioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestCaseReviewScenarioMapper {
    long countByExample(TestCaseReviewScenarioExample example);

    int deleteByExample(TestCaseReviewScenarioExample example);

    int deleteByPrimaryKey(String id);

    int insert(TestCaseReviewScenario record);

    int insertSelective(TestCaseReviewScenario record);

    List<TestCaseReviewScenario> selectByExample(TestCaseReviewScenarioExample example);

    TestCaseReviewScenario selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TestCaseReviewScenario record, @Param("example") TestCaseReviewScenarioExample example);

    int updateByExample(@Param("record") TestCaseReviewScenario record, @Param("example") TestCaseReviewScenarioExample example);

    int updateByPrimaryKeySelective(TestCaseReviewScenario record);

    int updateByPrimaryKey(TestCaseReviewScenario record);
}