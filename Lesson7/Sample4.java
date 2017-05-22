class Sample4
{
  public static void main(String[] args)
  {
    //配列の宣言方法その３
    int[] test = {10, 20, 30, 40, 80};

    for(int i = 0; i < 5; i++){
      System.out.println((i+1) + "番目の人の点数は" + test[i] + "点です。");
    }
  }
}
