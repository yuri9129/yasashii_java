import java.io.*;

class SampleP4
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("5人のテストの点数を入力してください。");

    int[] test = new int[5];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for(int i = 0; i < 5; i++){
      String str = br.readLine();
      test[i] = Integer.parseInt(str);
    }

    int test_max = test[0];
    for(int j = 1; j < 5; j++){
      if(test_max < test[j]){
        test_max = test[j];
      }
    }

    for(int k = 0; k < 5; k++){
      System.out.println((k + 1) + "番目の人の点数は" + test[k] + "です。");
    }

    System.out.println("最高点は" + test_max + "点です。");
  }
}
