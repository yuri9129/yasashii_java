class Sample3
{
  public static void main(String[] args)
  {
    //配列の宣言方法その２
    int[] test = new int[5];

    test[0] = 10;
    test[1] = 20;
    test[2] = 30;
    test[3] = 40;
    test[4] = 50;

    for(int i = 0; i < 5; i++){
      System.out.println((i+1) + "番目の人の点数は" + test[i] + "点です。");
    }
  }
}
