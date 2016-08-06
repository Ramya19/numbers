char ch1,ch2,ch3;
int pos,count=0,count1=0;
StringBuilder s = new StringBuilder("THHTHHH");
 while(!"________".equals(s)) {
            System.out.println(s);
            for (int i=1;i<=s.length();i++)
                System.out.print(i);
            for (int i=0;i<s.length();i++)
                while('H' == s.charAt(i))
                    count=1;
            while(count==0)
                break;
            count=0;

            System.out.println("\nEnter the position to delete");
            Scanner sc = new Scanner(System.in);
            pos = sc.nextInt();
            pos = pos - 1;

            if (pos <= s.length())
            {

                if (s.charAt(pos) == 'T' || s.charAt(pos) == '_') {
                    System.out.println("You are entered the tail position or already deleted position " +
                            " Please enter the head position or unremoved position to remove");

                } else {

                    if (pos <= 0) {
                        // System.out.println("check : "+pos);
                        ch1 = s.charAt(pos);
                        ch2 = s.charAt(pos + 1);
                    } else if (pos >= s.length() - 1) {
                        ch1 = s.charAt(pos - 1);
                        ch2 = s.charAt(pos);
                    } else {
                        ch1 = s.charAt(pos - 1);
                        ch2 = s.charAt(pos + 1);
                    }


                    switch (ch1) {
                        case 'H':
                            s.setCharAt(getpos((pos - 1), s), 'T');
                            break;
                        case 'T':
                            s.setCharAt(getpos((pos - 1), s), 'H');
                            break;
                    }
                    switch (ch2) {
                        case 'H':
                            s.setCharAt(getpos(pos + 1, s), 'T');
                            break;
                        case 'T':
                            s.setCharAt(getpos(pos + 1, s), 'H');
                            break;
                    }
                    s.setCharAt(pos, '_');
                }

            }
            else
            {
                System.out.println("Please enter only available position to delete");
            }

        }
        for (int i=0;i<s.length();i++)
        {
        if (s.charAt(i)=='_')
            count1++;
        }
        if (count1==s.length())
            System.out.println("\nCongrats..You Have Won the game");
        else
            System.out.println(count1+s.length()+"\nThere is no way.  You have to accept that you are failed");

}


    private static int getpos(int i,StringBuilder s) {
            if(i<=0)
                return 0;
        else if (i>=s.length())
                return i-1;
        else
                return i;

    }
} 