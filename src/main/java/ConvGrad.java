// 6.Напишите класс BaseConverter для конвертации
// из градусов по Цельсию в Кельвины​, ​Фаренгейты​, и так далее. У метода должен быть метод convert, который и делает конвертацию.
public class ConvGrad {
    public static void main(String[] args) {
        double temperature = 36.6;
        System.out.println(" t = " + new CelsConverter().getConvertedValue(temperature));
        System.out.println("t = " + new KelvinConverter().getConvertedValue(temperature));
        System.out.println("t = " + new FahrenheitConverter().getConvertedValue(temperature));
    }
    public interface Converter {
        double getConvertedValue(double baseValue);
    }

    public static class CelsConverter implements Converter {
        @Override
        public double getConvertedValue(double baseValue) {
            return baseValue;
        }
    }
    public static class KelvinConverter implements Converter {
        @Override
        public double getConvertedValue(double baseValue) {
            return baseValue + 273.15;
        }
    }

    public static class FahrenheitConverter implements Converter {
        @Override
        public double getConvertedValue(double baseValue) {
            return 1.8 * baseValue + 32;
        }
    }

}




