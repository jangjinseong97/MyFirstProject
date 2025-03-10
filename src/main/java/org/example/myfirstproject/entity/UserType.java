package org.example.myfirstproject.entity;

import jakarta.persistence.Converter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.myfirstproject.common.exception.CustomException;
import org.example.myfirstproject.common.exception.UserErrorCode;
import org.example.myfirstproject.config.relationenum.AbstractEnumCodeConverter;
import org.example.myfirstproject.config.relationenum.EnumMapperType;

@Getter
@RequiredArgsConstructor
public enum UserType implements EnumMapperType {
    USER("01", "유저"),
    ADULT_USER("02", "성인 유저"),
    PREMIUM_USER("03", "프리미엄 유저"),
    PREMIUM_ADULT_USER("04", "프리미엄 성인 유저"),
    BANNED_USER("05", "정지 유저"),
    DORMANT_USER("06", "휴면 유저"),
    WITHDRAWN_USER("99", "탈퇴 유저"),
    ;

    private final String code;
    private final String value;

    @Converter(autoApply = true)
    public static class CodeConverter extends AbstractEnumCodeConverter<UserType> {
        public CodeConverter() {super(UserType.class,false);}
    }
}
