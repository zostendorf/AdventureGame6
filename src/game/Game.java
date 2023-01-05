/*
 * Bitwise Books & Courses - sample Java code
 * http://www.bitwisebooks
 * http://www.bitwisecourses.com
 */
package game;

import java.util.*;     // required for ArrayList
import java.util.concurrent.TimeUnit;

import gameobjects.Actor;
import gameobjects.ContainerThing;
import gameobjects.Room;
import gameobjects.Thing;
import gameobjects.ThingList;
import gameobjects.Treasure;
import globals.Dir;

public class Game implements java.io.Serializable {

    private ArrayList<Room> map; // the map - an ArrayList of Rooms    
    private Actor player;  // the player - provides 'first person perspective'
    private Actor captainBarbossa;
    private Actor theAntaginist;

    public Game() {
        Parser.initVocab();
        initGame();
    }

    private void initGame() {
        this.map = new ArrayList<Room>();
        // --- construct a new adventure ---


        ThingList playerlist = new ThingList("playerlist");

        ThingList CobaPyramid00List = new ThingList("CobaPyramid00List");
        ThingList CobaAlter01List = new ThingList("CobaAlter01List");
        ThingList CobaSouthJungle02List = new ThingList("CobaSouthJungle02List");
        ThingList CobaUnknownShrine03List = new ThingList("CobaUnknownShrine03List");
        ThingList CobaRiverMouth04List = new ThingList("CobaRiverMouth04List");
        ThingList Jungle05List = new ThingList("Jungle05List");
        ThingList Cave06List = new ThingList("Cave06List");
        ThingList Jungle07List = new ThingList("Jungle07List");
        ThingList Jungle08List = new ThingList("Jungle08List");
        ThingList Jungle09List = new ThingList("Jungle09List");

        ThingList CobaGameCourt10List = new ThingList("CobaGameCourt10List");
        ThingList CobaSmallPyramid11List = new ThingList("CobaSmallPyramid11List");
        ThingList Jungle12List = new ThingList("Jungle12List");
        ThingList Jungle13List = new ThingList("Jungle13List");
        ThingList CobaRiverCrossing14List = new ThingList("CobaRiverCrossing14List");
        ThingList Jungle15List = new ThingList("Jungle15List");
        ThingList Jungle16List = new ThingList("Jungle16List");
        ThingList Jungle17List = new ThingList("Jungle17List");
        ThingList Jungle18List = new ThingList("Jungle18List");
        ThingList EgyptianShip19List = new ThingList("EgyptianShip19List");

        ThingList Jungle20List = new ThingList("Jungle20List");
        ThingList Jungle21List = new ThingList("Jungle21List");
        ThingList Jungle22List = new ThingList("Jungle22List");
        ThingList Jungle23List = new ThingList("Jungle23List");
        ThingList CobaRiver24List = new ThingList("CobaRiver24List");
        ThingList CobaRiver25List = new ThingList("CobaRiver25List");
        ThingList Jungle26List = new ThingList("Jungle26List");
        ThingList Jungle27List = new ThingList("Jungle27List");
        ThingList Trap28List = new ThingList("Trap28List");
        ThingList Dungeon29List = new ThingList("Dungeon29List");

        ThingList UnknownShrine30List = new ThingList("UnknownShrine30List");
        ThingList Jungle31List = new ThingList("Jungle31List");
        ThingList Jungle32List = new ThingList("Jungle32List");
        ThingList PantherDen33List = new ThingList("PantherDen33List");
        ThingList Jungle34List = new ThingList("Jungle34List");
        ThingList CobaRiver35List = new ThingList("CobaRiver35List");
        ThingList SavageVillage36List = new ThingList("SavageVillage36List");
        ThingList Jungle37List = new ThingList("Jungle37List");
        ThingList Jungle38List = new ThingList("Jungle38List");
        ThingList Cave39List = new ThingList("Cave39List");

        ThingList Jungle40List = new ThingList("Jungle40List");
        ThingList Trap41List = new ThingList("Trap41List");
        ThingList SavageVillage42List = new ThingList("SavageVillage42List");
        ThingList Jungle43List = new ThingList("Jungle43List");
        ThingList Jungle44List = new ThingList("Jungle44List");
        ThingList Pond45List = new ThingList("Pond45List");
        ThingList Jungle46List = new ThingList("Jungle46List");
        ThingList Jungle47List = new ThingList("Jungle47List");
        ThingList Jungle48List = new ThingList("Jungle48List");
        ThingList Trap49List = new ThingList("Trap49List");

        ThingList WitchDoctor50List = new ThingList("WitchDoctor50List");
        ThingList Jungle51List = new ThingList("Jungle51List");
        ThingList Jungle52List = new ThingList("Jungle52List");
        ThingList Spring53List = new ThingList("Spring53List");
        ThingList UnknownShrine54List = new ThingList("UnknownShrine54List");
        ThingList Jungle55List = new ThingList("Jungle55List");
        ThingList Jungle56List = new ThingList("Jungle56List");
        ThingList PantherDen57List = new ThingList("PantherDen57List");
        ThingList Jungle58List = new ThingList("Jungle58List");
        ThingList Jungle59List = new ThingList("Jungle59List");

        ThingList Jungle60List = new ThingList("Jungle60List");
        ThingList VikingShip61List = new ThingList("VikingShip61List");
        ThingList VikingOutpost62List = new ThingList("VikingOutpost62List");
        ThingList UnknownRiver63List = new ThingList("UnknownRiver63List");
        ThingList Jungle64List = new ThingList("Jungle64List");
        ThingList Jungle65List = new ThingList("Jungle65List");
        ThingList TulumPyramid66List = new ThingList("TulumPyramid66List");
        ThingList TulumVillage67List = new ThingList("TulumVillage67List");
        ThingList Jungle68List = new ThingList("Jungle68List");
        ThingList Beach69List = new ThingList("Beach69List");

        ThingList Jungle70List = new ThingList("Jungle70List");
        ThingList Jungle71List = new ThingList("Jungle71List");
        ThingList Jungle72List = new ThingList("Jungle72List");
        ThingList UnknownRiver73List = new ThingList("UnknownRiver73List");
        ThingList Cave74List = new ThingList("Cave74List");
        ThingList Jungle75List = new ThingList("Jungle75List");
        ThingList TulumVillage76List = new ThingList("TulumVillage76List");
        ThingList TulumSmallPyramid77List = new ThingList("TulumSmallPyramid77List");
        ThingList Beach78List = new ThingList("Beach78List");
        ThingList Ocean79List = new ThingList("Ocean79List");

        ThingList Trap80List = new ThingList("Trap80List");
        ThingList Jungle81List = new ThingList("Jungle81List");
        ThingList Jungle82List = new ThingList("Jungle82List");
        ThingList UnknownRiver83List = new ThingList("UnknownRiver83List");
        ThingList CenoteDasOjos84List = new ThingList("CenoteDasOjos84List");
        ThingList Jungle85List = new ThingList("Jungle85List");
        ThingList Beach86List = new ThingList("Beach86List");
        ThingList Beach87List = new ThingList("Beach87List");
        ThingList Ocean88List = new ThingList("Ocean88List");
        ThingList Ocean89List = new ThingList("Ocean89List");

        ThingList SavageVillage90List = new ThingList("SavageVillage90List");
        ThingList Jungle91List = new ThingList("Jungle91List");
        ThingList Jungle92List = new ThingList("Jungle92List");
        ThingList UnknownRiver93List = new ThingList("UnknownRiver93List");
        ThingList Jungle94List = new ThingList("Jungle94List");
        ThingList Beach95List = new ThingList("Beach95List");
        ThingList Ocean96List = new ThingList("Ocean96List");
        ThingList Raft97List = new ThingList("Raft97List");
        ThingList Ship98List = new ThingList("Ship98List");
        ThingList Ocean99List = new ThingList("Ocean99List");

        Room CobaPyramid00 = new Room();
        Room CobaAlter01 = new Room();
        Room CobaSouthJungle02 = new Room();
        Room CobaUnknownShrine03 = new Room();
        Room CobaRiverMouth04 = new Room();
        Room Jungle05 = new Room();
        Room Cave06 = new Room();
        Room Jungle07 = new Room();
        Room Jungle08 = new Room();
        Room Jungle09 = new Room();

        Room CobaGameCourt10 = new Room();
        Room CobaSmallPyramid11 = new Room();
        Room Jungle12 = new Room();
        Room Jungle13 = new Room();
        Room CobaRiverCrossing14 = new Room();
        Room Jungle15 = new Room();
        Room Jungle16 = new Room();
        Room Jungle17 = new Room();
        Room Jungle18 = new Room();
        Room EgyptianShip19 = new Room();

        Room Jungle20 = new Room();
        Room Jungle21 = new Room();
        Room Jungle22 = new Room();
        Room Jungle23 = new Room();
        Room CobaRiver24 = new Room();
        Room CobaRiver25 = new Room();
        Room Jungle26 = new Room();
        Room Jungle27 = new Room();
        Room Trap28 = new Room();
        Room Dungeon29 = new Room();

        Room UnknownShrine30 = new Room();
        Room Jungle31 = new Room();
        Room Jungle32 = new Room();
        Room PantherDen33 = new Room();
        Room Jungle34 = new Room();
        Room CobaRiver35 = new Room();
        Room SavageVillage36 = new Room();
        Room Jungle37 = new Room();
        Room Jungle38 = new Room();
        Room Cave39 = new Room();

        Room Jungle40 = new Room();
        Room Trap41 = new Room();
        Room SavageVillage42 = new Room();
        Room Jungle43 = new Room();
        Room Jungle44 = new Room();
        Room Pond45 = new Room();
        Room Jungle46 = new Room();
        Room Jungle47 = new Room();
        Room Jungle48 = new Room();
        Room Trap49 = new Room();

        Room WitchDoctor50 = new Room();
        Room Jungle51 = new Room();
        Room Jungle52 = new Room();
        Room Spring53 = new Room();
        Room UnknownShrine54 = new Room();
        Room Jungle55 = new Room();
        Room Jungle56 = new Room();
        Room PantherDen57 = new Room();
        Room Jungle58 = new Room();
        Room Jungle59 = new Room();

        Room Jungle60 = new Room();
        Room VikingShip61 = new Room();
        Room VikingOutpost62 = new Room();
        Room UnknownRiver63 = new Room();
        Room Jungle64 = new Room();
        Room Jungle65 = new Room();
        Room TulumPyramid66 = new Room();
        Room TulumVillage67 = new Room();
        Room Jungle68 = new Room();
        Room Beach69 = new Room();

        Room Jungle70 = new Room();
        Room Jungle71 = new Room();
        Room Jungle72 = new Room();
        Room UnknownRiver73 = new Room();
        Room Cave74 = new Room();
        Room Jungle75 = new Room();
        Room TulumVillage76 = new Room();
        Room TulumSmallPyramid77 = new Room();
        Room Beach78 = new Room();
        Room Ocean79 = new Room();

        Room Trap80 = new Room();
        Room Jungle81 = new Room();
        Room Jungle82 = new Room();
        Room UnknownRiver83 = new Room();
        Room CenoteDasOjos84 = new Room();
        Room Jungle85 = new Room();
        Room Beach86 = new Room();
        Room Beach87 = new Room();
        Room Ocean88 = new Room();
        Room Ocean89 = new Room();

        Room SavageVillage90 = new Room();
        Room Jungle91 = new Room();
        Room Jungle92 = new Room();
        Room UnknownRiver93 = new Room();
        Room Jungle94 = new Room();
        Room Beach95 = new Room();
        Room Ocean96 = new Room();
        Room Raft97 = new Room();
        Room Ship98 = new Room();
        Room Ocean99 = new Room();

        Thing water = new Thing("fresh water", "fresh drinkable water", null);
        Thing sand = new Thing("sand", "A handful of sand", null);
        Thing moss = new Thing("moss", "A handful of tree moss", null);
        Thing wood = new Thing("wood", "A log of wood", null);
        Thing axe = new Thing("axe", "An axe, constructed from a wooden handle, and a stone blade. For chopping trees", null);
        Thing sword = new Thing("sword", "a sharp Spanish sword", null);
        Thing flint = new Thing("flint", "a piece of flint rock", null);
        Thing spear = new Thing("spear", "A weapon of the natives. A long wooden shaft, and a spear tip made of flint", null);
        Thing seaShell = new Thing("sea shell", "A shell from the sea. Bright and colorful", null);
        Thing egyptianPeice1 = new Thing("Egyptian Tablet bottom left corner", "A portion of an artifact. Could there be more?", null);
        Thing egyptianPeice2 = new Thing("Egyptian Tablet bottom right corner", "A portion of an artifact. Could there be more?", null);
        Thing egyptianPeice3 = new Thing("Egyptian Tablet top left corner", "A portion of an artifact. Could there be more?", null);
        Thing egyptianPeice4 = new Thing("Egyptian Tablet top right corner", "A portion of an artifact. Could there be more?", null);
        Thing nordicPeice1 = new Thing("Nordic etched pole", "A portion of an artifact. Could there be more?", null);
        Thing nordicPeice2 = new Thing("Nordic etched pole", "A portion of an artifact. Could there be more?", null);
        Thing nordicPeice3 = new Thing("Nordic etched blade shard", "A portion of an artifact. Could there be more?", null);
        Thing nordicPeice4 = new Thing("Nordic etched blade shard", "A portion of an artifact. Could there be more?", null);


        //                 Room( name,   description,              N,        S,      W,      E,  [Up], [Down])
        CobaPyramid00.init("The Great Coba Pyramid", "It's beautiful, massive. A step pyramid scraping the sky.", null, CobaAlter01, null, CobaGameCourt10, null, null, CobaPyramid00List);
        CobaAlter01.init("The Alter of Coba", "A Shrine of some kind", CobaPyramid00, CobaSouthJungle02, null, CobaSmallPyramid11, null, null, CobaAlter01List);
        CobaSouthJungle02.init("Jungle", "The foliage is clearing. There appears to be a massive structure to the north.", CobaAlter01, CobaUnknownShrine03, null, Jungle12, null, null, CobaSouthJungle02List);
        CobaUnknownShrine03.init("Unknown Shrine", "A Shrine, but to who? Or what?", CobaSouthJungle02, CobaRiverMouth04, null, Jungle13, null, null, CobaUnknownShrine03List);
        CobaRiverMouth04.init("Coba River Mouth", "The river begins here.", CobaUnknownShrine03, CobaRiverMouth04, null, CobaRiverCrossing14, null, null, CobaRiverMouth04List);
        Jungle05.init("Jungle", "A dense part of the jungle. No westward passage here.", CobaRiverMouth04, Cave06, null, Jungle15, null, null, Jungle05List);
        Cave06.init("Cave", "A dark cave at the western edge of the jungle.", Jungle05, Jungle07, null, Jungle16, null, null, Cave06List);
        Jungle07.init("Jungle", "More Jungle. Can't go west from here.", Cave06, Jungle08, null, Jungle17, null, null, Jungle07List);
        Jungle08.init("Jungle", "Another part of the jungle. Not able to head west from here.", Jungle07, Jungle09, null, Jungle18, null, null, Jungle08List);
        Jungle09.init("Jungle", "More jungle. Very dense. Can't go south. Can't go west.", Jungle08, null, null, EgyptianShip19, null, null, Jungle09List);
        
        CobaGameCourt10.init("Coba Court", "A game court of some kind.", null, CobaSmallPyramid11, CobaPyramid00, Jungle20, null, null, CobaGameCourt10List);
        CobaSmallPyramid11.init("Coba Minor Pyramid", "", CobaGameCourt10, Jungle12, CobaAlter01, Jungle21, null, null, CobaSmallPyramid11List);
        Jungle12.init("Jungle", "The foliage is lightening up. A massive structure rises above the trees to the northwest.", CobaSmallPyramid11, Jungle13, CobaSouthJungle02, Jungle22, null, null, Jungle12List);
        Jungle13.init("Jungle", "More trees and vines everywhere", Jungle12, CobaRiverCrossing14, CobaUnknownShrine03, Jungle23, null, null, Jungle13List);
        CobaRiverCrossing14.init("Coba River Crossing", "", Jungle13, Jungle15, CobaRiverMouth04, CobaRiver24, null, null, CobaRiverCrossing14List);
        Jungle15.init("Jungle", "Thick brush and trees in all directions", CobaRiverCrossing14, Jungle16, Jungle05, CobaRiver25, null, null, Jungle15List);
        Jungle16.init("Jungle", "The vines stretch for forever", Jungle15, Jungle17, Cave06, Jungle26, null, null, Jungle16List);
        Jungle17.init("Jungle", "The area teems with chirping insects and singing birds", Jungle16, Jungle18, Jungle07, Jungle27, null, null, Jungle17List);
        Jungle18.init("Jungle", "The jungle is covered with a variety of trees, from tall and majestic to short and gnarled.", Jungle17, EgyptianShip19, Jungle08, Trap28, null, null, Jungle18List);
        EgyptianShip19.init("A Beached Ship", "An ancient wooden ship, unlike any other. How did it get here.", Jungle18, null, Jungle09, Dungeon29, null, null, EgyptianShip19List);
        
        Jungle20.init("Jungle", "A treacherous forest", null, Jungle21, CobaGameCourt10, UnknownShrine30, null, null, Jungle20List);
        Jungle21.init("Jungle", "The forest is humid and misty", Jungle20, Jungle22, CobaSmallPyramid11, Jungle31, null, null, Jungle21List);
        Jungle22.init("Jungle", "A dense grove of trees and vines", Jungle21, Jungle23, Jungle12, Jungle32, null, null, Jungle22List);
        Jungle23.init("Jungle", "Dense foliage everywhere", Jungle22, CobaRiver24, Jungle13, PantherDen33, null, null, Jungle23List);
        CobaRiver24.init("Coba River", "A river of fresh water. Flowing from the west and turning south here", Jungle23, CobaRiver25, CobaRiverCrossing14, Jungle34, null, null, CobaRiver24List);
        CobaRiver25.init("Coba River", "A river flowing from the north and turning east from here", CobaRiver24, Jungle26, Jungle15, CobaRiver35, null, null, CobaRiver25List);
        Jungle26.init("Jungle", "Dense vegetation covering the ground and climbing up the trees.", CobaRiver25, Jungle27, Jungle16, SavageVillage36, null, null, Jungle26List);
        Jungle27.init("Jungle", "A dense grove of trees and vines", Jungle26, Trap28, Jungle17, Jungle37, null, null, Jungle27List);
        Trap28.init("Trap!", "A pit!", Jungle27, Dungeon29, Jungle18, Jungle38, null, null, Trap28List);
        Dungeon29.init("A Dungeon", "", Trap28, null, EgyptianShip19, Cave39, null, null, Dungeon29List);
        
        UnknownShrine30.init("A Shrine", "", null, Jungle31, Jungle20, Jungle40, null, null, UnknownShrine30List);
        Jungle31.init("Jungle", "The area teems with chirping insects and singing birds", UnknownShrine30, Jungle32, Jungle21, Trap41, null, null, Jungle31List);
        Jungle32.init("Jungle", "A forest with a wide variety of plants and animals", Jungle31, PantherDen33, Jungle22, SavageVillage42, null, null, Jungle32List);
        PantherDen33.init("Panther Den!", "", Jungle32, Jungle34, Jungle23, Jungle43, null, null, PantherDen33List);
        Jungle34.init("Jungle", "A lush, green landscape filled with towering trees and vines", PantherDen33, CobaRiver35, CobaRiver24, Jungle44, null, null, Jungle34List);
        CobaRiver35.init("Coba River", "", Jungle34, SavageVillage36, CobaRiver25, Pond45, null, null, CobaRiver35List);
        SavageVillage36.init("Savage Village", "Savages! Best get away quickly", CobaRiver35, Jungle37, Jungle26, Jungle46, null, null, SavageVillage36List);
        Jungle37.init("Jungle", "The sun filters through the canopy in dappled shafts of light", SavageVillage36, Jungle38, Jungle27, Jungle47, null, null, Jungle37List);
        Jungle38.init("Jungle", "The ground is soft and wet. The trees tower over head", Jungle37, Cave39, Trap28, Jungle48, null, null, Jungle38List);
        Cave39.init("Cave", "", Jungle38, null, Dungeon29, Trap49, null, null, Cave39List);
        
        Jungle40.init("Jungle", "A dense grove of trees and vines", null, Trap41, UnknownShrine30, WitchDoctor50, null, null, Jungle40List);
        Trap41.init("Trap!", "Look out! A net springs fromo the ground up into the trees!", Jungle40, SavageVillage42, Jungle31, Jungle51, null, null, Trap41List);
        SavageVillage42.init("Savage Village!", "", Trap41, Jungle43, Jungle32, Jungle52, null, null, SavageVillage42List);
        Jungle43.init("Jungle", "A forest with a thick underbrush and tangled vines.", SavageVillage42, Jungle44, PantherDen33, Spring53, null, null, Jungle43List);
        Jungle44.init("Jungle", "The canopy blocks out much of the sunlight", Jungle43, Pond45, Jungle34, UnknownShrine54, null, null, Jungle44List);
        Pond45.init("Pond", "A beautiful and isolated source of fresh water", Jungle44, Jungle46, CobaRiver35, Jungle55, null, null, Pond45List);
        Jungle46.init("Jungle", "Thick brush and trees in all directions", Pond45, Jungle47, SavageVillage36, Jungle56, null, null, Jungle46List);
        Jungle47.init("Jungle", "A treacherous forest", Jungle46, Jungle48, Jungle37, PantherDen57, null, null, Jungle47List);
        Jungle48.init("Jungle", "Soft, spongy ground covered in organic matter.", Jungle47, Trap49, Jungle38, Jungle58, null, null, Jungle48List);
        Trap49.init("Trap!", "Ah!! A massive log swings down from the trees!", Jungle48, null, Cave39, Jungle59, null, null, Trap49List);
        
        WitchDoctor50.init("Witch Doctor's Hut", "", null, Jungle51, Jungle40, Jungle60, null, null, WitchDoctor50List);
        Jungle51.init("Jungle", "Dense vegetation covering the ground and climbing up the trees.", WitchDoctor50, Jungle52, Trap41, VikingShip61, null, null, Jungle51List);
        Jungle52.init("Jungle", "A lush, green landscape filled with towering trees and vines", Jungle51, Spring53, SavageVillage42, VikingOutpost62, null, null, Jungle52List);
        Spring53.init("Nature Spring", "", Jungle52, UnknownShrine54, Jungle43, UnknownRiver63, null, null, Spring53List);
        UnknownShrine54.init("A Shrine", "A shrine stands alone in the jungle", Spring53, Jungle55, Jungle44, Jungle64, null, null, UnknownShrine54List);
        Jungle55.init("Jungle", "More trees and vines everywhere", UnknownShrine54, Jungle56, Pond45, Jungle65, null, null, Jungle55List);
        Jungle56.init("Jungle", "Soft, spongy ground covered in organic matter.", Jungle55, PantherDen57, Jungle46, TulumPyramid66, null, null, Jungle56List);
        PantherDen57.init("Pather Den!", "", Jungle56, Jungle58, Jungle47, TulumVillage67, null, null, PantherDen57List);
        Jungle58.init("Jungle", "A thick canopy that blocks out much of the sunlight", PantherDen57, Jungle59, Jungle48, Jungle68, null, null, Jungle58List);
        Jungle59.init("Jungle", "A jungle with a wide variety of plants and animals.", Jungle58, null, Trap49, Beach69, null, null, Jungle59List);
        
        Jungle60.init("Jungle", "Soft, spongy ground covered in organic matter.", null, VikingShip61, WitchDoctor50, Jungle70, null, null, Jungle60List);
        VikingShip61.init("A Beached Ship", "", Jungle60, VikingOutpost62, Jungle51, Jungle71, null, null, VikingShip61List);
        VikingOutpost62.init("Ruined Outpost", "", VikingShip61, UnknownRiver63, Jungle52, Jungle72, null, null, VikingOutpost62List);
        UnknownRiver63.init("Unknown River", "", VikingOutpost62, Jungle64, Spring53, UnknownRiver73, null, null, UnknownRiver63List);
        Jungle64.init("Jungle", "A treacherous forest", UnknownRiver63, Jungle65, UnknownShrine54, Cave74, null, null, Jungle64List);
        Jungle65.init("Jungle", "", Jungle64, TulumPyramid66, Jungle55, Jungle75, null, null, Jungle65List);
        TulumPyramid66.init("Tulum Pyramid", "An architectural wonder. Who built it?", Jungle65, TulumVillage67, Jungle56, TulumVillage76, null, null, TulumPyramid66List);
        TulumVillage67.init("Tulum Village", "A village, long deserted. Where is everyone?", TulumPyramid66, Jungle68, PantherDen57, TulumSmallPyramid77, null, null, TulumVillage67List);
        Jungle68.init("Jungle", "A jungle with a thick underbrush and tangled vines.", TulumVillage67, Beach69, Jungle58, Beach78, null, null, Jungle68List);
        Beach69.init("Beach", "", Jungle68, null, Jungle59, Ocean79, null, null, Beach69List);
        
        Jungle70.init("Jungle", "The ground is soft and wet. The trees tower over head", null, Jungle71, Jungle60, Trap80, null, null, Jungle70List);
        Jungle71.init("Jungle", "Muddy, waterlogged ground", Jungle70, Jungle72, VikingShip61, Jungle81, null, null, Jungle71List);
        Jungle72.init("Jungle", "A forest with a wide variety of plants and animals.", Jungle71, UnknownRiver73, VikingOutpost62, Jungle82, null, null, Jungle72List);
        UnknownRiver73.init("Unknown River", "", Jungle72, Cave74, UnknownRiver63, UnknownRiver83, null, null, UnknownRiver73List);
        Cave74.init("Cave", "", UnknownRiver73, Jungle75, Jungle64, CenoteDasOjos84, null, null, Cave74List);
        Jungle75.init("Jungle", "A dense grove of trees and vines", Cave74, TulumVillage76, Jungle65, Jungle85, null, null, Jungle75List);
        TulumVillage76.init("Tulum Village", "", Jungle75, TulumSmallPyramid77, TulumPyramid66, Beach86, null, null, TulumVillage76List);
        TulumSmallPyramid77.init("Small Pyramid of Tulum", "", TulumVillage76, Beach78, TulumVillage67, Beach87, null, null, TulumSmallPyramid77List);
        Beach78.init("Beach", "The sand is coarse and rough and it gets everywhere", TulumSmallPyramid77, Ocean79, Jungle68, Ocean88, null, null, Beach78List);
        Ocean79.init("Ocean", "Sea as far as the eye can see", Beach78, null, Beach69, Ocean89, null, null, Ocean79List);

        Trap80.init("Trap!", "", null, Jungle81, Jungle70, SavageVillage90, null, null, Trap80List);
        Jungle81.init("Jungle", "A lush, green landscape filled with towering trees and vines", Trap80, Jungle82, Jungle71, Jungle91, null, null, Jungle81List);
        Jungle82.init("Jungle", "Dense foliage all around", Jungle81, UnknownRiver83, Jungle72, Jungle92, null, null, Jungle82List);
        UnknownRiver83.init("Unknown River", "", Jungle82, CenoteDasOjos84, UnknownRiver73, UnknownRiver93, null, null, UnknownRiver83List);
        CenoteDasOjos84.init("Cenote Das Ojos", "", UnknownRiver83, Jungle85, Cave74, Jungle94, null, null, CenoteDasOjos84List);
        Jungle85.init("Jungle", "a thick canopy that blocks out much of the sunlight", CenoteDasOjos84, Beach86, Jungle75, Beach95, null, null, Jungle85List);
        Beach86.init("Beach", "More sand and shore stretching up the coast", Jungle85, Beach87, TulumVillage76, Ocean96, null, null, Beach86List);
        Beach87.init("Beach", "The arrival point", Beach86, Ocean88, TulumSmallPyramid77, Raft97, null, null, Beach87List);
        Ocean88.init("Open Ocean", "A vast expanse of saltwater.", Beach87, Ocean89, Beach78, Ship98, null, null, Ocean88List);
        Ocean89.init("Open Ocean", "Constant movement of waves and currents", Ocean89, null, Ocean79, Ocean99, null, null, Ocean89List);

        SavageVillage90.init("Savage Village", "Natives. Savage!", null, Jungle91, Trap80, null, null, null, SavageVillage90List);
        Jungle91.init("Jungle", "Foliage everywhere. Can't pass eastward from here.", SavageVillage90, Jungle92, Jungle81, null, null, null, Jungle91List);
        Jungle92.init("Jungle", "Intense jungle environment. Best to keep moving, but can't go east.", Jungle91, UnknownRiver93, Jungle82, null, null, null, Jungle92List);
        UnknownRiver93.init("Unknown River", "A river without a name appears to end here.", Jungle92, Jungle94, UnknownRiver83, null, null, null, UnknownRiver93List);
        Jungle94.init("Jungle", "The sun filters through the canopy in dappled shafts of light", UnknownRiver93, Beach95, CenoteDasOjos84, null, null, null, Jungle94List);
        Beach95.init("Beach", "A lush, green landscape filled with towering trees and vines", Jungle94, Ocean96, Jungle85, null, null, null, Beach95List);
        Ocean96.init("Ocean", "", Beach95, Raft97, Beach86, null, null, null, Ocean96List);
        Raft97.init("The Raft", "This raft will get back to the expedition ship", Ocean96, Ship98, Beach87, null, null, null, Raft97List);
        Ship98.init("The Expedition Ship", "Finally! The ship we arrived on its time to go home", Raft97, Ocean99, Ocean88, null, null, null, Ship98List);
        Ocean99.init("Open Ocean", "Salty sea in all  directions", Ship98, null, Ocean89, null, null, null, Ocean99List);

        map.add(CobaPyramid00);
        map.add(CobaAlter01);
        map.add(CobaSouthJungle02);
        map.add(CobaUnknownShrine03);
        map.add(CobaRiverMouth04);
        map.add(Jungle05);
        map.add(Cave06);
        map.add(Jungle07);
        map.add(Jungle08);
        map.add(Jungle09);

        map.add(CobaGameCourt10);
        map.add(CobaSmallPyramid11);
        map.add(Jungle12);
        map.add(Jungle13);
        map.add(CobaRiverCrossing14);
        map.add(Jungle15);
        map.add(Jungle16);
        map.add(Jungle17);
        map.add(Jungle18);
        map.add(EgyptianShip19);

        map.add(Jungle20);
        map.add(Jungle21);
        map.add(Jungle22);
        map.add(Jungle23);
        map.add(CobaRiver24);
        map.add(CobaRiver25);
        map.add(Jungle26);
        map.add(Jungle27);
        map.add(Trap28);
        map.add(Dungeon29);

        map.add(UnknownShrine30);
        map.add(Jungle31);
        map.add(Jungle32);
        map.add(PantherDen33);
        map.add(Jungle34);
        map.add(CobaRiver35);
        map.add(SavageVillage36);
        map.add(Jungle37);
        map.add(Jungle38);
        map.add(Cave39);

        map.add(Jungle40);
        map.add(Trap41);
        map.add(SavageVillage42);
        map.add(Jungle43);
        map.add(Jungle44);
        map.add(Pond45);
        map.add(Jungle46);
        map.add(Jungle47);
        map.add(Jungle48);
        map.add(Trap49);

        map.add(WitchDoctor50);
        map.add(Jungle51);
        map.add(Jungle52);
        map.add(Spring53);
        map.add(UnknownShrine54);
        map.add(Jungle55);
        map.add(Jungle56);
        map.add(PantherDen57);
        map.add(Jungle58);
        map.add(Jungle59);

        map.add(Jungle60);
        map.add(VikingShip61);
        map.add(VikingOutpost62);
        map.add(UnknownRiver63);
        map.add(Jungle64);
        map.add(Jungle65);
        map.add(TulumPyramid66);
        map.add(TulumVillage67);
        map.add(Jungle68);
        map.add(Beach69);

        map.add(Jungle70);
        map.add(Jungle71);
        map.add(Jungle72);
        map.add(UnknownRiver73);
        map.add(Cave74);
        map.add(Jungle75);
        map.add(TulumVillage76);
        map.add(TulumSmallPyramid77);
        map.add(Beach78);
        map.add(Ocean79);

        map.add(Trap80);
        map.add(Jungle81);
        map.add(Jungle82);
        map.add(UnknownRiver83);
        map.add(CenoteDasOjos84);
        map.add(Jungle85);
        map.add(Beach86);
        map.add(Beach87);
        map.add(Ocean88);
        map.add(Ocean89);

        map.add(SavageVillage90);
        map.add(Jungle91);
        map.add(Jungle92);
        map.add(UnknownRiver93);
        map.add(Jungle94);
        map.add(Beach95);
        map.add(Ocean96);
        map.add(Raft97);
        map.add(Ship98);
        map.add(Ocean99);

        // create player and set location
        player = new Actor("player", "The Spaniard", playerlist, Beach87);
        captainBarbossa = new Actor("Captain Barbossa", "Captain of the Spanish Expedition", null, Beach87);
        //beachConquistedor1
        //beachConquistedor2
        theAntaginist = new Actor("The Antginist", "A mysterious man without a name", null, Beach87);
        //beachSavage1
        //beachSavage2
        //Alligator1
        //Panther1
        //Panther2

    }

