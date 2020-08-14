package tech.bitboo.stone;

import tech.bitboo.stone.annotations.Caution;
import tech.bitboo.stone.exceptions.NonElementsException;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class ArrayUtils
{
    public static void reverse(byte[] values)
    {
        assert_non_null(values);

        for (int i = 0, j = values.length - 1, mid = values.length >> 1;
             i < mid && j > i;
             i++, j--)
        {
            byte temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
    }

    public static void reverse(short[] values)
    {
        assert_non_null(values);

        for (int i = 0, j = values.length - 1, mid = values.length >> 1;
             i < mid && j > i;
             i++, j--)
        {
            short temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
    }

    public static void reverse(int[] values)
    {
        assert_non_null(values);

        for (int i = 0, j = values.length - 1, mid = values.length >> 1;
             i < mid && j > i;
             i++, j--)
        {
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
    }

    public static void reverse(long[] values)
    {
        assert_non_null(values);

        for (int i = 0, j = values.length - 1, mid = values.length >> 1;
             i < mid && j > i;
             i++, j--)
        {
            long temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
    }

    public static void reverse(float[] values)
    {
        assert_non_null(values);

        for (int i = 0, j = values.length - 1, mid = values.length >> 1;
             i < mid && j > i;
             i++, j--)
        {
            float temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
    }

    public static void reverse(double[] values)
    {
        assert_non_null(values);

        for (int i = 0, j = values.length - 1, mid = values.length >> 1;
             i < mid && j > i;
             i++, j--)
        {
            double temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
    }

    public static void reverse(Object[] values)
    {
        assert_non_null(values);

        for (int i = 0, j = values.length - 1, mid = values.length >> 1;
             i < mid && j > i;
             i++, j--)
        {
            Object temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
    }


    public static Byte[] toObjects(byte[] values)
    {
        assert_non_null(values);

        Byte[] result = new Byte[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    public static Short[] toObjects(short[] values)
    {
        assert_non_null(values);

        Short[] result = new Short[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    public static Integer[] toObjects(int[] values)
    {
        assert_non_null(values);

        Integer[] result = new Integer[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    public static Long[] toObjects(long[] values)
    {
        assert_non_null(values);

        Long[] result = new Long[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    public static Float[] toObjects(float[] values)
    {
        assert_non_null(values);

        Float[] result = new Float[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    public static Double[] toObjects(double[] values)
    {
        assert_non_null(values);

        Double[] result = new Double[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    @Caution(description = "Sugar ,it's expected to be very slow!!")
    public static <Target extends Number, Source extends Number> Target[] toObjects(Source[] values, Class<Target> tClass)
    {
        assert_non_null(values);

        Target[] result = (Target[]) Array.newInstance(tClass, values.length);


        Method method = null;

        try
        {
            method = tClass.getMethod("valueOf", String.class);
        }
        catch (NoSuchMethodException ex)
        {
        }


        for (int i = 0; i < values.length; i++)
        {
            try
            {
                result[i] = (Target) method.invoke(null, values[i].toString());
            }
            catch (ReflectiveOperationException ex)
            {
            }
        }

        return result;
    }

    public static byte[] toPrimitives(Byte[] values)
    {
        assert_non_null(values);

        byte[] result = new byte[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    public static short[] toPrimitives(Short[] values)
    {
        assert_non_null(values);

        short[] result = new short[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    public static int[] toPrimitives(Integer[] values)
    {
        assert_non_null(values);

        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    public static long[] toPrimitives(Long[] values)
    {
        assert_non_null(values);

        long[] result = new long[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    public static float[] toPrimitives(Float[] values)
    {
        assert_non_null(values);

        float[] result = new float[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    public static double[] toPrimitives(Double[] values)
    {
        assert_non_null(values);

        double[] result = new double[values.length];

        for (int i = 0; i < values.length; i++)
        {
            result[i] = values[i];
        }

        return result;
    }

    public static void assert_non_null(byte[] values)
    {
        if (values == null)
        {
            throw new NullPointerException();
        }
    }

    public static void assert_non_null(short[] values)
    {
        if (values == null)
        {
            throw new NullPointerException();
        }
    }

    public static void assert_non_null(int[] values)
    {
        if (values == null)
        {
            throw new NullPointerException();
        }
    }

    public static void assert_non_null(long[] values)
    {
        if (values == null)
        {
            throw new NullPointerException();
        }
    }

    public static void assert_non_null(float[] values)
    {
        if (values == null)
        {
            throw new NullPointerException();
        }
    }

    public static void assert_non_null(double[] values)
    {
        if (values == null)
        {
            throw new NullPointerException();
        }
    }

    public static void assert_non_null(Object[] values)
    {
        if (values == null)
        {
            throw new NullPointerException();
        }
    }

    public static void assert_non_empty(byte[] values)
    {
        assert_non_null(values);

        if (values.length == 0)
        {
            throw new NonElementsException();
        }
    }

    public static void assert_non_empty(short[] values)
    {
        assert_non_null(values);

        if (values.length == 0)
        {
            throw new NonElementsException();
        }
    }

    public static void assert_non_empty(int[] values)
    {
        assert_non_null(values);

        if (values.length == 0)
        {
            throw new NonElementsException();
        }
    }

    public static void assert_non_empty(long[] values)
    {
        assert_non_null(values);

        if (values.length == 0)
        {
            throw new NonElementsException();
        }
    }

    public static void assert_non_empty(float[] values)
    {
        assert_non_null(values);

        if (values.length == 0)
        {
            throw new NonElementsException();
        }
    }

    public static void assert_non_empty(double[] values)
    {
        assert_non_null(values);

        if (values.length == 0)
        {
            throw new NonElementsException();
        }
    }

}
