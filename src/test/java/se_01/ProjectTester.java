package se_01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjectTester {
  Project simple_example;

  @Before
  public void setUp() {
    simple_example = new Project(new String[][] {{"A", "C"}, {"C", "D"}, {"B", "C"}});
  }

  @Test
  public void test_simple_example_1() {
    assertTrue(simple_example.isWellSorted(new String[] {"A", "B", "C", "D"}));
  }
}

