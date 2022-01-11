public class HanoiTower {

  private int[] peg0;
  private int[] peg1;
  private int[] peg2;

  public static void main(String[] args) {
    HanoiTower hanoiTower = new HanoiTower();
    hanoiTower.runHanoi();
  }

  public void runHanoi() {
    peg0 = new int[]{3, 2, 1};
    peg1 = new int[]{};
    peg2 = new int[]{};
    solveHanoi(peg0.length, 0, 1);
  }

  public void moveDisk(int fromPeg, int toPeg) {
    int[] from;
    int[] to;

    if (fromPeg == 0) {
      from = peg0;
    } else if (fromPeg == 1) {
      from = peg1;
    } else {
      from = peg2;
    }

    if (toPeg == 0) {
      to = peg0;
    } else if (toPeg == 1) {
      to = peg1;
    } else {
      to = peg2;
    }
    int temp = from[from.length - 1];

    int[] tempFrom = new int[from.length - 1];
    for (int i = 0; i < tempFrom.length; i++) {
      tempFrom[i] = from[i];
    }

    to = new int[to.length + 1];
    to[to.length - 1] = temp;

//    to[to.length - 1] = temp;
    System.out.println("moving disk");
  }

  public int getSparePeg(int fromPeg, int toPeg) {
    int sparePeg = 0;
    for (int i = 0; i <= 2; i++) {
      if (fromPeg != i && toPeg != i) {
        sparePeg = i;
      }
    }
    return sparePeg;
  }

  public void solveHanoi(int disks, int fromPeg, int toPeg) {
    if (disks == 0) {
      return;
    }
    moveDisk(fromPeg, toPeg);

    System.out.println("Spare Peg: " + getSparePeg(fromPeg, toPeg));
    int sparePeg = getSparePeg(fromPeg, toPeg);
    solveHanoi(disks - 1, fromPeg, sparePeg);
  }

}
