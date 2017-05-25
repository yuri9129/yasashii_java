import java.io.*;

class SampleP3
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("文字列を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    System.out.println("aの挿入位置を整数で入力してください。");
    String tmp = br.readLine();
    int num = Integer.parseInt(tmp);

    StringBuffer sb = new StringBuffer(str);
    sb.insert(num, "a");

    System.out.println(sb);
  }
}
