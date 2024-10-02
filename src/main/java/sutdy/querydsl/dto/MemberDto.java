package sutdy.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class MemberDto {
    private String username;
    private int age;

    /**
     * @QueryProjection 어노테이션을 이용하면 dto의 Q파일도 생성된다.
     */
    @QueryProjection
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public MemberDto() {
    }
}
