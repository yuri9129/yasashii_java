class Sample1
{
  public static void main(String[] args)
  {
    //�z��̐錾���@���̂P
    int[] test;
    test = new int[5];

    test[0] = 80;
    test[1] = 60;
    test[2] = 22;
    test[3] = 50;
    test[4] = 75;

    for(int i = 0; i<5; i++){
      System.out.println((i+1) + "�Ԗڂ̐l�̓_����" + test[i] + "�ł��B");
    }
  }
}
