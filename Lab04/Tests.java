package Lab04;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

        {
            if(Lab04.chessBoard(3).intValue() != 511)
                throw new AssertionError("chessBoard() return invalid value");
        }

        {
            if(Lab04.countInterest(new BigDecimal(1000), new BigDecimal(6),
                    new BigDecimal(3)).equals((new BigDecimal("1119.02")).setScale(2, RoundingMode.HALF_EVEN))){
                                System.out.println(Lab04.countInterest(new BigDecimal(1000), new BigDecimal(6), new BigDecimal(3)).floatValue());
                                throw new AssertionError("countInterest() return invalid value");
            }
        }

    }
}
