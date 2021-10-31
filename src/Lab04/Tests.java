package Lab04;

public class Tests {
    public static void tests(){
        {
            if(Lab04.countChar("akademik", 'a') != 2)
                throw new AssertionError("countChar() return invalid value");
        }

        {
            if(Lab04.countSubStr("strstrstr", "str") != 3)
                throw new AssertionError("countSubStr() return invalid value");
        }

        {
            if(!(Lab04.repeat("ho", 3).equals("hohoho")))
                throw new AssertionError("repeat() return invalid value");
        }

        {
            int[] test = {0, 3, 6};
            int[] tmp = Lab04.where("strstrstr","str");

            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] != test[i])
                    throw new AssertionError("where() return invalid value");
            }
        }

        {
            if(!(Lab04.change("Ho").equals("hO")))
                throw new AssertionError("change() return invalid value");
        }

        {
            if(!(Lab04.nice("1000000").equals("1'000'000")))
                throw new AssertionError("nice() return invalid value");
        }

        {
            if(!(Lab04.betterNice("1000000", ' ', 3).equals("1 000 000")))
                throw new AssertionError("betterNice() return invalid value");
        }

    }
}
