//4 .Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
public  class MethodRandomArr {
    private int[] val;
    private int[] weigt;
    private int[] ran;
    private int sum;

    public static void main(String[] args) {
        }

  public   void methodRandomArr(int[] val, int[] weigt) {
        this.val  = val;
        this.weigt = weigt;
        ran = new int[val.length];
        sum = 0; // Сумма длин всех отрезков
        for (int weigts : weigt) {
            sum += weigts;
        }
        int lSum = 0;
        for (int i = 0; i < ran.length; i++) {
            ran[i] = lSum;
            lSum += weigt[i];
        }
    }
     public int getRandom() {
        int random = (int) (Math.random() * (sum - 1));
        int ourRangeIndex = 0;
        for (int i = 0; i < ran.length; i++) {
            if (ran[i] > random) {
                break;
            }
            ourRangeIndex = i;
        }
        int i = val[ourRangeIndex];
        return i;

    }
}







