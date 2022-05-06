package lotto.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class SplitStringUtilsTest {
    @Test
    void split_문자열_콤마_구분() {
        assertThat(SplitStringUtils.split(" 1,2,3 , 4,5 ,6 ", ",")).isEqualTo(List.of("1", "2", "3", "4", "5", "6"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void split_입력문자열_비어있는_경우(String elem) {
        assertThatThrownBy(() -> SplitStringUtils.split(elem, ",")).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void split_구분자가_비어있는_경우(String delimiter) {
        assertThatThrownBy(() -> SplitStringUtils.split("1,2,3,4,5,6", delimiter)).isInstanceOf(IllegalArgumentException.class);
    }
}
