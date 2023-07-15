package ua.stepanchuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class BinarySearchTest {

  @ParameterizedTest
  @MethodSource
  void findTest(int [] arrayOfNumbers, int searchNumber, Integer expectedPosition) {
    Assertions.assertEquals(expectedPosition, BinarySearch.find(arrayOfNumbers, searchNumber));
  }

  static Stream<Arguments> findTest() {
    return Stream.of(
            Arguments.of(new int[]{1, 2, 3, 4, 5}, 5, 4),
            Arguments.of(new int[]{-3, -1, 0, 4, 6, 40, 50}, 0, 2),
            Arguments.of(new int[]{100, 200, 300, 400, 500}, 100, 0),
            Arguments.of(new int[]{}, 12, null),
            Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 8, null)
    );
  }
}
