package org.example.myfirstproject.entity;

import jakarta.persistence.Converter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.myfirstproject.config.relationenum.AbstractEnumCodeConverter;
import org.example.myfirstproject.config.relationenum.EnumMapperType;

@Getter
@RequiredArgsConstructor
public enum NovelType implements EnumMapperType {
    FREE("01", "자유")
    ;

    private final String code;
    private final String value;

    @Converter(autoApply = true)
    public static class CodeConverter extends AbstractEnumCodeConverter<NovelType> {
        public CodeConverter() {super(NovelType.class,false);}
    }
}
