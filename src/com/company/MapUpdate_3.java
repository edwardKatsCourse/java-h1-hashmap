package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUpdate_3 {
    private static String sentence = "When I wake up, the other side of the bed is cold. My fingers\n" +
            "stretch out, seeking Prim’s warmth but finding only the\n" +
            "rough canvas cover of the mattress. She must have had bad\n" +
            "dreams and climbed in with our mother. Of course, she did.\n" +
            "This is the day of the reaping.\n" +
            "I prop myself up on one elbow. There’s enough light in the\n" +
            "bedroom to see them. My little sister, Prim, curled up on her\n" +
            "side, cocooned in my mother’s body, their cheeks pressed together.\n" +
            "In sleep, my mother looks younger, still worn but not\n" +
            "so beaten-down. Prim’s face is as fresh as a raindrop, as lovely\n" +
            "as the primrose for which she was named. My mother was\n" +
            "very beautiful once, too. Or so they tell me.\n" +
            "Sitting at Prim’s knees, guarding her, is the world’s ugliest\n" +
            "cat. Mashed-in nose, half of one ear missing, eyes the color of\n" +
            "rotting squash. Prim named him Buttercup, insisting that his\n" +
            "muddy yellow coat matched the bright flower. I le hates me.\n" +
            "Or at least distrusts me. Even though it was years ago, I think\n" +
            "he still remembers how I tried to drown him in a bucket when\n" +
            "Prim brought him home. Scrawny kitten, belly swollen with\n" +
            "worms, crawling with fleas. The last thing I needed was\n" +
            "another mouth to feed. But Prim begged so hard, cried even, I\n" +
            "had to let him stay. It turned out okay. My mother got rid of \n" +
            "5\n" +
            "the vermin and he’s a born mouser. Even catches the occasional\n" +
            "rat. Sometimes, when I clean a kill, I feed Buttercup the\n" +
            "entrails. He has stopped hissing at me.\n" +
            "Entrails. No hissing. This is the closest we will ever come to\n" +
            "love.\n" +
            "I swing my legs off the bed and slide into my hunting boots.\n" +
            "Supple leather that has molded to my feet. I pull on trousers, a\n" +
            "shirt, tuck my long dark braid up into a cap, and grab my forage\n" +
            "bag. On the table, under a wooden bowl to protect it from\n" +
            "hungry rats and cats alike, sits a perfect little goat cheese\n" +
            "wrapped in basil leaves. Prim’s gift to me on reaping day. I put\n" +
            "the cheese carefully in my pocket as I slip outside.\n" +
            "Our part of District 12, nicknamed the Seam, is usually\n" +
            "crawling with coal miners heading out to the morning shift at\n" +
            "this hour. Men and women with hunched shoulders, swollen\n" +
            "knuckles, many who have long since stopped trying to scrub\n" +
            "the coal dust out of their broken nails, the lines of their sunken\n" +
            "faces. But today the black cinder streets are empty. Shutters\n" +
            "on the squat gray houses are closed. The reaping isn’t until\n" +
            "two. May as well sleep in. If you can.\n" +
            "Our house is almost at the edge of the Seam. I only have to\n" +
            "pass a few gates to reach the scruffy field called the Meadow.\n" +
            "Separating the Meadow from the woods, in fact enclosing all\n" +
            "of District 12, is a high chain-link fence topped with barbedwire\n" +
            "loops. In theory, it’s supposed to be electrified twentyfour\n" +
            "hours a day as a deterrent to the predators that live in the\n" +
            "woods — packs of wild dogs, lone cougars, bears — that used\n" +
            "to threaten our streets. But since we’re lucky to get two or \n" +
            "6\n" +
            "three hours of electricity in the evenings, it’s usually safe to\n" +
            "touch. Even so, I always take a moment to listen carefully for\n" +
            "the hum that means the fence is live. Right now, it’s silent as a\n" +
            "stone. Concealed by a clump of bushes, I flatten out on my belly\n" +
            "and slide under a two-foot stretch that’s been loose for\n" +
            "years. There are several other weak spots in the fence, but this\n" +
            "one is so close to home I almost always enter the woods here.\n" +
            "As soon as I’m in the trees, I retrieve a bow and sheath of\n" +
            "arrows from a hollow log. Electrified or not, the fence has\n" +
            "been successful at keeping the flesh-eaters out of District 12.\n" +
            "Inside the woods they roam freely, and there are added concerns\n" +
            "like venomous snakes, rabid animals, and no real paths\n" +
            "to follow. But there’s also food if you know how to find it. My\n" +
            "father knew and he taught me some before he was blown to\n" +
            "bits in a mine explosion. There was nothing even to bury. I\n" +
            "was eleven then. Five years later, I still wake up screaming for\n" +
            "him to run.\n" +
            "Even though trespassing in the woods is illegal and poaching\n" +
            "carries the severest of penalties, more people would risk it\n" +
            "if they had weapons. But most are not bold\n" +
            "7\n" +
            "someone might be arming the Seam would never have been\n" +
            "allowed.\n" +
            "In the fall, a few brave souls sneak into the woods to harvest\n" +
            "apples. But always in sight of the Meadow. Always close\n" +
            "enough to run back to the safety of District 12 if trouble arises.\n" +
            "“District Twelve. Where you can starve to death in safety,” I\n" +
            "mutter. Then I glance quickly over my shoulder. Even here,\n" +
            "even in the middle of nowhere, you worry someone might\n" +
            "overhear you.\n" +
            "When I was younger, I scared my mother to death, the\n" +
            "things I would blurt out about District 12, about the people\n" +
            "who rule our country, Panem, from the far-off city called the\n" +
            "Capitol. Eventually I understood this would only lead us to\n" +
            "more trouble. So I learned to hold my tongue and to turn my\n" +
            "features into an indifferent mask so that no one could ever\n" +
            "read my thoughts. Do my work quietly in school. Make only\n" +
            "polite small talk in the public market. Discuss little more than\n" +
            "trades in the Hob, which is the black market where I make\n" +
            "most of my money. Even at home, where I am less pleasant, I\n" +
            "avoid discussing tricky topics. Like the reaping, or food shortages,\n" +
            "or the Hunger Games. Prim might begin to repeat my\n" +
            "words and then where would we be?\n" +
            "In the woods waits the only person with whom I can be\n" +
            "myself. Gale. I can feel the muscles in my face relaxing, my\n" +
            "pace quickening as I climb the hills to our place, a rock ledge\n" +
            "overlooking a valley. A thicket of berry bushes protects it from\n" +
            "unwanted eyes. The sight of him waiting there brings on a\n" +
            "smile. Gale says I never smile except in the woods.\n" +
            "8\n" +
            "“Hey, Catnip,” says Gale. My real name is Katniss, but when\n" +
            "I first told him, I had barely whispered it. So he thought I’d\n" +
            "said Catnip. Then when this crazy lynx started following me\n" +
            "around the woods looking for handouts, it became his official\n" +
            "nickname for me. I finally had to kill the lynx because he\n" +
            "scared off game. I almost regretted it because he wasn’t bad\n" +
            "company. But I got a decent price for his pelt.\n" +
            "“Look what I shot,” Gale holds up a loaf of bread with an arrow\n" +
            "stuck in it, and I laugh. It’s real bakery bread, not the flat,\n" +
            "dense loaves we make from our grain rations. I take it in my\n" +
            "hands, pull out the arrow, and hold the puncture in the crust\n" +
            "to my nose, inhaling the fragrance that makes my mouth flood\n" +
            "with saliva. Fine bread like this is for special occasions.\n" +
            "“Mm, still warm,” I say. He must have been at the bakery at\n" +
            "the crack of dawn to trade for it. “What did it cost you?”\n" +
            "“Just a squirrel. Think the old man was feeling sentimental\n" +
            "this morning,” says Gale. “Even wished me luck.”\n" +
            "“Well, we all feel a little closer today, don’t we?” I say, not\n" +
            "even bothering to roll my eyes. “Prim left us a cheese.” I pull it\n" +
            "out.\n" +
            "His expression brightens at the treat. “Thank you, Prim.\n" +
            "We’ll have a real feast.” Suddenly he falls into a Capitol accent\n" +
            "as he mimics Effie Trinket, the maniacally upbeat woman who\n" +
            "arrives once a year to read out the names at the leaping. “I almost\n" +
            "forgot! Happy Hunger Games!” He plucks a few blackberries\n" +
            "from the bushes around us. “And may the odds —” He\n" +
            "tosses a berry in a high arc toward me.\n" +
            "9\n" +
            "I catch it in my mouth and break the delicate skin with my\n" +
            "teeth. The sweet tartness explodes across my tongue. “— be\n" +
            "ever in your favor!” I finish with equal verve. We have to joke\n" +
            "about it because the alternative is to be scared out of your\n" +
            "wits. Besides, the Capitol accent is so affected, almost anything\n" +
            "sounds funny in it.\n" +
            "I watch as Gale pulls out his knife and slices the bread. He\n" +
            "could be my brother. Straight black hair, olive skin, we even\n" +
            "have the same gray eyes. But we’re not related, at least not\n" +
            "closely. Most of the families who work the mines resemble\n" +
            "one another this way.\n" +
            "That’s why my mother and Prim, with their light hair and\n" +
            "blue eyes, always look out of place. They are. My mother’s\n" +
            "parents were part of the small merchant class that caters to\n" +
            "officials, Peacekeepers, and the occasional Seam customer.\n" +
            "They ran an apothecary shop in the nicer part of District 12.\n" +
            "Since almost no one can afford doctors, apothecaries are our\n" +
            "healers. My father got to know my mother because on his\n" +
            "hunts he would sometimes collect medicinal herbs and sell\n" +
            "them to her shop to be brewed into remedies. She must have\n" +
            "really loved him to leave her home for the Seam. I try to remember\n" +
            "that when all I can see is the woman who sat by,\n" +
            "blank and unreachable, while her children turned to skin and\n" +
            "bones. I try to forgive her for my father’s sake. But to be honest,\n" +
            "I’m not the forgiving type.\n" +
            "Gale spreads the bread slices with the soft goat cheese,\n" +
            "carefully placing a basil leaf on each while I strip the bushes of\n" +
            "their berries. We settle back in a nook in the rocks. From this \n" +
            "10\n" +
            "place, we are invisible but have a clear view of the valley,\n" +
            "which is teeming with summer life, greens to gather, roots to\n" +
            "dig, fish iridescent in the sunlight. The day is glorious, with a\n" +
            "blue sky and soft breeze. The food’s wonderful, with the\n" +
            "cheese seeping into the warm bread and the berries bursting\n" +
            "in our mouths. Everything would be perfect if this really was a\n" +
            "holiday, if all the day off meant was roaming the mountains\n" +
            "with Gale, hunting for tonight’s supper. But instead we have to\n" +
            "be standing in the square at two o’clock waiting for the names\n" +
            "to be called out.\n" +
            "“We could do it, you know,” Gale says quietly.\n" +
            "“What?” I ask.\n" +
            "“Leave the district. Run off. Live in the woods. You and I, we\n" +
            "could make it,” says Gale.\n" +
            "I don’t know how to respond. The idea is so preposterous.\n" +
            "“If we didn’t have so many kids,” he adds quickly.\n" +
            "They’re not our kids, of course. But they might as well be.\n" +
            "Gale’s two little brothers and a sister. Prim. And you may as\n" +
            "well throw in our mothers, too, because how would they live\n" +
            "without us? Who would fill those mouths that are always asking\n" +
            "for more? With both of us hunting daily, there are still\n" +
            "nights when game has to be swapped for lard or shoelaces or\n" +
            "wool, still nights when we go to bed with our stomachs growling.\n" +
            "“I never want to have kids,” I say.\n" +
            "“I might. If I didn’t live here,” says Gale.\n" +
            "“But you do,” I say, irritated.\n" +
            "“Forget it,” he snaps back.\n" +
            "11\n" +
            "The conversation feels all wrong. Leave? How could I leave\n" +
            "Prim, who is the only person in the world I’m certain I love?\n" +
            "And Gale is devoted to his family. We can’t leave, so why bother\n" +
            "talking about it? And even if we did . . . even if we did . . .\n" +
            "where did this stuff about having kids come from? There’s\n" +
            "never been anything romantic between Gale and me. When we\n" +
            "met, I was a skinny twelve-year-old, and although he was only\n" +
            "two years older, he already looked like a man. It took a long\n" +
            "time for us to even become friends, to stop haggling over\n" +
            "every trade and begin helping each other out.\n" +
            "Besides, if he wants kids, Gale won’t have any trouble finding\n" +
            "a wife. He’s good-looking, he’s strong enough to handle the\n" +
            "work in the mines, and he can hunt. You can tell by the way\n" +
            "the girls whisper about him when he walks by in school that\n" +
            "they want him. It makes me jealous but not for the reason\n" +
            "people would think. Good hunting partners are hard to find.\n" +
            "“What do you want to do?” I ask. We can hunt, fish, or gather.\n" +
            "“Let’s fish at the lake. We can leave our poles and gather in\n" +
            "the woods. Get something nice for tonight,” he says.\n" +
            "Tonight. After the reaping, everyone is supposed to celebrate.\n" +
            "And a lot of people do, out of relief that their children\n" +
            "have been spared for another year. But at least two families\n" +
            "will pull their shutters, lock their doors, and try to figure out\n" +
            "how they will survive the painful weeks to come.\n" +
            "We make out well. The predators ignore us on a day when\n" +
            "easier, tastier prey abounds. By late morning, we have a dozen\n" +
            "fish, a bag of greens and, best of all, a gallon of strawberries";

    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();
        String [] words = sentence.split(" ");

        for (String word: words) {
            String properWord = word.toLowerCase().trim();
            if (properWord.endsWith(",") ||
                    properWord.endsWith(".") ||
                    properWord.endsWith("?") ||
                    properWord.endsWith("”")) {
                //"    word    ".trim -> "word"
                properWord = properWord.trim().substring(0, properWord.length() -1);
            }

            if (properWord.startsWith("“")) {
                properWord = properWord.substring(1, properWord.length());
            }

            //putIfAbsent - ничего не делает, если ключ уже есть в мапе
            //put - заменяет значение, если ключ уже есть в мапе
            Integer oldValue = wordCount.putIfAbsent(properWord, 1);
            if (oldValue != null) {
                wordCount.put(properWord, oldValue + 1);
            }
        }

        print(wordCount);

    }

    private static void print(Map<String, Integer> wordCount) {
        for (Map.Entry<String, Integer> pair : wordCount.entrySet()) {
            System.out.printf("%s = %s\n", pair.getKey(), pair.getValue());
        }

        //getOrDefault = get() не null ИЛИ вернуть значение по умолчанию
        System.out.println("[from] in wordCount: " + wordCount.getOrDefault("from", 0));
        System.out.println("[apartment] in wordCount: " + wordCount.getOrDefault("apartment", 0));
    }

    private static void oldSchool() {

        Map<String, Integer> wordCount = new HashMap<>();
//        List<String> words = Arrays.asList(sentence.split(" "));
        String [] words = sentence.split(" ");

//        Integer initialValue = wordCount.put("word", 1); //null
//        Integer oldValue = wordCount.put("word", 10); //1


//        System.out.println(wordCount.put("word", 1));
//        System.out.println(wordCount.put("word", 10));
//        System.out.println(wordCount.get("word"));

        //яблОко = Яблоко = яБлоко
        for (String word : words) {
            //put: создает и обновляет
            //если в мапе есть такой ключ, то заменяет значение
            //если такого ключа нет, то просто добавляет
            Integer wordOccurrencesInMap = wordCount.get(word.toLowerCase());
            if (wordOccurrencesInMap == null) { //если такого слова в мапе еще нет

                wordCount.put(word.toLowerCase(), 1);
            } else { //                                        если такое слово уже встречалось
                wordCount.put(word.toLowerCase(), wordOccurrencesInMap + 1);
            }

            /*returns 1:  wordCount.put(word.toLowerCase(), 10);*/
            //output: put вернет 1, значение по этому ключу станет 10
        }

        print(wordCount);


    }
}