    // access methods     

    public String putObInContainer(String obname, String containername) {
        return player.putInto(obname, containername);
    }

    public String openOb(String obname) {
        return player.openOb(obname);
    }

    public String closeOb(String obname) {
        return player.closeOb(obname);
    }

    String takeOb(String obname) {
        String retStr;
        
        retStr = player.take(obname);
        return retStr;
    }

    String dropOb(String obname) {
        String retStr;
        
        retStr = player.drop(obname);
        return retStr;
    }

    void movePlayerTo(Dir dir) {                
        if (player.moveTo(dir)) {
            look();            
        } else {
            showStr("No Exit!");
        }
    }

    void goN() {
        movePlayerTo(Dir.NORTH);
    }

    void goS() {
        movePlayerTo(Dir.SOUTH);
    }

    void goW() {
        movePlayerTo(Dir.WEST);
    }

    void goE() {
        movePlayerTo(Dir.EAST);
    }

    void goUp() {
        movePlayerTo(Dir.UP);
    }

    void goDown() {
        movePlayerTo(Dir.DOWN);
    }

    void look() {
        showStr("You are in the " + player.describeLocation());
    }

    // utility method to display string if not empty
    // stripping any trailing newlines
    void showStr(String s) {
        if (s.endsWith("\n")) {
            s = s.substring(0, s.length() - 1);
        }
        if (!s.isEmpty()) {
            try {
                printWithDelays(s, TimeUnit.MILLISECONDS, 50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printWithDelays(String data, TimeUnit unit, long delay)
    throws InterruptedException {
        for (char ch:data.toCharArray()) {
            System.out.print(ch);
            unit.sleep(delay);
        }
        System.out.println();
    }
    void showInventory() {
        showStr(player.inventory());
    }

    String lookAtOb(String obname) {
        return player.lookAt(obname);
    }

    String lookInOb(String obname) {
        return player.lookIn(obname);
    }

    public void showIntro() {
        String s;
        String intro;


        intro = "Welcome to\n"
                + "FORGOTTEN CONQUEST\n"
                + "\n"
                + "1519 A.D.\n"

                + "Enter: n, s, w, e, up, down\n"
                + "or q to quit.";
        showStr(intro);
        look();
    }

    public String runCommand(String inputstr) {
        List<String> wordlist;
        String s;
        String lowstr;

        s = "ok";
        lowstr = inputstr.trim().toLowerCase();
        
        if (!lowstr.equals("q")) {
            if (lowstr.equals("")) {
                s = "You must enter a command";
            } else {
                wordlist = Parser.wordList(lowstr);
                s = Parser.parseCommand(wordlist);
            }
        }
        return s;
    }

    // Test..... BEGIN
    void showTest(String s) {
        showStr("> " + s);
        showStr(runCommand(s));

    }

    void test() {
        // utility method to let me try out bits of code while developing the game            
        showStr("---BEGIN TEST---");
        //  showThingsInRoom(); // this works ok when no objects are in containers
        showTest("get carrot");
        showTest("get bowl");
        showTest("get sack");
        showTest("get box");
        showTest("put carrot in bowl");
        showTest("put bowl in sack");
        showTest("put sack in box");
        showTest("put box in bowl");
        showTest("put sack in bowl");
        showTest("put carrot in box");
        showTest("i");
        showStr("---END TEST---");

    }
    // Test..... END

}
