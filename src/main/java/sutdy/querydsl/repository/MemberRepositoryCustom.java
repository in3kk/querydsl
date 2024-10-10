package sutdy.querydsl.repository;

import sutdy.querydsl.dto.MemberSearchCondition;
import sutdy.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
}
