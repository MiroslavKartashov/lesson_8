//5.Постройте частотный словарь букв русского (или английского) алфавита.
// Опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст небольшой длины).

public class DictRu {
    public static void main(String[] args) {
//        dictBuldRu("а, б, в, г, д, е, ё, ж, з, и, й, к, л, м, н, о, п, р, с, т, у, ф, х, ц, ч, ш, щ, ъ, ы, ь, э, ю, я. ");
        dictBuldRu("Шла Саша по шоссе и сосала.....");
    }
    public static void dictBuldRu (String text){
        text = text.toLowerCase();

      int[] result = new int['я' - 'а' + 1];
        for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        if (ch >= 'а' && ch <= 'я')  {
        result[ch - 'а']++;
        }
      }

        for (int i = 0; i < result.length; i++) {
           System.out.println((char) (i + 'а') + " = " + result[i]);
        }
     }

}




