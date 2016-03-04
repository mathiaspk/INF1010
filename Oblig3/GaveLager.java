// 2014.02.06: Fjernet "nasjonale" tegn

public class GaveLager { 
    static private int ANTALLGAVER = 259;
    private Gave [] gaver;
    private int nesteGaveNr = 0;

    GaveLager() {
	gaver = new Gave[ANTALLGAVER];

	gaver[0] = new Bok("William Faulkner: Absalom, Absalom!");
	gaver[1] = new Vin("Badia a Coltibuono Toscana Cancelli, 2011");
	gaver[2] = new Bok("Aldous Huxley: After Many a Summer Dies the Swan");
	gaver[3] = new Bok("Eugene O'Neill: Ah, Wilderness!");
	gaver[4] = new Bok("Sidney Howard: Alien Corn");
	gaver[5] = new Bok("W. Somerset Maugham: The Alien Corn");
	gaver[6] = new Bok("Vita Sackville-West: All Passion Spent");
	gaver[7] = new Bok("Robert Penn Warren: All the King's Men");
	gaver[8] = new Bok("Michael Morpurgo: Alone on a Wide, Wide Sea");
	gaver[9] = new Plate ("Madonna: The Immaculate Collection");
	gaver[10] = new Bok("Aldous Huxley: Antic Hay");
	gaver[11] = new Plate ("Michael Jackson: Thriller");
	gaver[12] = new Bok("George Bernard Shaw: Arms and the Man");
	gaver[13] = new Plate ("Michael Jackson: Dangerous");
	gaver[14] = new Bok("John Grisham: A Time to Kill");
	gaver[15] = new Plate ("Santana: Supernatural");
	gaver[16] = new Bok("Val McDermid: Beneath the Bleeding");
	gaver[17] = new Plate ("Guns N' Roses: Appetite for Destruction");
	gaver[18] = new Bok("Noel Coward: Blithe Spirit");
	gaver[19] = new Plate ("Carole King: Tapestry");
	gaver[20] = new Bok("Francoise Sagan: Bonjour Tristesse");
	gaver[21] = new Bok("Colin Wilson: Brandy of the Damned");
	gaver[22] = new Bok("Dee Brown: Bury My Heart at Wounded Knee");
	gaver[23] = new Bok("Agatha Christie: Butter In a Lordly Dish");
	gaver[24] = new Bok("O. Henry: Cabbages and Kings");
	gaver[25] = new Bok("Dan Simmons: Carrion Comfort");
	gaver[26] = new Bok("Robert B. Parker: A Catskill Eagle");
	gaver[27] = new Bok("Dorothy L. Sayers: Clouds of Witness");
	gaver[28] = new Bok("John Kennedy Toole: A Confederacy of Dunces");
	gaver[29] = new Bok("Iain M. Banks: Consider Phlebas");
	gaver[30] = new Bok("Iain Crichton Smith: Consider the Lilies");
	gaver[31] = new Bok("P. D. James: Cover Her Face");
	gaver[32] = new Bok("Charles Dickens: The Cricket on the Hearth");
	gaver[33] = new Bok("Mark Haddon: The Curious Incident of the Dog in the Night-Time");
	gaver[34] = new Bok("H. E. Bates: The Daffodil Sky");
	gaver[35] = new Bok("Haruki Murakami: Dance Dance Dance");
	gaver[36] = new Bok("Philip Reeve: A Darkling Plain");
	gaver[37] = new Bok("John Gunther: Death Be Not Proud");
	gaver[38] = new Bok("Aldous Huxley: The Doors of Perception");
	gaver[39] = new Bok("David Graham: Down to a Sunless Sea");
	gaver[40] = new Bok("Wilfred Owen: Dulce et Decorum Est");
	gaver[41] = new Bok("George R. R. Martin: Dying of the Light");
	gaver[42] = new Bok("John Steinbeck: East of Eden");
	gaver[43] = new Bok("William Butler Yeats: Ego Dominus Tuus");
	gaver[44] = new Bok("Agatha Christie: Endless Night");
	gaver[45] = new Bok("Jonathan Safran Foer: Everything is Illuminated");
	gaver[46] = new Bok("Aldous Huxley: Eyeless in Gaza");
	gaver[47] = new Bok("H. E. Bates: Fair Stood the Wind for France");
	gaver[48] = new Bok("Howard Spring: Fame Is the Spur");
	gaver[49] = new Bok("Edna O'Brien: A Fanatic Heart");
	gaver[50] = new Bok("Katharine Hull and Pamela Whitlock: The Far-Distant Oxus");
	gaver[51] = new Bok("Ernest Hemingway: A Farewell to Arms");
	gaver[52] = new Bok("Thomas Hardy: Far From the Madding Crowd");
	gaver[53] = new Vin("A.A. Badenhorst Family Swartland, 2009");
	gaver[54] = new Bok("Roger Zelazny: For a Breath I Tarry");
	gaver[55] = new Bok("Ernest Hemingway: For Whom the Bell Tolls");
	gaver[56] = new Bok("James Jones: From Here to Eternity");
	gaver[57] = new Bok("Barbara Pym: A Glass of Blessings");
	gaver[58] = new Bok("William Manchester: The Glory and the Dream");
	gaver[59] = new Bok("Ray Bradbury: The Golden Apples of the Sun");
	gaver[60] = new Bok("Henry James: The Golden Bowl");
	gaver[61] = new Bok("Margaret Mitchell: Gone with the Wind");
	gaver[62] = new Bok("John Steinbeck: The Grapes of Wrath");
	gaver[63] = new Bok("John Crowley: Great Work of Time");
	gaver[64] = new Bok("Louis Bromfield: The Green Bay Tree");
	gaver[65] = new Bok("Evelyn Waugh: A Handful of Dust");
	gaver[66] = new Bok("Dorothy L. Sayers: Have His Carcase");
	gaver[67] = new Bok("Carson McCullers: The Heart Is a Lonely Hunter");
	gaver[68] = new Bok("JT LeRoy: The Heart Is Deceitful Above All Things");
	gaver[69] = new Bok("Philip Pullman: His Dark Materials");
	gaver[70] = new Bok("Edith Wharton: The House of Mirth");
	gaver[71] = new Bok("H. E. Bates: How Sleep the Brave");
	gaver[72] = new Bok("James H. Hunter: How Sleep the Brave");
	gaver[73] = new Bok("John Briley: How Sleep the Brave");
	gaver[74] = new Bok("William Faulkner: If I Forget Thee Jerusalem");
	gaver[75] = new Bok("Primo Levi: If Not Now, When?");
	gaver[76] = new Bok("David Weber & Steve White: In Death Ground");
	gaver[77] = new Bok("John Steinbeck: In Dubious Battle");
	gaver[78] = new Bok("Maya Angelou: I Know Why the Caged Bird Sings");
	gaver[79] = new Bok("Peter Robinson: In a Dry Season");
	gaver[80] = new Vin("Mastroberardino Taurasi Radici Riserva, 2006");
	gaver[81] = new Bok("Ray Bradbury: I Sing the Body Electric");
	gaver[82] = new Bok("Robert A. Heinlein: I Will Fear No Evil");
	gaver[83] = new Bok("Katherine Paterson: Jacob Have I Loved");
	gaver[84] = new Bok("Dominique Lapierre and Larry Collins: O Jerusalem!");
	gaver[85] = new Bok("Aldous Huxley: Jesting Pilate");
	gaver[86] = new Bok("Val McDermid: The Last Temptation");
	gaver[87] = new Bok("Ursula K. Le Guin: The Lathe of Heaven");
	gaver[88] = new Bok("James Agee: Let Us Now Praise Famous Men");
	gaver[89] = new Bok("William Edmund Barrett: Lilies of the Field");
	gaver[90] = new Bok("Conor McPherson: This Lime Tree Bower");
	gaver[91] = new Bok("Alan Hollinghurst: The Line of Beauty");
	gaver[92] = new Bok("Lillian Hellman: The Little Foxes");
	gaver[93] = new Bok("Dan Rhodes: Little Hands Clapping");
	gaver[94] = new Bok("Thomas Wolfe: Look Homeward, Angel");
	gaver[95] = new Bok("Iain M. Banks: Look to Windward");
	gaver[96] = new Bok("Madeleine L'Engle: Many Waters");
	gaver[97] = new Bok("Han Suyin: A Many-Splendoured Thing");
	gaver[98] = new Bok("Val McDermid: The Mermaids Singing");
	gaver[99] = new Bok("Agatha Christie: The Mirror Crack'd from Side to Side");
	gaver[100] = new Bok("Stephen Fry: Moab Is My Washpot");
	gaver[101] = new Bok("Robert Crais: The Monkey's Raincoat");
	gaver[102] = new Bok("Laurie R. King: A Monstrous Regiment of Women");
	gaver[103] = new Bok("Madeleine L'Engle: The Moon by Night");
	gaver[104] = new Bok("Kurt Vonnegut: Mother Night");
	gaver[105] = new Bok("Agatha Christie: The Moving Finger");
	gaver[106] = new Bok("John Buchan: Mr Standfast");
	gaver[107] = new Bok("Kamala Markandaya: Nectar in a Sieve");
	gaver[108] = new Bok("Cormac McCarthy: No Country for Old Men");
	gaver[109] = new Bok("Nevil Shute: No Highway");
	gaver[110] = new Vin("Carlisle Zinfandel Napa Valley Hayne Vineyard, 2011");
	gaver[111] = new Bok("Chinua Achebe: No Longer at Ease");
	gaver[112] = new Bok("H. E. Bates: Now Sleeps the Crimson Petal");
	gaver[113] = new Bok("Lois Lowry: Number the Stars");
	gaver[114] = new Bok("W. Somerset Maugham: Of Human Bondage");
	gaver[115] = new Bok("John Steinbeck: Of Mice and Men");
	gaver[116] = new Bok("H. E. Bates: Oh! To be in England");
	gaver[117] = new Vin("Raymond Cabernet Sauvignon Napa Valley Generations, 2009");
	gaver[118] = new Bok("W. Somerset Maugham: The Painted Veil");
	gaver[119] = new Bok("Robert B. Parker: Pale Kings and Princes");
	gaver[120] = new Bok("Paul Kennedy: The Parliament of Man");
	gaver[121] = new Bok("Humphrey Cobb: Paths of Glory");
	gaver[122] = new Bok("E. M. Forster: A Passage to India");
	gaver[123] = new Bok("Willa Cather: O Pioneers!");
	gaver[124] = new Bok("Agatha Christie: Postern of Fate");
	gaver[125] = new Bok("Mary Webb: Precious Bane");
	gaver[126] = new Bok("Isaac Asimov: The Proper Study");
	gaver[127] = new Bok("Henryk Sienkiewicz: Quo Vadis");
	gaver[128] = new Bok("Reginald Hill: Recalled to Life");
	gaver[129] = new Bok("Robert Silverberg: Recalled to Life");
	gaver[130] = new Bok("Gavin Maxwell: Ring of Bright Water");
	gaver[131] = new Bok("M. Scott Peck: The Road Less Traveled");
	gaver[132] = new Bok("William Faulkner: Shall not Perish");
	gaver[133] = new Bok("P. D. James: The Skull Beneath the Skin");
	gaver[134] = new Bok("Anthony Powell: The Soldier's Art");
	gaver[135] = new Bok("Rex Stout: Some Buried Caesar");
	gaver[136] = new Bok("Michael Cunningham: Specimen Days");
	gaver[137] = new Bok("Stephen Fry: The Stars' Tennis Balls");
	gaver[138] = new Bok("Robert A. Heinlein: Stranger in a Strange Land");
	gaver[139] = new Bok("George Orwell: Such, Such Were the Joys");
	gaver[140] = new Bok("Ernest Hemingway: The Sun Also Rises");
	gaver[141] = new Bok("C. S. Lewis: Surprised by Joy");
	gaver[142] = new Bok("Madeleine L'Engle: A Swiftly Tilting Planet");
	gaver[143] = new Bok("Robert B. Parker: Taming a Sea Horse");
	gaver[144] = new Bok("F. Scott Fitzgerald: Tender Is the Night");
	gaver[145] = new Bok("Bruce Catton: Terrible Swift Sword");
	gaver[146] = new Bok("NJ Crisp: That Good Night");
	gaver[147] = new Vin("Le Macchiole Bolgheri, 2011");
	gaver[148] = new Bok("F. Scott Fitzgerald: This Side of Paradise");
	gaver[149] = new Vin("Seghesio Zinfandel Dry Creek Valley Cortina, 2010");
	gaver[150] = new Bok("Aldous Huxley: Those Barren Leaves");
	gaver[151] = new Vin("Epoch Estate Blend Paderewski Vineyard Paso Robles, 2010");
	gaver[152] = new Bok("Alfred Bester: Tiger! Tiger!");
	gaver[153] = new Vin("Cune Rioja Imperial Gran Reserva, 2004");
	gaver[154] = new Bok("Patrick Leigh Fermor: A Time of Gifts");
	gaver[155] = new Vin("Domaine Serene Pinot Noir Willamette Valley Evenstad Reserve, 2010");
	gaver[156] = new Bok("Lawrence Block: Time To Murder And Create");
	gaver[157] = new Vin("Kongsgaard Chardonnay Napa Valley, 2010");
	gaver[158] = new Vin("Hewitt Cabernet Sauvignon Rutherford, 2010");
	gaver[159] = new Bok("Robert A. Heinlein: To Sail Beyond the Sunset");
	gaver[160] = new Bok("Connie Willis: To Say Nothing of the Dog");
	gaver[161] = new Vin("Graham Tawny Port 20 Year Old");
	gaver[162] = new Bok("William Makepeace Thackeray: Vanity Fair");
	gaver[163] = new Vin("Reynvaan Syrah Walla Walla Valley Stonessence, 2010");
	gaver[164] = new Bok("Flannery O'Connor: The Violent Bear It Away");
	gaver[165] = new Vin("Croft Vintage Port, 2011");
	gaver[166] = new Bok("T. S. Eliot: The Waste Land");
	gaver[167] = new Vin("Olivier Ravoire Gigondas, 2011");
	gaver[168] = new Bok("Colin Dexter: The Way Through the Woods");
	gaver[169] = new Vin("Alexana Pinot Noir Dundee Hills Revana Vineyard, 2010");
	gaver[170] = new Bok("Anthony Powell: What's Become of Waring");
	gaver[171] = new Vin("Hamilton Russell Chardonnay Hemel-en-Aarde Valley, 2012");
	gaver[172] = new Bok("E. M. Forster: Where Angels Fear to Tread");
	gaver[173] = new Bok("Chinua Achebe: Things Fall Apart");
	gaver[174] = new Bok("Henry James: The Wings of the Dove");
	gaver[175] = new Bok("Val McDermid: The Torment of Others");
	gaver[176] = new Bok("Mary Elizabeth Braddon: The World, the Flesh and the Devil");
	gaver[177] = new Bok("Dorothy L. Sayers: Thrones, Dominations");
	gaver[178] = new Bok("Rudyard Kipling short story: Tiger! Tiger!");
	gaver[179] = new Vin("Fontanafredda Barolo La Rosa, 2008");
	gaver[180] = new Bok("Stephen Gray: Time of our Darkness");
	gaver[181] = new Bok("John Steinbeck: To a God Unknown");
	gaver[182] = new Bok("Jessica Anderson: Tirra Lirra by the River");
	gaver[183] = new Vin("Giuseppe Mascarello & Figlio Barolo Monprivato, 2008");
	gaver[184] = new Vin("Wynns Coonawarra Estate Cabernet Sauvignon Coonawarra Black Label, 2010");
	gaver[185] = new Vin("Caymus Cabernet Sauvignon Napa Valley Special Selection, 2010");
	gaver[186] = new Vin("Lewis Cabernet Sauvignon Napa Valley Reserve, 2010");
	gaver[187] = new Vin("Quilceda Creek Cabernet Sauvignon Columbia Valley, 2010");
	gaver[188] = new Bok("Evelyn Waugh: Vile Bodies");
	gaver[189] = new Vin("Turley Zinfandel Paso Robles Dusi Vineyard, 2011");
	gaver[190] = new Bok("J.M. Coetzee: Waiting for the Barbarians");
	gaver[191] = new Vin("Bedrock The Bedrock Heritage Sonoma Valley, 2011");
	gaver[192] = new Bok("Samuel Butler: The Way of All Flesh");
	gaver[193] = new Vin("G.D. Vajra Barolo Albe, 2008");
	gaver[194] = new Bok("Adam Smith: The Wealth of Nations");
	gaver[195] = new Vin("Poggerino Chianti Classico, 2010");
	gaver[196] = new Bok("H. E. Bates: When the Green Woods Laugh");
	gaver[197] = new Plate ("Shania Twain: Come On Over");
	gaver[198] = new Bok("Robert B. Parker: The Widening Gyre");
	gaver[199] = new Vin("Mamete Prevostini Valtellina Superiore Sassella, 2009");
	gaver[200] = new Bok("Susan Swan: The Wives of Bath");
	gaver[201] = new Vin("Livio Sassetti Brunello di Montalcino Pertimali, 2008");
	gaver[202] = new Bok("H. E. Bates: The Yellow Meads of Asphodel");
	gaver[203] = new Vin("Quinta do Crasto Douro Reserva Old Vines, 2010");
	gaver[204] = new Vin("Spring Valley Uriah Walla Walla Valley, 2010");
	gaver[205] = new Vin("Domaine Overnoy-Crinquand Arbois Pupillin Vieilles Vignes, 2009");
	gaver[206] = new Plate ("The Beatles: Abbey Road");
	gaver[207] = new Plate ("Bruce Springsteen: Born in the U.S.A.");
	gaver[208] = new Plate ("Celine Dion: Falling into You");
	gaver[209] = new Plate ("Celine Dion: Let's Talk About Love");
	gaver[210] = new Plate ("Dire Straits: Brothers in Arms");
	gaver[211] = new Plate ("Whitney Houston: Whitney Houston");
	gaver[212] = new Vin("M. Lapierre Morgon, 2011");
	gaver[213] = new Vin("Bodega Norton Malbec Mendoza Reserva, 2011");
	gaver[214] = new Vin("Quinta do Passadouro Douro, 2010");
	gaver[215] = new Vin("Mollydooker Two Left Feet McLaren Vale, 2011");
	gaver[216] = new Plate ("Pink Floyd: The Dark Side of the Moon");
	gaver[217] = new Plate ("Eagles: Their Greatest Hits (1971-1975)");
	gaver[218] = new Plate ("AC/DC: Back in Black");
	gaver[219] = new Plate ("Bee Gees: Saturday Night Fever");
	gaver[220] = new Plate ("Fleetwood Mac: Rumours");
	gaver[221] = new Plate ("Whitney Houston: The Bodyguard");
	gaver[222] = new Vin("Pierre Paillard Brut Champagne");
	gaver[223] = new Plate ("Led Zeppelin: Led Zeppelin IV");
	gaver[224] = new Plate ("Meat Loaf: Bat Out of Hell");
	gaver[225] = new Plate ("Alanis Morissette: Jagged Little Pill");
	gaver[226] = new Plate ("The Beatles: Sgt. Pepper's Lonely Hearts Club Band");
	gaver[227] = new Plate ("Eagles: Hotel California");
	gaver[228] = new Plate ("Mariah Carey: Music Box");
	gaver[229] = new Plate ("Various artists: Dirty Dancing");
	gaver[230] = new Plate ("Elton John: Goodbye Yellow Brick Road");
	gaver[231] = new Vin("Mamete Prevostini Valtellina Superiore Sassella, 2009");
	gaver[232] = new Vin("Lagier Meredith Syrah Mount Veeder, 2010");
	gaver[233] = new Vin("Patz & Hall Pinot Noir Carneros Hyde Vineyard, 2010");
	gaver[234] = new Vin("Bodegas Hidalgo Gitana Manzanilla Jerez La Gitana, NV");
	gaver[235] = new Vin("Ravines Riesling Finger Lakes Dry, 2012");
	gaver[236] = new Vin("Chateau Ste. Michelle Sauvignon Blanc Horse Heaven Hills Horse Heaven Vineyard, 2012");
	gaver[237] = new Plate ("James Horner: Titanic: Music from the Motion Picture");
	gaver[238] = new Bok("Madeleine L'Engle: An Acceptable Time");
	gaver[239] = new Plate ("Metallica: Metallica");
	gaver[240] = new Bok("Brian Keenan: An Evil Cradling");
	gaver[241] = new Plate ("Michael Jackson: Bad");
	gaver[242] = new Bok("William Faulkner: As I Lay Dying");
	gaver[243] = new Plate ("Pink Floyd: The Wall");
	gaver[244] = new Bok("Michael Moorcock: Behold the Man");
	gaver[245] = new Plate ("ABBA: ABBA Gold: Greatest Hits");
	gaver[246] = new Bok("Aldous Huxley: Beyond the Mexique Bay");
	gaver[247] = new Plate ("Britney Spears: ...Baby One More Time");
	gaver[248] = new Bok("James Ellroy: Blood's a Rover");
	gaver[249] = new Plate ("Norah Jones: Come Away with Me");
	gaver[250] = new Plate ("U2: The Joshua Tree");
	gaver[251] = new Plate ("Backstreet Boys: Millennium");
	gaver[252] = new Plate ("TLC: CrazySexyCool");
	gaver[253] = new Plate ("Eminem: The Marshall Mathers LP");
	gaver[254] = new Plate ("Boston: Boston");
	gaver[255] = new Plate ("George Michael: Faith");
	gaver[256] = new Plate ("Michael Jackson: HIStory: Past, Present and Future, Book I");
	gaver[257] = new Plate ("Prince & The Revolution: Purple Rain");
	gaver[258] = new Plate ("Tina Turner: Private Dancer");


    }


    public Gave hentGave() {
	Gave nesteGave = null;
	if (nesteGaveNr < 600) {
	    nesteGave = gaver[nesteGaveNr % ANTALLGAVER];
	    nesteGaveNr++;
	}
	return nesteGave;
    }

}

class Bok implements Gave {

    private String kat, id;

    Bok ( String i ) {
	kat = "bok";
	id = i;
    }

    public String kategori() {
	return kat;
    }

    public String gaveId() {
	return id;
    }

}

class Plate implements Gave {

    private String kat, id;

    Plate ( String i ) {
	kat = "cd";
	id = i;
    }

    public String kategori() {
	return kat;
    }

    public String gaveId() {
	return id;
    }

}

class Vin implements Gave {

    private String kat, id;

    Vin ( String i ) {
	kat = "vin";
	id = i;
    }

    public String kategori() {
	return kat;
    }

    public String gaveId() {
	return id;
    }

}
