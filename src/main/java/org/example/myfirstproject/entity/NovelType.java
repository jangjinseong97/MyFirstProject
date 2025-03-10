package org.example.myfirstproject.entity;

import jakarta.persistence.Converter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.myfirstproject.config.relationenum.AbstractEnumCodeConverter;
import org.example.myfirstproject.config.relationenum.EnumMapperType;

@Getter
@RequiredArgsConstructor
public enum NovelType implements EnumMapperType {
    SERIAL_NOVEL("01", "연재"),
    DELAY_NOVEL("02", "연재지연"),
    DROP_NOVEL("03", "연재중단"),
    PAUSED_NOVEL("04", "휴재"),
    END_NOVEL("05", "완결"),
    DRAFT_NOVEL("99", "습작")
    ;

    private final String code;
    private final String value;

    @Converter(autoApply = true)
    public static class CodeConverter extends AbstractEnumCodeConverter<NovelType> {
        public CodeConverter() {super(NovelType.class,false);}
    }
}
