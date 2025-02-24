/******************************************************************************

Make your first inheritance based design
There were Pandavs and Kauravs. Arjun and Bheem were Pandavs. Duryodhan was a 
Kaurav. Pandavs were characterized by their skills of fighting (fight ( )), obedience (obey 
( )), and kindness (kind ( )). [Note: kind is an adjective not a verb, so it should not be 
used a function, but let us bear with it for this problem] Though Bheem was little less 
kind but equally obedient as Arjun. Kauravs were notorious for disobeying and cruelty.
But Kauravs were fighters. Kauravs were 100 in numbers, but one of them ‘Vikarn’ was a 
noble man- a good fighter, kind and obedient. If you dive a little more in the history, you 
will come to know that Pandavs and Kauravs were actually Bharatvanshi. And all 
bharatvanshis had been fighters.
You are required to create a design first on paper and then write implementation on 
your machine. Make abstract classes and concrete classes. Decide which methods 
should be made abstract or non-abstract.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();

        System.out.println("------ Arjun ------");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\n------ Bheem ------");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\n------ Duryodhan ------");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("\n------ Vikarn ------");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}