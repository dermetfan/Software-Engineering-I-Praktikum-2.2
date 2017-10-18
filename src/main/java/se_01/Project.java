package se_01;

/**
 * &Uuml;bung 1.3: Projektmanagement in Java
 *
 * @author dgruen2s
 * @date 2017-10-18
 */
public class Project {

  /**
   * Repr&auml;sentiert die Abh&auml;ngigkeiten bzw. Regeln der Aktivit&auml;ten.
   * <p>
   * Die Abh&auml;ngigkeit <code>String[] {"A", "C"}</code> bedeutet dabei "A vor C"
   */
  private final String[][] dependencies;

  /**
   * Standardkonstruktor
   *
   * @param dependencies Die Abh&auml;ngigkeiten der Aktivit&auml;ten
   */
  public Project(String[][] dependencies) {
    this.dependencies = dependencies;
  }

  /**
   * &Uuml;berpr&uuml;ft, ob die Sequenz g&uuml;tig ist.
   *
   * @param sequence Die zu &uuml;berpr&uuml;fende Sequenz
   * @return true, wenn die Sequenz g&uuml;tig ist
   */
  public boolean isWellSorted(String[] sequence) {
    return true;
  }
}
