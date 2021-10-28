package Lab03;

public class Tests {
    public static void tests(){
        {
            if(Lab03.countChar("akademik", 'a') != 2)
                throw new AssertionError("countChar() return invalid value");
        }

        {
            if(Lab03.countSubStr("strstrstr", "str") != 3)
                throw new AssertionError("countSubStr() return invalid value");
        }

        {
            if(!(Lab03.repeat("ho", 3).equals("hohoho")))
                throw new AssertionError("repeat() return invalid value");
        }

        {
            int[] test = {0, 3, 6};
            int[] tmp = Lab03.where("strstrstr","str");

            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] != test[i])
                    throw new AssertionError("where() return invalid value");
            }
        }

        {
            if(!(Lab03.change("Ho").equals("hO")))
                throw new AssertionError("change() return invalid value");
        }

    }
}
